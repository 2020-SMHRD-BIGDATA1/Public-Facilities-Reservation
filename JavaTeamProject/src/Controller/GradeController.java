package Controller;

import Model.GradeDAO;
import Model.GradeVO;

public class GradeController {
	private GradeDAO dao= new GradeDAO();
	private static GradeVO userReview;
	
	public static GradeVO getLoginUser() {
		return userReview;
	}
	public void setLoginUser(GradeVO loginUser) {
		this.userReview = userReview;
	}
	
	
}
