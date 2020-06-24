package Controller;

import Model.ReserVO;
import Model.ReservationDAO;
import Model.fcnamevo;
import Model.reservationvo;

public class Reservation_1Controller {
	ReservationDAO dao = new ReservationDAO();
	private static reservationvo vo = new reservationvo("df", "df", 50);

	public int getpoint() {

		int point = dao.getpoint();

		return point;
	}

	public int getfee() {

		int fee = dao.getfee();

		return fee;
	}

	public static reservationvo getVo() {
		return vo;
	}

	public static void setVo(reservationvo vo) {
		Reservation_1Controller.vo = vo;
	}

	public String getphone() {

		String phone = dao.getphone();

		return phone;
	}

	public int insert(String string, int cnt, String title, String body) {

		int count = dao.insert(string, cnt, title, body);

		return count;

	}

	public String getvision() {

		String division = dao.getdivision();

		return division;
	}

	public String getweekday() {

		String weekday = dao.getweekday();

		return weekday;
	}

	public String getweekend() {

		String weekend = dao.getweekend();

		return weekend;
	}

	public String gethomepage() {

		String homepage = dao.gethomepage();

		return homepage;
	}

	public String getpeople() {

		String people = dao.getpeople();

		return people;
	}

	public char getcharge() {

		char charge = dao.getcharge();
		return charge;
	}

	public String getclosure() {

		String closure = dao.getclosure();

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







	public String getfac_id(String fac_name) {
	  
		String fac_id =dao.getfac_id(fac_name);
		
		return fac_id;
	}

}
