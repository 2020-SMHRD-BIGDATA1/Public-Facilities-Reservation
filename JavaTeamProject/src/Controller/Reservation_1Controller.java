package Controller;

import Model.ReservationDAO;
import Model.reservationvo;

public class Reservation_1Controller {
	ReservationDAO dao= new ReservationDAO();
	private static reservationvo vo= new reservationvo("df","df",50);
	  
   
			

	public int getpoint() {

		int point= dao.getpoint();
		
		return point;
	}




	public int getfee() {
	
		int fee= dao.getfee();
		
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
		
		int count= dao.insert(string, cnt, title, body);
		
		 return count;
		
	}
	
	

}
