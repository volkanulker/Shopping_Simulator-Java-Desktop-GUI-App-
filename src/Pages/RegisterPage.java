package Pages;

import java.awt.EventQueue;

import Extras.RoundedBorder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Concretes.Customer;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;


import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;

public class RegisterPage extends JFrame {
	
	
	private final Color EBONY = Color.decode("#0A0708");
	private final Color COOL_GRAY= Color.decode("#444444");
	private final Color PEWTER = Color.decode("#B1B1B1");

	private final Color TEXT_COLOR = EBONY;
	
	private JPanel contentPane;
	private JPanel rightPanel;
	private JPanel leftPanel;
	private JPanel titlePanel;
	private JPanel buttonPanel;
	private JPanel infoPanel;
	
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel identityNoLabel;
	private JLabel userNameLabel;
	private JLabel passwordLabel;
	private JLabel phoneLabel;

	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField identityNoField;
	private JTextField userNameField;
	private JPasswordField passwordField;
	private JTextField phoneField;
	
	private JLabel registerIcon;
	private JLabel registerTitle;
	private JButton registerButton;
	private JSeparator separator;
	
	/**
	 * Create the frame.
	 */
	public RegisterPage() {
		//<------------------------------- FRAME ------------------------>
		this.setTitle("Register Page");
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setBounds(100,100,600,600);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Shopping System - Register Page");
		//<------------------------------- LEFT PANEL ------------------------>
		leftPanel = new JPanel();
		leftPanel.setBackground(EBONY);
		leftPanel.setBounds(0, 0, 246, 571);
		contentPane.add(leftPanel);
		leftPanel.setLayout(new CardLayout(0, 0));
		
		//<------------------------------- REGISTER ICON ------------------------>
		registerIcon = new JLabel("");
		registerIcon.setIcon(new ImageIcon(RegisterPage.class.getResource("/images/signup.png")));
		registerIcon.setHorizontalAlignment(SwingConstants.CENTER);
		leftPanel.add(registerIcon, "name_10960089177100");
		
		//<------------------------------- RIGHT PANEL ------------------------>
		rightPanel = new JPanel();
		rightPanel.setBounds(245, 0, 339, 561);
		contentPane.add(rightPanel);
		rightPanel.setLayout(null);
		
		//<------------------------------- TITLE PANEL ------------------------>
		titlePanel = new JPanel();
		titlePanel.setBackground(PEWTER);
		titlePanel.setBounds(0, 0, 339, 95);
		rightPanel.add(titlePanel);
		titlePanel.setLayout(new CardLayout(0, 0));
		
		//<------------------------------- REGISTER TITLE ------------------------>
		registerTitle = new JLabel("Registration");
		registerTitle.setForeground(TEXT_COLOR);
		registerTitle.setVerticalAlignment(SwingConstants.BOTTOM);
		registerTitle.setFont(new Font("Lucida Console", Font.BOLD, 18));
		registerTitle.setHorizontalAlignment(SwingConstants.CENTER);
		titlePanel.add(registerTitle, "name_11402984785000");
		
		//<------------------------------- BUTON PANEL ------------------------>
		buttonPanel = new JPanel();
		buttonPanel.setBackground(PEWTER);
		buttonPanel.setBounds(0, 431, 339, 141);
		rightPanel.add(buttonPanel);
		buttonPanel.setLayout(new CardLayout(70, 40));
		
		//<------------------------------- REGISTER BUTTON ------------------------>
		registerButton = new JButton("Register");
		registerButton.setBackground(EBONY);
		registerButton.setForeground(PEWTER);
		registerButton.setBorder(new RoundedBorder(10));
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		registerButton.setFont(new Font("Lucida Console", Font.BOLD, 16));
		buttonPanel.add(registerButton, "name_13032033250100");
		
		//<------------------------------- INFO PANEL ------------------------>
		infoPanel = new JPanel();
		infoPanel.setBackground(PEWTER);
		infoPanel.setBounds(0, 95, 370, 336);
		rightPanel.add(infoPanel);
		infoPanel.setLayout(null);
		
		//<------------------------------- FIRST NAME FIELD ------------------------>
		firstNameField = new JTextField();
		firstNameField.setToolTipText("");
		firstNameField.setBounds(145, 60, 180, 25);
		infoPanel.add(firstNameField);
		firstNameField.setColumns(10);
		//<------------------------------- LAST NAME FIELD ------------------------>
		lastNameField = new JTextField();
		lastNameField.setBounds(145, 107, 180, 25);
		infoPanel.add(lastNameField);
		lastNameField.setColumns(10);
		//<------------------------------- IDENTITY NO FIELD ------------------------>
		identityNoField = new JTextField();
		identityNoField.setBounds(145, 154, 180, 25);
		infoPanel.add(identityNoField);
		identityNoField.setColumns(10);
		//<------------------------------- USERNAME FIELD ------------------------>
		userNameField = new JTextField();
		userNameField.setBounds(145, 248, 180, 25);
		infoPanel.add(userNameField);
		userNameField.setColumns(10);
		//<------------------------------- FIRSTNAME LABEL ------------------------>
		firstNameLabel = new JLabel("First Name:");
		firstNameLabel.setForeground(TEXT_COLOR);
		firstNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		firstNameLabel.setFont(new Font("Lucida Console", Font.BOLD, 14));
		firstNameLabel.setBounds(30, 60, 105, 25);
		infoPanel.add(firstNameLabel);
		//<------------------------------- LASTNAME LABEL ------------------------>
		lastNameLabel = new JLabel("LastName:");
		lastNameLabel.setForeground(TEXT_COLOR);
		lastNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lastNameLabel.setFont(new Font("Lucida Console", Font.BOLD, 14));
		lastNameLabel.setBounds(30, 107, 105, 25);
		infoPanel.add(lastNameLabel);
		//<------------------------------- IDENTITY NO LABEL ------------------------>
		identityNoLabel = new JLabel("Identity No:");
		identityNoLabel.setForeground(TEXT_COLOR);
		identityNoLabel.setFont(new Font("Lucida Console", Font.BOLD, 14));
		identityNoLabel.setBounds(30, 154, 105, 25);
		infoPanel.add(identityNoLabel);
		//<------------------------------- USERNAME LABEL ------------------------>
		userNameLabel = new JLabel("User Name:");
		userNameLabel.setForeground(TEXT_COLOR);
		userNameLabel.setFont(new Font("Lucida Console", Font.BOLD, 14));
		userNameLabel.setBounds(30, 248, 105, 25);
		infoPanel.add(userNameLabel);
		//<------------------------------- PASSWORD LABEL ------------------------>
		passwordLabel = new JLabel("Password:");
		passwordLabel.setForeground(TEXT_COLOR);
		passwordLabel.setFont(new Font("Lucida Console", Font.BOLD, 14));
		passwordLabel.setBounds(30, 295, 105, 25);
		infoPanel.add(passwordLabel);
		//<------------------------------- PASSWORD FIELD ------------------------>
		passwordField = new JPasswordField();
		passwordField.setBounds(145, 295, 180, 25);
		infoPanel.add(passwordField);
		//<------------------------------- PHONE FIELD ------------------------>
		phoneField = new JTextField();
		phoneField.setBounds(145, 201, 180, 25);
		infoPanel.add(phoneField);
		phoneField.setColumns(10);
		//<------------------------------- PHONE LABEL ------------------------>
		phoneLabel = new JLabel("Phone:");
		phoneLabel.setForeground(TEXT_COLOR);
		phoneLabel.setFont(new Font("Lucida Console", Font.BOLD, 14));
		phoneLabel.setBounds(30, 201, 105, 25);
		infoPanel.add(phoneLabel);
		//<------------------------------- SEPERATOR ------------------------>
		JSeparator separator = new JSeparator();
		separator.setBackground(COOL_GRAY);
		separator.setForeground(COOL_GRAY);
		separator.setBounds(10, 11, 315, 2);
		infoPanel.add(separator);
		this.setVisible(true);
	}
	
