package basketPageComponents;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



public class makePaymentCard extends JPanel {
	
	
	private final Color EBONY = Color.decode("#0A0708");
	private final Color PEWTER = Color.decode("#B1B1B1");
	
	private JTextField cardHolderEntry;
	private JLabel cardHolderLabel;
	private JTextField cardNoEntry;
	private JLabel cardNoLabel;
	private JTextField monthEntry;
	private JTextField yearEntry;
	private JTextField cvvEntry;
	private JLabel validThruLabel;
	private JLabel cvvLabel;
	private JLabel dateSeparatorLabel;
	private JButton makePaymentButton;
	/**
	 * Create the panel.
	 */
	public makePaymentCard() {
		
		this.setBorder(new EmptyBorder(10, 30, 10, 30));
		this.setBounds(0, 181, 404, 270);
		this.setLayout(null);
		this.setBackground(PEWTER);
		
		cardHolderEntry = new JTextField();
		cardHolderEntry.setFont(new Font("Tahoma", Font.BOLD, 11));
		cardHolderEntry.setBounds(10, 36, 305, 20);
		this.add(cardHolderEntry);
		cardHolderEntry.setColumns(10);
		
		cardHolderLabel = new JLabel("Card Holder Name");
		cardHolderLabel.setFont(new Font("Lucida Console", Font.BOLD, 14));
		cardHolderLabel.setBounds(10, 11, 170, 14);
		this.add(cardHolderLabel);
		
		cardNoEntry = new JTextField();
		cardNoEntry.setFont(new Font("Tahoma", Font.BOLD, 11));
		cardNoEntry.setBounds(10, 92, 305, 20);
		this.add(cardNoEntry);
		cardNoEntry.setColumns(10);
		
		cardNoLabel = new JLabel("Card Number");
		cardNoLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		cardNoLabel.setBounds(10, 67, 146, 14);
		this.add(cardNoLabel);
		
		monthEntry = new JTextField();
		monthEntry.setFont(new Font("Tahoma", Font.BOLD, 11));
		monthEntry.setBounds(10, 148, 65, 20);
		this.add(monthEntry);
		monthEntry.setColumns(10);
		
		yearEntry = new JTextField();
		yearEntry.setFont(new Font("Tahoma", Font.BOLD, 11));
		yearEntry.setBounds(102, 148, 65, 20);
		this.add(yearEntry);
		yearEntry.setColumns(10);
		
		cvvEntry = new JTextField();
		cvvEntry.setFont(new Font("Tahoma", Font.BOLD, 11));
		cvvEntry.setBounds(229, 148, 86, 20);
		this.add(cvvEntry);
		cvvEntry.setColumns(10);
		
		validThruLabel = new JLabel("Expiry Date");
		validThruLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		validThruLabel.setBounds(10, 123, 86, 14);
		this.add(validThruLabel);
		
		cvvLabel = new JLabel("CVV");
		cvvLabel.setFont(new Font("Lucida Console", Font.BOLD, 14));
		cvvLabel.setBounds(229, 123, 46, 14);
		this.add(cvvLabel);
		
		dateSeparatorLabel = new JLabel("/");
		dateSeparatorLabel.setFont(new Font("Lucida Console", Font.BOLD, 14));
		dateSeparatorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dateSeparatorLabel.setBounds(65, 151, 46, 14);
		this.add(dateSeparatorLabel);
		// <<------------------------------- MAKE PAYMENT BUTTON  ----------------------->
		makePaymentButton = new JButton("MAKE PAYMENT");
		makePaymentButton.setBackground(EBONY);
		makePaymentButton.setForeground(Color.white);
		makePaymentButton.setBounds(10, 192, 385, 48);
		add(makePaymentButton);
		
		
		
		
		setVisible(true);
		
	}
	public JButton getMakePaymentButton() {
		return makePaymentButton;
	}
	public void setMakePaymentButton(JButton makePaymentButton) {
		this.makePaymentButton = makePaymentButton;
	}
	public JTextField getCardNoEntry() {
		return cardNoEntry;
	}
	public void setCardNoEntry(JTextField cardNoEntry) {
		this.cardNoEntry = cardNoEntry;
	}
	public JTextField getMonthEntry() {
		return monthEntry;
	}
	public void setMonthEntry(JTextField monthEntry) {
		this.monthEntry = monthEntry;
	}
	public JTextField getYearEntry() {
		return yearEntry;
	}
	public void setYearEntry(JTextField yearEntry) {
		this.yearEntry = yearEntry;
	}
	public JTextField getCvvEntry() {
		return cvvEntry;
	}
	public void setCvvEntry(JTextField cvvEntry) {
		this.cvvEntry = cvvEntry;
	}
	public JTextField getCardHolderEntry() {
		return cardHolderEntry;
	}
	public void setCardHolderEntry(JTextField cardHolderEntry) {
		this.cardHolderEntry = cardHolderEntry;
	}
	
	
	
	
	

	
	
	
	
	
	

}
