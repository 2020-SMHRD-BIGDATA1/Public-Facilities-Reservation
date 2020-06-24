package Model;

public class MatchingVO {
	private String name;
	private String division;
	private String closure;
	private String weekday;
	private String weekend;
	private String charge;
	private int pay;
	private int people;
	private String address;
	private String phone;
	private String homepage;

	public MatchingVO(String name, String division, String closure, String weekday, String weekend, String charge,
			int pay, int people, String address, String phone, String homepage) {
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
	}

	public MatchingVO(MatchingVO division) {
	}

	public MatchingVO(String division, String address) {
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
