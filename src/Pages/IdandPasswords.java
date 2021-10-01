package Pages;
import java.util.HashMap;

import Concretes.Customer;

public class IdandPasswords {
    private HashMap<String,String> logininfo = new HashMap<String,String>();
    IdandPasswords() {
        logininfo.put("admin","123456");
        logininfo.put("customer","123456");
    }

    public HashMap<String, String> getIdandPasswords(){
        return logininfo;
    }
    
    public void addNewCustomer(Customer customer) {
    	if(customer != null) {
    		logininfo.put(customer.getUserName(), customer.getPassword());
    	}
    	
    	
    }
    
}
