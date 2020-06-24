package Controller;





import Model.MemberDAO;
import Model.MemberVO;



public class MemberManagementSystem {
	private MemberDAO dao = new MemberDAO();
	private MemberVO loginUser;
	private MemberVO id_check;
	
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
	

	public boolean check(MemberVO id_check) {
		id_check = dao.selectOne(id_check);
		if(id_check == null) {
			return false;
		}else {
			return true;
		}
		
	}

	public String check(String id) {
		return dao.check_id(id);
		
	}

	
	public int insertpoint(String point) {

		int cnt=dao.insertpoint(point);
		
	
		return cnt;
	}

	
		
		
	
	
	
}
			
