package Model;

public class RoomMatchingVO {
	private String iD;
	private String addnum;
	private String title;
	private String body;
	private int Fac_ID;

	public RoomMatchingVO(int Fac_ID, String iD, String addnum, String title, String body) {
		this.iD = iD;
		this.addnum = addnum;
		this.title = title;
		this.body = body;
		this.Fac_ID = Fac_ID;
	}

	public int getFac_ID() {
		return Fac_ID;
	}

	public void setFac_ID(int fac_ID) {
		Fac_ID = fac_ID;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String getAddnum() {
		return addnum;
	}

	public void setAddnum(String addnum) {
		this.addnum = addnum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
