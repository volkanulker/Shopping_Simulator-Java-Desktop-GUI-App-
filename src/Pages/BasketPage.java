package Pages;

//TODO: get products  from database that added to basket 

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import Entities.Address;
import Entities.CreditCard;
import Entities.Product;
import Extras.WrapLayout;
import basketPageComponents.BasketCard;
import basketPageComponents.makePaymentCard;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import java.util.ArrayList;
import java.util.Queue;

import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class BasketPage extends JFrame implements ItemListener {
	private ArrayList<BasketCard> basketCardList;

	private JPanel titlePanel;
	private JLabel titleLabel;
	private JPanel basketPanel;
	private final Border blackline = BorderFactory.createLineBorder(Color.black);
	private JPanel headerPanel;
	private JPanel productHeaderPanel;
	private JLabel iconHeaderLabel;
	private JPanel nameHeaderPanel;
	private JLabel nameHeaderLabel;
	private JPanel priceHeaderPanel;
	private JLabel priceHeaderLabel;
	private JPanel removeHeaderPanel;
	private JLabel buttonHeaderLabel;
	private JPanel quantityPanel;
	private JLabel quantityHeaderLabel;
	private JScrollPane scrollPane;
	private JPanel scrollPanel;
	private JPanel checkOutPanel;
	private JPanel totalPanel;
	private JLabel totalLabel;
	private JLabel priceLabel;
	private JPanel contentPane;
	
	private int subTotal ;

	private final Color IVORY = Color.decode("#f9f7f7");
	private final Color DARK_GREY = Color.decode("#222831");
	private final Color GREY = Color.decode("#393e46");
	private final Color BLACK = Color.decode("#212121");
	
	
	private final Color EBONY = Color.decode("#0A0708");
	private final Color COOL_GRAY= Color.decode("#444444");
	private final Color PEWTER = Color.decode("#B1B1B1");

	
	private JTextArea streetAddressEntry;
	private JLabel streetAddressHeader;
	private JSeparator addressSeparator;
	private JSeparator separator;
	private JSeparator cardSeparator;
	private JLabel cardLabel;
	private JPanel panel;
	private JTextField cityEntry;
	private JTextField townEntry;
	private JLabel cityLabel;
	private JLabel townLabel;
	private JLabel addressHeader;
	private Queue<Product> addedProducts;
	
	

	/**
	 * Create the frame.
	 */
	public BasketPage(Queue<Product> addedProducts) {
		this.addedProducts = addedProducts;
		this.basketCardList = new ArrayList<BasketCard>();
		this.subTotal = 0;
		// <<----------------------------------------- MAIN FRAME  ------------------------------------->
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setTitle("Shopping Simulator - Basket Page");
		contentPane = new JPanel();
		contentPane.setBackground(GREY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// <<----------------------------------------- TITLE PANEL  ------------------------------------->
		titlePanel = new JPanel();
		titlePanel.setBackground(EBONY);
		
		
		titlePanel.setForeground(Color.BLACK);
		titlePanel.setBounds(0, 0, 1184, 150);
		contentPane.add(titlePanel);
		titlePanel.setLayout(new CardLayout(0, 0));
		
		// <<----------------------------------------- TITLE LABEL  ------------------------------------->
		titleLabel = new JLabel("Basket Page");
		titleLabel.setForeground(IVORY);
		titleLabel.setFont(new Font("Lucida Console", Font.BOLD, 18));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titlePanel.add(titleLabel, "name_292241734876600");
		
		// <<----------------------------------------- BASKET PANEL  ------------------------------------->
		basketPanel = new JPanel();
		basketPanel.setBackground(DARK_GREY);
		basketPanel.setBounds(0, 148, 779, 613);
		contentPane.add(basketPanel);
		basketPanel.setLayout(null);

		// <<----------------------------------------- MAIN HEADER PANEL  ------------------------------------->
		headerPanel = new JPanel();
		headerPanel.setBackground(Color.WHITE);
		headerPanel.setBounds(10, 29, 759, 50);
		basketPanel.add(headerPanel);
		headerPanel.setLayout(null);
		// <<----------------------------------- PRODUCT HEADER PANEL  ------------------------>
		productHeaderPanel = new JPanel();
		productHeaderPanel.setBorder(blackline);
		productHeaderPanel.setBackground(IVORY);
		productHeaderPanel.setBounds(0, 0, 203, 50);
		headerPanel.add(productHeaderPanel);
		productHeaderPanel.setLayout(new CardLayout(0, 0));
		
		// <<---------------------------------- ICON HEADER PANEL  ---------------------------->
		iconHeaderLabel = new JLabel("Product Icon");
		iconHeaderLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		iconHeaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productHeaderPanel.add(iconHeaderLabel, "name_303389853647600");
		// <<---------------------------------- NAME HEADER PANEL  ---------------------------->
		nameHeaderPanel = new JPanel();
		nameHeaderPanel.setBackground(IVORY);
		nameHeaderPanel.setBounds(203, 0, 151, 50);
		headerPanel.add(nameHeaderPanel);
		nameHeaderPanel.setLayout(new CardLayout(0, 0));
		// <<---------------------------------- ICON HEADER PANEL  ---------------------------->
		nameHeaderLabel = new JLabel("Product Name");
		nameHeaderLabel.setBorder(blackline);
		nameHeaderLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		nameHeaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameHeaderPanel.add(nameHeaderLabel, "name_303405505315100");
		// <<---------------------------------- PRICE HEADER PANEL  ---------------------------->
		priceHeaderPanel = new JPanel();
		priceHeaderPanel.setBorder(blackline);
		priceHeaderPanel.setBackground(IVORY);
		priceHeaderPanel.setBounds(475, 0, 123, 50);
		headerPanel.add(priceHeaderPanel);
		priceHeaderPanel.setLayout(new CardLayout(0, 0));
		// <<------------------------------- PRICE HEADER LABEL  ----------------------->
		priceHeaderLabel = new JLabel("Price");
		priceHeaderLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		priceHeaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		priceHeaderPanel.add(priceHeaderLabel, "name_303410203822000");
		// <<---------------------------------- REMOVE HEADER PANEL  ---------------------------->
		removeHeaderPanel = new JPanel();
		removeHeaderPanel.setBorder(blackline);
		removeHeaderPanel.setBackground(IVORY);
		removeHeaderPanel.setBounds(598, 0, 161, 50);
		headerPanel.add(removeHeaderPanel);
		removeHeaderPanel.setLayout(new CardLayout(0, 0));
		// <<------------------------------- BUTTON HEADER LABEL  ----------------------->
		buttonHeaderLabel = new JLabel("Remove");
		buttonHeaderLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		buttonHeaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		removeHeaderPanel.add(buttonHeaderLabel, "name_303411921454400");
		// <<---------------------------------- QUANTITY  PANEL  ---------------------------->
		quantityPanel = new JPanel();
		quantityPanel.setBackground(IVORY);
		quantityPanel.setBounds(353, 0, 123, 50);
		headerPanel.add(quantityPanel);
		quantityPanel.setLayout(new CardLayout(0, 0));
		// <<------------------------------- QUANTITY HEADER LABEL  ----------------------->
		quantityHeaderLabel = new JLabel("Quantity");
		quantityHeaderLabel.setBorder(blackline);
		quantityHeaderLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		quantityHeaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		quantityPanel.add(quantityHeaderLabel, "name_303407567649100");
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 106, 759, 496);
		basketPanel.add(scrollPane);
		
		scrollPanel = new JPanel();
		scrollPanel.setBackground(GREY);
		scrollPane.setViewportView(scrollPanel);
		scrollPanel.setLayout(new WrapLayout());

		// <<----------------------------------------- ADD BASKET CARDS  ------------------------------------->
		
		for (Product product : addedProducts) {
			BasketCard basketCard = new BasketCard(product);
			System.out.println("Basket Page "+product.getName());
			basketCardList.add(basketCard);
			subTotal += basketCard.getTotalPrice() ;
			scrollPanel.add(basketCard);
		}	
		// <<----------------------------------------- ADD ACTION LISTENER TO REMOVE BUTTONS  ------------------------------------->
		for (BasketCard basketCardComponent : this.basketCardList) {
			JButton removeButton = basketCardComponent.getRemoveButton();
			JComboBox comboBox = basketCardComponent.getComboBox();
			Product product = basketCardComponent.getProduct();

			// REMOVE BASKET CARD from SCROLL PANEL IF REMOVE BUTTON CLICKED
			removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int deletedItemIndex = basketCardList.indexOf(basketCardComponent);
				
				// Remove selected basket card
				scrollPanel.remove(basketCardList.get(deletedItemIndex));
				// Remove product from basket card list
				basketCardList.remove(deletedItemIndex);
				// Reset subTotal
				subTotal -= Integer.valueOf((String) comboBox.getSelectedItem()) * product.getPrice();
				// Reset Price Label
				priceLabel.setText(String.valueOf(subTotal));
				// Update Scroll Panel
				SwingUtilities.updateComponentTreeUI(scrollPanel);
			}
			
		});

		}
	
		// <<----------------------------------------- CHECKOUT PANEL  ------------------------------------->
		checkOutPanel = new JPanel();
		checkOutPanel.setBounds(780, 148, 404, 602);
		contentPane.add(checkOutPanel);
		checkOutPanel.setLayout(null);
		// <<----------------------------------------- TOTAL PANEL  ------------------------------------->
		totalPanel = new JPanel();
		totalPanel.setBackground(PEWTER);
		totalPanel.setBounds(0, 0, 404, 77);
		checkOutPanel.add(totalPanel);
		totalPanel.setLayout(null);
		// <<------------------------------- TOTAL LABEL  ----------------------->
		totalLabel = new JLabel("TOTAL");
		totalLabel.setBackground(BLACK);
		totalLabel.setFont(new Font("Lucida Console", Font.BOLD, 18));
		totalLabel.setBounds(10, 45, 135, 14);
		totalPanel.add(totalLabel);
		// <<------------------------------- PRICE LABEL  ----------------------->
		priceLabel = new JLabel(String.valueOf(subTotal));
		priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		priceLabel.setBounds(202, 46, 98, 14);
		totalPanel.add(priceLabel);
		priceLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		
		separator = new JSeparator();
		separator.setBackground(COOL_GRAY);
		separator.setForeground(COOL_GRAY);
		separator.setBounds(10, 69, 384, 2);
		totalPanel.add(separator);
		
		JLabel tlLabel = new JLabel("TL");
		tlLabel.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
		tlLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tlLabel.setBounds(291, 45, 46, 14);
		totalPanel.add(tlLabel);
		
		
		panel = new JPanel();
		panel.setBackground(PEWTER);
		panel.setBounds(0, 76, 404, 259);
		checkOutPanel.add(panel);
		panel.setLayout(null);
		// <<----------------------------------------- ADDRESS PANEL  ------------------------------------->
		cityEntry = new JTextField();
		cityEntry.setFont(new Font("Tahoma", Font.BOLD, 11));
		cityEntry.setBounds(10, 103, 143, 20);
		panel.add(cityEntry);
		cityEntry.setColumns(10);
		
		townEntry = new JTextField();
		townEntry.setFont(new Font("Tahoma", Font.BOLD, 11));
		townEntry.setBounds(251, 103, 143, 20);
		panel.add(townEntry);
		townEntry.setColumns(10);
		
		cityLabel = new JLabel("City");
		cityLabel.setFont(new Font("Lucida Console", Font.BOLD, 14));
		cityLabel.setBounds(10, 78, 46, 14);
		panel.add(cityLabel);
		
		townLabel = new JLabel("Town");
		townLabel.setFont(new Font("Lucida Console", Font.BOLD, 14));
		townLabel.setBounds(251, 78, 46, 14);
		panel.add(townLabel);
		
		addressHeader = new JLabel("Address");
		addressHeader.setFont(new Font("Lucida Console", Font.BOLD, 16));
		addressHeader.setBounds(10, 32, 170, 14);
		panel.add(addressHeader);
		
		streetAddressEntry = new JTextArea();
		streetAddressEntry.setBackground(Color.WHITE);
		streetAddressEntry.setFont(new Font("Tahoma", Font.BOLD, 11));
		streetAddressEntry.setBounds(10, 169, 384, 49);
		panel.add(streetAddressEntry);
		
		streetAddressHeader = new JLabel("Street Address");
		streetAddressHeader.setFont(new Font("Lucida Console", Font.BOLD, 14));
		streetAddressHeader.setBounds(10, 144, 143, 14);
		panel.add(streetAddressHeader);
		
		addressSeparator = new JSeparator();
		addressSeparator.setBackground(COOL_GRAY);
		addressSeparator.setForeground(COOL_GRAY);
		addressSeparator.setBounds(10, 57, 384, 2);
		panel.add(addressSeparator);
		
		cardSeparator = new JSeparator();
		cardSeparator.setBackground(Color.DARK_GRAY);
		cardSeparator.setForeground(Color.DARK_GRAY);
		cardSeparator.setBounds(10, 257, 384, 2);
		panel.add(cardSeparator);
		
		cardLabel = new JLabel("Card");
		cardLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		cardLabel.setBounds(10, 232, 46, 14);
		panel.add(cardLabel);

		
		
		// <<------------------------------- CHECKOUT PANEL  ----------------------->
				makePaymentCard makePaymentCard = new makePaymentCard();
				makePaymentCard.getMakePaymentButton().setFont(new Font("Lucida Console", Font.BOLD, 14));
				makePaymentCard.setBounds(0, 335, 404, 267);
				JButton makePaymentButton = makePaymentCard.getMakePaymentButton();
				makePaymentButton.addActionListener(e -> {
					String cardHolder = makePaymentCard.getCardHolderEntry().getText();
					String cardNo = makePaymentCard.getCardNoEntry().getText();
					String cardMonth = makePaymentCard.getMonthEntry().getText();
					String cardYear = makePaymentCard.getYearEntry().getText();
					String cardCvv = makePaymentCard.getCvvEntry().getText();
					
					CreditCard creditCard = new CreditCard(cardNo,cardHolder,cardMonth,cardYear,cardCvv,99999);
					
					
					String city = cityEntry.getText();
					String town = townEntry.getText();
					String streetAddress = streetAddressEntry.getText();
					
					Address address = new Address(city,town,streetAddress);
					
					
					JOptionPane optionPane = new JOptionPane();
					String message;
					
					if(this.basketCardList.size() == 0) {
						message = "You should add products to order.";
						optionPane.showMessageDialog(null, message);
						goToShoppingPage();
					}
					
					else if(!isAddressValid(address)) {
						message = "Address fields must be filled.";
						optionPane.showMessageDialog(null, message);
					}
					else if(!isCreditCardValid(creditCard)) {
						message = "Please check your credit card info.";
						optionPane.showMessageDialog(null, message);
					}else if(this.subTotal == 0) {
						message = "You have removed all of your products.\n You are redirected to shopping page.";
						optionPane.showMessageDialog(null, message);
						goToShoppingPage();
					} else 
						makePaymentButtonAction();
		
				});
				checkOutPanel.add(makePaymentCard);
		
		
		
		
		// <<------------------------------- Add Item Listeners to Basket Cards  ----------------------->
		for (BasketCard basketCard : this.basketCardList) 
			basketCard.getComboBox().addItemListener(this);	

		calculateSubTotal();
		setVisible(true);
	}
	
	
	// <<------------------------------- Set Price Label   ----------------------->
	public void itemStateChanged(ItemEvent e) {
			calculateSubTotal();
			
		}
	
	private void makePaymentButtonAction() {
		JOptionPane.showMessageDialog(null, "We have received your order!\nThanks for shopping with our application.\nYou are directed to Shopping Page.");
		goToShoppingPage();
	}
	
	private void goToShoppingPage() {
		this.dispose();
		new ShoppingPage();
	}
	
	
	private boolean isCreditCardValid(CreditCard cc) {
		String cardHolder = cc.getOwner_name();
		String cardNo = cc.getNo();
		String cardMonth = cc.getExpiryMonth();
		String cardYear = cc.getExpiryYear();
		String cardCvv = cc.getCvv();
		
		if(cardNo.length() != 16) 
			return false;
		else if(cardMonth.length() != 2 || Integer.parseInt(cardMonth) <=0 || Integer.parseInt(cardMonth) > 12) 
			return false;	
		else if(cardYear.length() != 2) 
			return false;
		else if(cardCvv.length() != 3) 
			return false;
		
		return true;
	}
	
	
	private boolean isAddressValid(Address address) {
		String city = address.getCity();
		String town = address.getTown();
		String streetAddress = address.getStreet();

		if(city.length() == 0 || town.length()== 0 || streetAddress.length() == 0) 
			return false;
		
		return true;
		
	}
	
	private void calculateSubTotal() {
		int price = 0;
		for (BasketCard basketCard : this.basketCardList) {
			JComboBox comboBox = basketCard.getComboBox();
			Product product = basketCard.getProduct();
			price += Integer.valueOf((String) comboBox.getSelectedItem()) * product.getPrice();
		}
		this.subTotal = price;
		priceLabel.setText(String.valueOf(subTotal));
	}
	
}


	



