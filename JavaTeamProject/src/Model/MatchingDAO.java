package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;

import View.MatchingGUI;

public class MatchingDAO {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	
	
	
	private void getConnection() {

		// 1.JDBC드라이버 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			// 2.DB연결
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void close() {
		// 6.DB연결종료
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


	public String division(String place){
		String result = "";
		
		getConnection();
		String sql = "SELECT * FROM PUBLICS WHERE DIVISION=?";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1,place);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				result = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return result;
	}
	public String addr(String place){
		String result = "";
		
		getConnection();
		String sql = "SELECT * FROM PUBLICS WHERE DIVISION=?";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1,place);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				result = rs.getString(9);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return result;
	}
	public String time(String place){
		String result = "";
		
		getConnection();
		String sql = "SELECT * FROM PUBLICS WHERE DIVISION=?";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1,place);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				result = rs.getString(4);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		
		return result;
	}

	public String img(String place) {
		String result = "";
		
		getConnection();
		String sql = "SELECT * FROM PUBLICS WHERE DIVISION=?";
		
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1,place);
			rs = pst.executeQuery();
			
			if (rs.next()) {
				result = rs.getString(12);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}
}
