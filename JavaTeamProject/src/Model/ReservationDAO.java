package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Controller.Reservation_1Controller;
import View.LoginGUI;

public class ReservationDAO {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
//	private ResultSet rev_rs;
//	private int cnt;
	
	LoginGUI logingui= new LoginGUI();

	private void getconnection() {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
//			System.out.println("db���Ἲ��");
			} else {
				System.out.println("db�������");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	};

	private void close() {
		try {
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int getpoint() {
		getconnection();
		int point = 0;

		String sql = "select point from members where id=?";

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, logingui.controller.getLoginUser().getId());
			rs = pst.executeQuery();

			if (rs.next()) {
				point = rs.getInt("point");
				System.out.println(point);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return point;
	}

	public int getfee() {
		
		getconnection();
		int fee = 0;

		String sql = "select pay from Publics where NAME=?";

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, "ǳ��ü���ü����� �౸��");
			rs = pst.executeQuery();

			if (rs.next()) {
				fee = rs.getInt("pay");
				System.out.println(fee);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return fee;
	}




	public String getphone() {
		
		getconnection();
		
		String sql= "select phone from publics where name=?";
		String phone = null;
		
		try {
			pst= conn.prepareStatement(sql);
			pst.setString(1,"ǳ��ü���ü����� �౸��");
			rs=pst.executeQuery();
			
			if(rs.next()) {
				
				phone=rs.getString("phone");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		
		return phone;
	}

	public int insert(String string, int cnt, String title, String body) {
		
        getconnection();
		
		String sql= "insert into MemberMactching values(?,?,?,?)";
		int count = 0;
		try {
			pst= conn.prepareStatement(sql);
			pst.setString(1,string);
			pst.setInt(2, cnt);
			pst.setString(3,title);
			pst.setString(4,body);
			count=pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		
		return count;
	}

	public String getdivision() {
	
		getconnection();
			
			String sql= "select division from publics where name=?";
			
			String division=null;
			try {
				pst= conn.prepareStatement(sql);
				pst.setString(1,"ǳ��ü���ü����� �౸��");
				rs=pst.executeQuery();
				
				if(rs.next()) {
					
				division=rs.getString("division");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close();
			}

			
			return division;
		
	}

	public String getclosure() {
		
		getconnection();
		
		String sql= "select closure from publics where name=?";
		
		String closure=null;
		try {
			pst= conn.prepareStatement(sql);
			pst.setString(1,"ǳ��ü���ü����� �౸��");
			rs=pst.executeQuery();
			
			if(rs.next()) {
				
			closure=rs.getString("closure");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		
		return closure;
	
}

	public String getweekday() {
		
		getconnection();

		String sql = "select weekday from publics where name=?";

		String weekday = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, "ǳ��ü���ü����� �౸��");
			rs = pst.executeQuery();

			if (rs.next()) {

				weekday = rs.getString("weekday");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return weekday;
	}


	public String getweekend() {
		
		getconnection();

		String sql = "select weekend from publics where name=?";

		String weekend = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, "ǳ��ü���ü����� �౸��");
			rs = pst.executeQuery();

			if (rs.next()) {

				weekend = rs.getString("weekend");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return weekend;
	}

	public String gethomepage() {
		getconnection();

		String sql = "select homepage from publics where name=?";

		String homepage = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, "ǳ��ü���ü����� �౸��");
			rs = pst.executeQuery();

			if (rs.next()) {

				homepage = rs.getString("homepage");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return homepage;
	}

	public String getpeople() {
		
		getconnection();

		String sql = "select people from publics where name=?";

		String people = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, "ǳ��ü���ü����� �౸��");
			rs = pst.executeQuery();

			if (rs.next()) {

				people= rs.getString("people");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return people;
	
	}

	public char getcharge() {
		
		getconnection();

		String sql = "select charge from publics where name=?";

		char charge1 = 0;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, "ǳ��ü���ü����� �౸��");
			rs = pst.executeQuery();
		
			
			if (rs.next()) {

				int charge=rs.getInt("charge");
			    charge1=(char)charge;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return charge1;
	
	}
		

	}

	
