package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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



	

	public static ArrayList<GradeVO> selectAll() {
		ArrayList<GradeVO> list = new ArrayList<GradeVO>();
		getConnection();
		try {
			String sql = "select*from Ratings";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();

			while (rs.next()) {
				String name = rs.getString("Name");
				String rating = rs.getString("Rating");
				String review = rs.getString("Review");
				GradeVO vo = new GradeVO(rating, review);
				list.add(vo);

	
			}} catch (SQLException e) {

				e.printStackTrace();
			}finally {
				close();
			}

			return list;
		}
public int insert(GradeVO userReview) {
	getConnection();// ¿¬°á
	String sql="insert into Ratings values(?,?,?)";
	int row=0;
	try {
		pst=conn.prepareStatement(sql);
		
		pst.setString(1, userReview.getName());
		pst.setString(2, userReview.getRating());
		pst.setString(3, userReview.getReview());
		row=pst.executeUpdate();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return row;
}

public ArrayList<GradeVO> search(String gg) {
	
	ArrayList<GradeVO> list = new ArrayList<GradeVO>();
	GradeVO result = null;
	
	getConnection();
	try {
		String sql = "select * from Ratings where name = ?";
		pst = conn.prepareStatement(sql);
		pst.setString(1,gg);
		rs = pst.executeQuery();
		

		while (rs.next()) {
			String name = rs.getString(1);
			String rating = rs.getString(2);
			String review = rs.getString(3);
			
			result = new GradeVO(name, rating, review);
			list.add(result);
		}
	} catch (SQLException e) {

		e.printStackTrace();
	} finally {
		close();
	}
	

	return list;

}

}
