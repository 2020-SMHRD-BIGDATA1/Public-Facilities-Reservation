package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Controller.Reservation_1Controller;
import View.LoginGUI;

	public class MemberDAO {
		private Connection conn;
		private PreparedStatement pst;
		private ResultSet rs;
		LoginGUI logingui = new LoginGUI();
		Reservation_1Controller re_controller =new Reservation_1Controller();
		
		
		
		private void close() {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pst != null) {
					pst.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public MemberVO selectOne(MemberVO user) {
		MemberVO loginUser = null;
		
		getConnection();
		
		try {
			String sql = "SELECT * FROM MEMBERS WHERE USER_ID = ? AND PW = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getId());
			pst.setString(2, user.getPw());
			rs = pst.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString("user_id");
				String pw = rs.getString("pw");
				String name=rs.getString("name");
				int age =rs.getInt("age");
				String phone=rs.getString("phone");
				String address=rs.getString("address");
				String mail=rs.getString("mail");
			
				loginUser = new MemberVO(id, pw, name, age, phone, address, mail);						
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
			return loginUser;
	}
	
	public int insert(MemberVO joinUser) {
		getConnection();
		String sql = "insert into members values(?, ?, ?, ?, ?, ?, ?, 0)";
		int row = 0;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, joinUser.getId());
			pst.setString(2,  joinUser.getPw());
			pst.setString(3, joinUser.getName());
			pst.setInt(4, joinUser.getAge());
			pst.setString(5, joinUser.getPhone());
			pst.setString(6, joinUser.getAddress());
			pst.setString(7, joinUser.getMail());
			
			row = pst.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return row;
	}
	
	public MemberVO check(MemberVO id_check) {
		MemberVO id_duple = null;
		getConnection();
		
		try {
			String sql = "SELECT user_id FROM members WHERE user_id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, id_check.getId());
			rs = pst.executeQuery();
			if(rs.next()) {
				String id = rs.getString("user_id");
				id_duple = new MemberVO(id);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
			return id_duple;
	}

	public String check_id(String id) {

		
		getConnection();
		String cid = "";
		try {
			String sql = "SELECT user_id FROM members WHERE user_id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1,id);
			rs = pst.executeQuery();
			
			if(rs.next()) {
			cid = rs.getString("user_id");	
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
			return cid;
	}

	public  int insertpoint(int point) {
		getConnection();
		String sql = "update members set point=?  where user_id=?";
	int row=0;
		try {
			pst = conn.prepareStatement(sql);
//			pst.setInt(1, point+re_controller.getpoint());
      		pst.setInt(1, re_controller.getpoint());
			pst.setString(2, LoginGUI.controller.getLoginUser().getId() );
	
			row = pst.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	
		return row;
		
		
		
		
	}

	public int updatepoint(int remainpoint) {
		
		getConnection();
		String sql = "update members set point=? where user_id=?";
		int row = 0;
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, remainpoint);
			pst.setString(2, LoginGUI.controller.getLoginUser().getId() );

			
			
			row = pst.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return row;
	}
		
		
		
	
	}

	
				
					
				
