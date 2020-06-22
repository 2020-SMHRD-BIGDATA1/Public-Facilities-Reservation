package Controller;

import Model.MemberDAO;
import Model.MemberVO;

public class MemberManagementSystem {
	private MemberDAO dao = new MemberDAO();
	private MemberVO loginUser;
	
	public MemberVO getLoginUser() {
		return loginUser;
	}
	
	public boolean login(MemberVO user) {
		loginUser = dao.selectOne(user);
		if(loginUser == null) {
			return false;
		}else {
			return true;
		}
	}
	
	public int join(MemberVO joinUser) {
		int cnt = dao.insert(joinUser);
		return cnt;
	}
}
			
