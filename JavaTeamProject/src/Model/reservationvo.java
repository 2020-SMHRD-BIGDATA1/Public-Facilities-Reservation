package Model;

public class reservationvo {
	
	private String id;
	private String pw;
	private int point;
	
	
	
	public reservationvo(String id, String pw, int point) {
		super();
		this.id = id;
		this.pw = pw;
		this.point = point;
	}
	
	
	public reservationvo(String id) {
		super();
		this.id = id;

	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}
	
	

	
	
}
