package Abstracts;

public abstract class Person {
	private final String firstName;
	private final String lastName;
	private String phone;
	
	private final String identityNo;
	private String userName;
	private String password;
	
	public Person(String first_name, String last_name, String phone, String identity_no, String user_name, String password) {
		this.firstName = first_name;
		this.lastName = last_name;
		this.phone = phone;
		
		this.identityNo = identity_no;
		this.userName= user_name;
		this.password = password;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getIdentityNo() {
		return identityNo;
	}


	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
