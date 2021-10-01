package Pages;

import Abstracts.LoginPage;
import Concretes.Customer;

public class CustomerLoginPage extends LoginPage {
	private Customer customer;
	
	public CustomerLoginPage(Customer customer) {
		super(customer);
		IdandPasswords customerLoginInfo = new IdandPasswords();
		customerLoginInfo.addNewCustomer(customer);
		this.setLoginInfo(customerLoginInfo.getIdandPasswords());
	}

	@Override
	public void login() {
		
		String userID = this.getUserID();
        String userPassword = this.getUserPassword();

        if (!checkInputLengths(userID,userPassword)){
        	if(checkUserInputs(userID,userPassword)) {
        		  this.dispose();
                  new ShoppingPage();
                  System.out.println("Customer Logged in succesfully.");
        	}
        }		
	}

	@Override
	public void register() {
		System.out.println("Signup page is opened.");
		this.dispose();
		new RegisterPage();
		
	}
	
}
