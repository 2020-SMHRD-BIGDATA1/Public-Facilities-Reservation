package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import View.LoginGUI;

public class GradeDAO {
	int cnt = 0;

	private static Connection conn;
	private static PreparedStatement pst;
	private static ResultSet rs;

	private static void getConnection() {
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

	private static void close() {
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

//	public static ArrayList<GradeVO> selectAll() {
////		ArrayList<GradeVO> list = new ArrayList<GradeVO>();
//		getConnection();
//		try {
//			String sql = "select*from Ratings where id=?";
//			pst = conn.prepareStatement(sql);
//			pst.setString(1,LoginGUI.controller.getLoginUser().getId());
//			rs = pst.executeQuery();
//
//			while (rs.next()) {
//				String name = rs.getString("Name");
//				String rating = rs.getString("Rating");
//				String review = rs.getString("Review");
//				GradeVO vo = new GradeVO(rating, review);
////				list.add(vo);
//
//			}} catch (SQLException e) {
//
//				e.printStackTrace();
//			}finally {
//				close();
//			}
//
//			return list;
//		}
	public int insert(GradeVO userReview) {
		getConnection();// ¿¬°á
		String sql = "insert into Ratings values(?,?,?,?)";
		int row = 0;
		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, userReview.getId());
			pst.setString(2, userReview.getName());
			pst.setString(3, userReview.getRating());
			pst.setString(4, userReview.getReview());
			row = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}

	public GradeVO search() {

		GradeVO result = null;

		getConnection();
		try {
			String sql = "select * from Ratings where fac_name = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1,"dsfsd" );
			rs = pst.executeQuery();

			while (rs.next()) {
				String name = rs.getString(2);
				String rating = rs.getString(3);
				String review = rs.getString(4);
				String id = LoginGUI.controller.getLoginUser().getId();

				result = new GradeVO(id, name, rating, review);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return result;

	}

	public static GradeVO select() {
		GradeVO vo = null;
		getConnection();
		try {
			String sql = "select*from Ratings where user_id=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, LoginGUI.controller.getLoginUser().getId());
			rs = pst.executeQuery();

			while (rs.next()) {
				String name = rs.getString("fac_Name");
				String rating = rs.getString("Rating");
				String review = rs.getString("Review");
				vo = new GradeVO(name,rating, review);
				System.out.println("asd"+rs.getString("fac_Name"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return vo;
	}
}
