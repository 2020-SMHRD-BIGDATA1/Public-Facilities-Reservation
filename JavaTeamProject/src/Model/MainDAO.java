package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

	
	
	public int update(MainVO vo) {
		int cnt = 0;
		
		getConnection();
	
		
		try {
			//UPDATE SET WHERE
			String sql = "UPDATE Publics SET  pw = ?, name = ?, addr = ?, email=?, phone=?, point=?  WHERE NAME =?";
			pst = conn.prepareCall(sql);
			
			
			pst.setString(1, vo.getPw());
			pst.setString(2, vo.getName());
			pst.setString(3, vo.getAddr());
			pst.setString(4, vo.getEmail());
			pst.setString(5, vo.getPhone());
			pst.setString(6, vo.getPoint());
			pst.setString(7, vo.getName());
			
			cnt =pst.executeUpdate();
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}finally {
			close();
		}
		
		return cnt;
	}

	
	
}
