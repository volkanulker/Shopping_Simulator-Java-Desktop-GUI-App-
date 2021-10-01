package Concretes;
import Abstracts.Person;
import Entities.CreditCard;

public class Customer extends Person {
	private CreditCard credit_card;

	public Customer(String first_name, String last_name, String phone, String identity_no, String user_name, String password) {
		super(first_name, last_name, phone, identity_no, user_name, password);
		
	}

	public CreditCard getCredit_card() {
		return credit_card;
	}

	public void setCredit_card(CreditCard credit_card) {
		this.credit_card = credit_card;
	}
	
	public void addToBasket() {
		
	}
	
	public void removeFromBasket( ) {
	}
	
	public void buyProduct() {
		
	}
}
