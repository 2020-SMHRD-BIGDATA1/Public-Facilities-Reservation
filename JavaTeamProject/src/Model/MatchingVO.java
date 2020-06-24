package Model;

public class MatchingVO {
	private int Fac_ID;
	private String name;
	private String division;
	private String closure;
	private String weekday;
	private String weekend;
	private String charge;

	public int getFac_ID() {
		return Fac_ID;
	}

	public void setFac_ID(int fac_ID) {
		Fac_ID = fac_ID;
	}

	private int pay;
	private int people;
	private String address;
	private String phone;
	private String homepage;
	private String img;

	public MatchingVO(int Fac_ID, String name, String division, String closure, String weekday, String weekend,
			String charge, int pay, int people, String address, String phone, String homepage, String img) {
		this.Fac_ID = Fac_ID;
		this.name = name;
		this.division = division;
		this.closure = closure;
		this.weekday = weekday;
		this.weekend = weekend;
		this.charge = charge;
		this.pay = pay;
		this.people = people;
		this.address = address;
		this.phone = phone;
		this.homepage = homepage;
		this.img = img;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public MatchingVO(int Fac_ID,String Name, String addr, String time, String img,String Closure,String charge) {
		this.Fac_ID = Fac_ID;
		this.name = Name;
		this.address = addr;
		this.weekday = time;
		this.img = img;
		this.closure=Closure;
		this.charge=charge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getClosure() {
		return closure;
	}

	public void setClosure(String closure) {
		this.closure = closure;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}

	public String getWeekend() {
		return weekend;
	}

	public void setWeekend(String weekend) {
		this.weekend = weekend;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

}