	void register() {
		String firstName = firstNameField.getText();
		String lastName = lastNameField.getText();
		String phone = phoneField.getText();
		String id = identityNoField.getText();
		String userName = userNameField.getText();
		String password = String.valueOf(passwordField.getPassword());
		System.out.println(firstName + "\t" + lastName + "\t" + phone + "\t" + id + "\t" + userName + "\t" + password );
		if(isCustomerInfoValid(firstName,lastName,phone,id,userName,password)) {
			Customer customer = new Customer(firstName,lastName,phone,id,userName,password);
			IdandPasswords idAndPasswords = new IdandPasswords();
			idAndPasswords.addNewCustomer(customer);
			System.out.println("Customer is created.");
			System.out.println("User is added to the database.");
			dispose();
			new CustomerLoginPage(customer);
		}
		
		
	}
	
	boolean isCustomerInfoValid(String first_name, String last_name, String phone, String identity_no, String user_name, String password) {
		if(first_name.length() == 0 || last_name.length() == 0 || phone.length() == 0 || identity_no.length() == 0 || user_name.length() == 0 || 
				password.length() == 0) {
			JOptionPane.showMessageDialog(this,"Text fields can not be empty.");  
			return false;
		} else if(phone.length() != 11) {
			JOptionPane.showMessageDialog(this,"Invalid phone number, please don't forget add 0 before your phone number. "); 
			return false;
		} else if(identity_no.length() != 11) {
			JOptionPane.showMessageDialog(this,"Invalid identity no, please check your identity number.");  
			return false;
		} else if(password.length() <6) {
			JOptionPane.showMessageDialog(this,"Password number must has greater than five number. ");  
			return false;
		}
		else {
			return true;
		}
	}
}
