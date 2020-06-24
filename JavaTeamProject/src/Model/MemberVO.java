package Model;

public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private int age;
	private String phone;
	private String address;
	private String mail;

	public MemberVO(String id, String pw, String name, int age, String phone, String address, String mail) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.mail = mail;
	}

	public MemberVO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public MemberVO(String pw, String name, int age, String phone, String address, String mail){
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.mail = mail;
	}




	public MemberVO(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
