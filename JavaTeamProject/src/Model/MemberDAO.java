package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

	public class MemberDAO {
		private Connection conn;
		private PreparedStatement pst;
		private ResultSet rs;
		
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
			String sql = "SELECT * FROM MEMBERS WHERE ID = ? AND PW = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getID());
			pst.setString(2, user.getPw());
			
			if(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				loginUser = new MemberVO(id, pw, name);
						
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
		String sql = "insert into members values(?, ?, ?)";
		int row = 0;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, joinUser.getID());
			pst.setString(2,  joinUser.getPw());
			pst.setString(3, joinUser.getName());
			row = pst.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return row;
	}
	
	
}
