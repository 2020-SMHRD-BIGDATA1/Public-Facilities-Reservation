package Controller;

import java.util.ArrayList;

import Model.RatingVO;
import Model.ReserVO;
import Model.ReservationDAO;
import Model.fcnamevo;
import Model.reservationvo;

public class Reservation_1Controller {
	ReservationDAO dao = new ReservationDAO();
//	private static reservationvo vo = new reservationvo("df", "df", 50);

	public int getpoint() {

		int point = dao.getpoint();

		return point;
	}

	public int getfee() {

		int fee = dao.getfee();

		return fee;
	}

//	public static reservationvo getVo() {
//		return vo;
//	}
//
//	public static void setVo(reservationvo vo) {
//		Reservation_1Controller.vo = vo;
//	}

	public String getphone(String fc_name) {

		String phone = dao.getphone(fc_name);

		return phone;
	}

	public int insert(int num,String string, int cnt, String title, String body) {

		int count = dao.insert(num,string, cnt, title, body);

		return count;

	}

	public String getdvision(String fc_name) {

		String division = dao.getdivision(fc_name);

		return division;
	}

	public String getweekday(String fc_name) {

		String weekday = dao.getweekday(fc_name);

		return weekday;
	}
	
	
	public String getweekend(String fc_name) {

		String weekend = dao.getweekend(fc_name);

		return weekend;
	}

	public String gethomepage(String fc_name) {

		String homepage = dao.gethomepage(fc_name);

		return homepage;
	}

	public String getpeople(String fc_name) {

		String people = dao.getpeople(fc_name);

		return people;
	}

	public char getcharge() {

		char charge = dao.getcharge();
		return charge;
	}

	public String getclosure(String fc_name) {

		String closure = dao.getclosure(fc_name);

		return closure;

	}

	public String fcname(fcnamevo vo2) {

		return vo2.getfcName();
	}

	public void minuspoint() {



	}
	



	public int insertreservation(ReserVO revo) {
		
		int cnt=dao.insertReservation(revo);
		
		return cnt;
	}







	public int getfac_id(String fac_name) {
	  
		int fac_id =dao.getfac_id(fac_name);
		
		return fac_id;
	}
	

	public ArrayList<RatingVO> getrating(String name) {
		
       return dao.getrating(name);
	}

}
