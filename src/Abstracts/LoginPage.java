package Abstracts;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Concretes.Customer;
import Pages.CustomerLoginPage;



public abstract class LoginPage extends JFrame {
	private final Color EBONY = Color.decode("#0A0708");
	private final Color PEWTER = Color.decode("#B1B1B1");
	
	private HashMap loginInfo;
	private final Color TEXT_COLOR =EBONY;
	private final Color RIGHT_PANEL_COLOR = Color.decode("#3f72af");


	private String pageTitle ;
	private Customer registeredCustomer;
	private JButton loginButton;
	private JLabel passwordLabel;
	private JLabel usernameLabel;

	private JPanel leftPanel;
	private JLabel loginIcon;
	private JPanel rightPanel;



	private JPanel labelPanel;
	private JLabel customerLoginLabel;

	private final Font TEXT_FONT = new Font("Lucida Console", Font.BOLD, 18) ;
	private final Font BUTTON_FONT = new Font("Lucida Console", Font.BOLD, 16);
	private JTextField idField;
	private JPasswordField passwordField;
	private JButton registerButton;
	
	public abstract void login();


	/**
	 * Create the frame.
	 */
	public LoginPage(Customer customer) {
		this.registeredCustomer=customer;
		createUI();
		
		
	}
	
	
	private void createUI() {
		// <<----------------------------------------- MAIN FRAME  ------------------------------------->
		this.pageTitle =  "Shopping System - " + " Login Page";
		this.setBackground(this.RIGHT_PANEL_COLOR);
		this.setResizable(false);
		this.setTitle(this.pageTitle);
		this.setBounds(100, 100, 600, 600);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		// <<----------------------------------------- LEFT PANEL  ------------------------------------->
		leftPanel =  new JPanel();
		leftPanel.setBackground(EBONY);
		leftPanel.setBounds(0, 0, 277, 571);
		this.getContentPane().add(leftPanel);
		leftPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		// <<----------------------------------------- LOGIN ICON  ------------------------------------->
		loginIcon= new JLabel("");
		leftPanel.add(loginIcon);
		loginIcon.setIcon(new ImageIcon(CustomerLoginPage.class.getResource("/images/loginIcon.png")));
		loginIcon.setHorizontalAlignment(SwingConstants.CENTER);
		
		// <<----------------------------------------- RIGHT PANEL  ------------------------------------->
		rightPanel= new JPanel();
		rightPanel.setBackground(PEWTER);
		rightPanel.setBorder(new EmptyBorder(0,30,200,30));
		rightPanel.setBounds(276, 195, 318, 376);
		this.getContentPane().add(rightPanel);
		rightPanel.setLayout(null);
		
		usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usernameLabel.setBounds(10, 69, 111, 30);
		rightPanel.add(usernameLabel);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setBounds(10, 122, 111, 30);
		rightPanel.add(passwordLabel);
		// <<----------------------------------------- ID FIELD  ------------------------------------->
		idField = new JTextField();
		idField.setBounds(128, 69, 165, 30);
		rightPanel.add(idField);
		idField.setColumns(10);
		idField.setFont(new Font("Lucida Console", Font.BOLD, 11));
		rightPanel.add(idField);

		// <<----------------------------------------- PASSWORD FIELD  ------------------------------------->
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Lucida Console", Font.BOLD, 14));
		passwordField.setBounds(128, 122, 165, 30);
		rightPanel.add(passwordField);

		// <<----------------------------------------- LOGIN BUTTON  ------------------------------------->
		loginButton = new JButton("Login");
		loginButton.setBackground(EBONY);
		loginButton.setForeground(PEWTER);
		loginButton.setFocusable(false);
		loginButton.setFont(BUTTON_FONT);
		loginButton.addActionListener( e-> {
			this.login();
		});
		loginButton.setBounds(10, 205, 130, 38);
		rightPanel.add(loginButton);
		
		
		// <<----------------------------------------- REGISTER BUTTON  ------------------------------------->
		registerButton = new JButton("Register");
		registerButton.setBackground(EBONY);
		registerButton.setForeground(PEWTER);
		registerButton.setBounds(163, 205, 130, 38);
		registerButton.addActionListener(e -> {
			this.register();
				});
		registerButton.setFont(BUTTON_FONT);
		rightPanel.add(registerButton);

		// <<----------------------------------------- LABEL PANEL  ------------------------------------->
		labelPanel = new JPanel();
		labelPanel.setBackground(PEWTER);
		labelPanel.setBounds(276, 0, 318, 195);
		getContentPane().add(labelPanel);
		labelPanel.setLayout(new CardLayout(0, 0));
		// <<----------------------------------------- CUSTOMER LOGIN LABEL  ------------------------------------->
		customerLoginLabel = new JLabel("Customer Login");
		customerLoginLabel.setForeground(TEXT_COLOR);
		customerLoginLabel.setFont(TEXT_FONT);
		customerLoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		labelPanel.add(customerLoginLabel, "name_180707627312800");
		this.setVisible(true);
	}
	
	
	public void register() {
		System.out.println("Register Method is called.");
	}
	
	
	public String getUserID() {
		return this.idField.getText();
	}
	
	public String getUserPassword() {
		return String.valueOf(passwordField.getPassword());
	}
	
	public void setPasswordField(String newText) {
		this.passwordField.setText(newText);
	}
	
	public boolean checkInputLengths(String ID , String password) {
	        if(ID.length() == 0 && password.length() == 0){
	            JOptionPane.showMessageDialog(this, "User ID and Password can't be blank.","Alert",JOptionPane.WARNING_MESSAGE);
	            return true;
	        }
	        else if(ID.length() == 0) {
	            JOptionPane.showMessageDialog(this, "User ID can't be blank.","Alert",JOptionPane.WARNING_MESSAGE);
	            return true;
	        }
	        else if(password.length() == 0) {
	            JOptionPane.showMessageDialog(this, "Password can't be blank.","Alert",JOptionPane.WARNING_MESSAGE);
	            return true;
	        }
	        return false;
	    }
	
    public boolean checkUserInputs(String ID , String password) {
        if(isUsernameTrue(ID)) {
            if(loginInfo.get(ID).equals(password)) // Succesfull Login
            	return true;
            else{// Wrong Password
                JOptionPane.showMessageDialog(this, "You entered wrong password.","Alert",JOptionPane.WARNING_MESSAGE);
                this.setPasswordField("");
                return false;
            }

        }
        else{ // Wrong User ID
            JOptionPane.showMessageDialog(this, "You entered wrong USER ID or Password.","Alert",JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    private boolean isUsernameTrue(String ID) {
        return loginInfo.containsKey(ID);
    }
    
    
    public void setLoginInfo(HashMap loginInfo) {
    	this.loginInfo = loginInfo;
    }
}
