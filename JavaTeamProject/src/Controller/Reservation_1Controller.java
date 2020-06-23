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




	public String getvision() {
		
	String division=dao.getdivision();
		
		
		return division;
	}




	public String closure() {
		
	String closure=dao.getclosure();	
	
	     return closure;
	}




	public String weekday() {
		
		
   String weekday=dao.getweekday();	
			
		
		return weekday;
	}




	public String weekend() {
		
	String weekend=dao.getweekend();		
		
	     return weekend;
	}




	public String gethomepage() {
		
		String homepage=dao.gethomepage();	
		
		
		return homepage;
	}
	
	

}
