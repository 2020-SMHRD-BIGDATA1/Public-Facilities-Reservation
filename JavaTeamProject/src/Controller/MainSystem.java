package Controller;

import Model.MainVO;
import model.MemberVO;
import Model.MainDAO;
import Model.MainVO;




public class MainSystem {
	
	private MainDAO dao = new MainDAO();
	private MainVO loginUser;
	
	
	
	
	
	public MainVO getLoginUser() {
		return loginUser;
	}
	public int Update(MainVO joinUser) {
		int cnt = dao.update(joinUser);
		return cnt;

	}



	
	
	
}
