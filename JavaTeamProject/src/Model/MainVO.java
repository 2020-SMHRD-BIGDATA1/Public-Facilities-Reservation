package Model;

public class MainVO {

	String Name;
	String id;
	String PW;
	String addr;
	String Phone;
	int point;
	public MainVO(String name, String id, String pW, String addr, String phone, int point) {
		
		this.Name = name;
		this.id = id;
		this.PW = pW;
		this.addr = addr;
		this.Phone = phone;
		this.point = point;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	
	
	
	
}
