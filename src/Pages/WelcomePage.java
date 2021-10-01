package Pages;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class WelcomePage extends JFrame {
	
	private final Color EBONY = Color.decode("#0A0708");
	private final Color COOL_GRAY= Color.decode("#444444");
	private final Color PEWTER = Color.decode("#B1B1B1");

	private final Font BUTTON_FONT = new Font("Lucida Console", Font.BOLD, 16);
	private final Font TEXT_FONT = new Font("Lucida Console", Font.BOLD, 18);
	
	private JPanel contentPane;
	private JPanel upperPanel;
	private JLabel pageText;
	private JPanel leftPanel;
	private JLabel customerIcon;
	private JPanel rightPanel;
	private JLabel adminIcon;
	private JPanel lowerLPanel;
	private JButton loginButton;
	/**
	 * Create the frame.
	 */
	public WelcomePage() {
		// <<----------------------------------------- MAIN FRAME  ------------------------------------->
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setTitle("Shopping System - Welcome Page");
	

		
		// <<----------------------------------------- UPPER PANEL  ------------------------------------->
		upperPanel = new JPanel();
		upperPanel.setBackground(EBONY);
		upperPanel.setBounds(0, 0, 594, 144);
		contentPane.add(upperPanel);
		upperPanel.setLayout(new CardLayout(0, 0));
		// <<----------------------------------------- UPPER TEXT  ------------------------------------->
		pageText = new JLabel("WELCOME TO SHOPPING SYSTEM");
		pageText.setForeground(Color.white);
		pageText.setFont(TEXT_FONT);
		
		pageText.setHorizontalAlignment(SwingConstants.CENTER);
		upperPanel.add(pageText, "name_185945567381100");
		
		// <<----------------------------------------- MIDDLE LEFT PANEL  ------------------------------------->
		leftPanel = new JPanel();
		leftPanel.setBackground(COOL_GRAY);
		leftPanel.setBounds(0, 142, 300, 300);
		contentPane.add(leftPanel);
		leftPanel.setLayout(new CardLayout(0, 0));
		// <<----------------------------------------- CUSTOMER ICON  ------------------------------------->
		customerIcon = new JLabel("");
		customerIcon.setIcon(new ImageIcon(WelcomePage.class.getResource("/images/customer.png")));
		customerIcon.setHorizontalAlignment(SwingConstants.CENTER);
		leftPanel.add(customerIcon, "name_185894745040600");
		
		// <<----------------------------------------- MIDDLE RIGHT PANEL  ------------------------------------->
		rightPanel = new JPanel();
		rightPanel.setBackground(COOL_GRAY);
		rightPanel.setBounds(298, 142, 296, 300);
		contentPane.add(rightPanel);
		rightPanel.setLayout(new CardLayout(0, 0));
		
		// <<----------------------------------------- ADMIN ICON  ------------------------------------->
		adminIcon = new JLabel("");
		adminIcon.setIcon(new ImageIcon(WelcomePage.class.getResource("/images/fcustomer.png")));
		adminIcon.setHorizontalAlignment(SwingConstants.CENTER);
		rightPanel.add(adminIcon, "name_185917697422600");
		
		// <<----------------------------------------- LOWER LEFT PANEL  ------------------------------------->
		lowerLPanel = new JPanel();
		lowerLPanel.setBackground(PEWTER);
		lowerLPanel.setBounds(0, 442, 594, 129);
		contentPane.add(lowerLPanel);
		lowerLPanel.setLayout(null);
		// <<----------------------------------------- JUMP TO LOGIN BUTTON  ------------------------------------->
		loginButton = new JButton("Jump To Login Page");
		loginButton.setBackground(EBONY);
		loginButton.setForeground(PEWTER);
		loginButton.setFont(BUTTON_FONT);
		loginButton.setFocusable(false);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new CustomerLoginPage(null);
			}
		});
		loginButton.setFont(new Font("Lucida Console", Font.BOLD, 18));
		loginButton.setBounds(130, 27, 334, 54);
		lowerLPanel.add(loginButton);
		
		this.setVisible(true);
		
	}
}
