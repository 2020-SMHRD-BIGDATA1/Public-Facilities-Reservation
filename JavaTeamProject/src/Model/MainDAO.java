package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import View.LoginGUI;

public class MainDAO {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;

	
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

	private void close() {

		try {
			if (rs != null) {
				rs.close();
			}
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

	
	
	public int update(MemberVO vo) {
		int cnt = 0;
		
		getConnection();
	
		
		try {
			//UPDATE SET WHERE
			String sql = "UPDATE MEMBERS SET pw = ?, name = ?, age = ?, PHONE = ?, mail = ?, Address = ? WHERE user_id =?";
			pst = conn.prepareCall(sql);
			
			
			pst.setString(1, vo.getPw());
			pst.setString(2, vo.getName());
			pst.setInt(3, vo.getAge());
			pst.setString(4, vo.getPhone());
			pst.setString(5, vo.getMail());
			pst.setString(6, vo.getAddress());
			pst.setString(7,LoginGUI.controller.getLoginUser().getId());
			
			cnt =pst.executeUpdate();
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}finally {
			close();
		}
		
		return cnt;
	}

	public String getpw(MemberVO vo) {
		getConnection();
		
		String sql= "select pw from members where user_id=?";
		String pw = null;
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1,vo.getId() );
			rs=pst.executeQuery();
			
			if(rs.next()) {
				pw=rs.getString("pw");
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return pw ;
	}

	
}
