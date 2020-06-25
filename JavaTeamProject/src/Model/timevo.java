package Model;

public class timevo {

	
	private String fcname;
	private String date;
	private String time;
	
	
	public timevo(String fcname, String date, String time) {
		super();
		this.fcname = fcname;
		this.date = date;
		this.time = time;
	}
	public String getFcname() {
		return fcname;
	}
	public void setFcname(String fcname) {
		this.fcname = fcname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	
	
	
}
