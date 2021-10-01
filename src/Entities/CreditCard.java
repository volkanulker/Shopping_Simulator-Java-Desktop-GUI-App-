package Entities;
public class CreditCard {
	private String no;
	private String owner_name;
	private String expiryMonth;
	private String expiryYear;
	private String cvv;
	private int balance;
	public CreditCard(String no, String owner_name,String expiryMonth,String expiryYear, String cvv, int balance) {
		this.no = no;
		this.owner_name = owner_name;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.cvv = cvv;
		this.balance = balance;
	}
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	
	public String getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public String getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
	
	
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
