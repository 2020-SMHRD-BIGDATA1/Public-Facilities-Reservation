package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
//			System.out.println("db연결성공");
			} else {
				System.out.println("db연결실패");
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

		String sql = "select point from members where user_id=?";

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

		String sql = "select pay from Publics where fac_NAME=?";

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, "풍영체육시설단지 축구장");
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




	public String getphone(String fc_name) {
		
		getconnection();
		
		String sql= "select phone from publics where fac_name=?";
		String phone = null;
		
		try {
			pst= conn.prepareStatement(sql);
			pst.setString(1,fc_name);
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

	public int insert(int num ,String string, int cnt, String title, String body) {
		
        getconnection();
		
		String sql= "insert into MemberMatching values(?,?,?,?,?)";
		int count = 0;
		try {
			pst= conn.prepareStatement(sql);
			pst.setInt(1,num);
			pst.setString(2,string);
			pst.setInt(3, cnt);
			pst.setString(4,title);
			pst.setString(5,body);
			count=pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		
		return count;
	}

	public String getdivision(String fc_name) {
	
		getconnection();
			
			String sql= "select division from publics where fac_name=?";
			
			String division=null;
			try {
				pst= conn.prepareStatement(sql);
				pst.setString(1,fc_name);
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

	public String getclosure(String fc_name) {
		
		getconnection();
		
		String sql= "select closure from publics where fac_name=?";
		
		String closure=null;
		try {
			pst= conn.prepareStatement(sql);
			pst.setString(1,fc_name);
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

	public String getweekday(String fc_name) {
		
		getconnection();

		String sql = "select weekday from publics where fac_name=?";

		String weekday = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, fc_name);
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


	public String getweekend(String fc_name) {
		
		getconnection();

		String sql = "select weekend from publics where fac_name=?";

		String weekend = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1,  fc_name);
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
	public String gethomepage(String fc_name) {
		getconnection();

		String sql = "select homepage from publics where fac_name=?";

		String homepage = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, fc_name);
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

	public String getpeople(String fc_name) {
		
		getconnection();

		String sql = "select people from publics where fac_name=?";

		String people = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, fc_name);
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
	public String getimg(String fc_name) {
		
		getconnection();

		String sql = "select img from publics where fac_name=?";

		String img = null;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, fc_name);
			rs = pst.executeQuery();

			if (rs.next()) {

				img= rs.getString("img");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return img;
	
	}
	public char getcharge() {
		
		getconnection();

		String sql = "select charge from publics where fac_name=?";

		char charge1 = 0;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, "풍영체육시설단지 축구장");
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

	public int getfac_id(String fac_name) {
		getconnection();

		String sql = "select fac_id from publics where fac_name=?";
		int	fac_id =0;
	
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, fac_name);
			rs = pst.executeQuery();
		   
		
			
			if (rs.next()) {

			fac_id=Integer.parseInt(rs.getString("fac_id"));
			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return fac_id;

	
}

	public int insertReservation(ReserVO revo) {
		 getconnection();

		 String sql= "insert into reservation values(?,?,?,?,?,?,?)";
			int count = 0;
			try {
				pst= conn.prepareStatement(sql);
				pst.setString(1,revo.getUser_id());
				pst.setInt(2, revo.getFac_id());
				pst.setString(3,revo.getFac_name());
				pst.setString(4,revo.getReserdate());
				pst.setString(5, revo.getUsedate());
				pst.setString(6,revo.getUsetime());
				pst.setString(7,revo.getFee());
				
				count=pst.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close();
			}

			
			return count;
		}

	public ArrayList<RatingVO> getrating(String name) {
		getconnection();

		String sql = "select id,rating,review from ratings where name=?";
		ArrayList<RatingVO> arr= new ArrayList<RatingVO>(); 
	
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();

			if (rs.next()) {
			
			String id= rs.getString("id");
			String rating= rs.getString("rating");
			String review= rs.getString("review");
			RatingVO ra_vo= new RatingVO(id, rating, review);
				
			arr.add(ra_vo);
			
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return arr;
		

	}

	}

	
