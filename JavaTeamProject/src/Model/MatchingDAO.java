package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

	public ArrayList<MatchingVO> divide(String place) {
		ArrayList<MatchingVO> list = new ArrayList<MatchingVO>();
		getConnection();
		String sql = "SELECT * FROM PUBLICS WHERE DIVISION=?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, place);
			rs = pst.executeQuery();

			while (rs.next()) {
				int Fac_ID = Integer.parseInt(rs.getString("Fac_ID"));
				String Name = rs.getString("fac_Name");
				String addr = rs.getString("ADDRESS");
				String time =rs.getString("WEEKDAY");
				String img = rs.getString("IMG");
				String closure =rs.getString("CLOSURE");
				String charge = rs.getString("CHARGE");
				MatchingVO vo = new MatchingVO(Fac_ID,Name,addr,time,img,closure,charge);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}
	
	public ArrayList<RoomMatchingVO> roomInfo() {
		ArrayList<RoomMatchingVO> infolist = new ArrayList<RoomMatchingVO>();
		getConnection();
		String sql = "SELECT * FROM MEMBERMATCHING";
		try {
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				int Fac_ID = Integer.parseInt(rs.getString("Fac_ID"));
				String ID = rs.getString("user_id");
				String addnum = rs.getString("addnum");
				String title =rs.getString("title");
				String body = rs.getString("body");
				RoomMatchingVO vo = new RoomMatchingVO(Fac_ID,ID,addnum,title,body);
				infolist.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return infolist;
	}
	



//	public String addr(String place) {
//		String result = "";
//
//		getConnection();
//		String sql = "SELECT * FROM PUBLICS WHERE DIVISION=?";
//
//		try {
//			pst = conn.prepareStatement(sql);
//			pst.setString(1, place);
//			rs = pst.executeQuery();
//
//			if (rs.next()) {
//				result = rs.getString(9);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//
//		return result;
//	}
//
//	public String time(String place) {
//		String result = "";
//
//		getConnection();
//		String sql = "SELECT * FROM PUBLICS WHERE DIVISION=?";
//
//		try {
//			pst = conn.prepareStatement(sql);
//			pst.setString(1, place);
//			rs = pst.executeQuery();
//
//			if (rs.next()) {
//				result = rs.getString(4);
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//
//		return result;
//	}
//
//	public String img(String place) {
//		String result = "";
//
//		getConnection();
//		String sql = "SELECT * FROM PUBLICS WHERE DIVISION=?";
//
//		try {
//			pst = conn.prepareStatement(sql);
//			pst.setString(1, place);
//			rs = pst.executeQuery();
//
//			if (rs.next()) {
//				result = rs.getString(12);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//		return result;
//	}
}
