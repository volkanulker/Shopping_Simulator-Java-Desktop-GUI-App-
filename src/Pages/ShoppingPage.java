package Pages;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.awt.Color;

import java.awt.Font;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.FlowLayout;

import javax.swing.JButton;

import Entities.Product;
import Extras.WrapLayout;
import shoppingPageComponents.NavigatorCard;
import shoppingPageComponents.ProductCard;


public class ShoppingPage extends JFrame {

	private JPanel contentPane;

	private final Color EBONY = Color.decode("#0A0708");
	private final Color COOL_GRAY= Color.decode("#444444");
	private final Color PEWTER = Color.decode("#B1B1B1");

	
	private JPanel mainPanel;
	private JPanel titlePanel;
	private JLabel titleLabel;
	private JScrollPane scrollPane;
	private JPanel productPanel;
	private JPanel navigatorPanel;
	private NavigatorCard goToBasket;
	private NavigatorCard logout;
	private JButton logoutButton;
	private Queue<Product> productsToPassed;
	private ArrayList<ProductCard> productCardList;

	/**
	 * Create the frame.
	 */
	public ShoppingPage() {
		productCardList = new ArrayList<ProductCard>();
		productsToPassed = new LinkedList<Product>();

		//<----------------------------- Main Frame-------------------------------->
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setTitle("Shopping System - Shopping Page");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//<----------------------------- Main Panel-------------------------------->
		mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 1184, 761);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		//<----------------------------- Title Panel -------------------------------->
		titlePanel = new JPanel();
		titlePanel.setBackground(EBONY);
		titlePanel.setBounds(0, 0, 1184, 150);
		mainPanel.add(titlePanel);
		titlePanel.setLayout(new CardLayout(0, 0));
		
		titleLabel = new JLabel("Shopping Page");
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(new Font("Lucida Console", Font.BOLD, 18));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titlePanel.add(titleLabel, "name_187739180959800");
		
		//<----------------------------- Product Panel -------------------------------->
		scrollPane = new JScrollPane();
		scrollPane.setBounds(254, 150, 930, 611);
		mainPanel.add(scrollPane);
		
		productPanel = new JPanel();
		productPanel.setBackground(COOL_GRAY);
		scrollPane.setViewportView(productPanel);
		productPanel.setLayout(new WrapLayout());
		
		
		//<----------------------------- ADD Product Cards to Shopping Page -------------------------------->
		addProducts();

		//<----------------------------- ADD Action Listener to "add to basket button"s-------------------------------->

		for (ProductCard productCardComponent : productCardList) {
					JButton addToBasketButton = productCardComponent.getAddToBasketButton();
					addToBasketButton.addActionListener(e -> {
						if(!productsToPassed.contains(productCardComponent.getProduct())) {
							System.out.println("---------"+productCardComponent.getProduct().getName());
							System.out.println("product is passed to the basket page");
							productsToPassed.add(productCardComponent.getProduct());
						}			
					});
				}
		//<----------------------------- Navigator Panel -------------------------------->
		navigatorPanel = new JPanel();
		navigatorPanel.setBackground(PEWTER);
		navigatorPanel.setBounds(0, 151, 255, 610);
		mainPanel.add(navigatorPanel);
		navigatorPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));	
		//<----------------------------- Go To Basket Button -------------------------------->	
		goToBasket = new NavigatorCard("Go To Basket");
		goToBasket.setBackground(EBONY);
		JButton goToBasketButton = goToBasket.getNavigationButton();
		goToBasketButton.addActionListener(e -> { 
			dispose();
			new BasketPage(productsToPassed);
			});
		//<----------------------------- Logout Button --------------------------------------->	
		logout = new NavigatorCard("Logout");
		logoutButton = logout.getNavigationButton();
		logoutButton.addActionListener(e -> { 
			dispose();
			new WelcomePage();	
		});
		
		//<----------------------------- Add Components to Navigator Panel ---------------------->		
		navigatorPanel.add(goToBasket);
		navigatorPanel.add(logout);	
		setVisible(true);	
	}

	public void addProducts() {
		// ADD TEST PRODUCTS
		String id = "1";
		String name ="Television";
		int price = 2000;
		String category = "Electronics";
		String icon = "/images/tv.png";
	
		String id1 = "2";
		String name1 ="Computer";
		int price1 = 5000;
		String category1 = "Electronics";
		String icon1= "/images/desktop.png";
	
		String id2 = "3";
		String name2 ="Mouse";
		int price2 = 250;
		String category2 = "Electronics";
		String icon2 = "/images/mouse.png";
	
		String id3 = "4";
		String name3 ="Ram";
		int price3 = 800;
		String category3 = "Electronics";
		String icon3= "/images/ram.png";
		
		String id4 = "5";
		String name4 ="Keyboard";
		int price4 = 600;
		String category4 = "Electronics";
		String icon4= "/images/keyboard.png";
		
		String id5 = "6";
		String name5 ="Headphone";
		int price5 = 800;
		String category5 = "Electronics";
		String icon5= "/images/headphone.png";
		
		
		String id6 = "7";
		String name6 ="Motherboard";
		int price6 = 1200;
		String category6 = "Electronics";
		String icon6= "/images/motherboard.png";
	
		Product product = new Product(id, name, price,  category,icon);
		Product product1 = new Product(id1, name1, price1,  category1, icon1);
		Product product2 = new Product(id2, name2, price2,  category2, icon2);
		Product product3 = new Product(id3, name3, price3,  category3, icon3);
		Product product4 = new Product(id4, name4, price4,  category4, icon4);
		Product product5 = new Product(id5, name5, price5,  category5, icon5);
		Product product6 = new Product(id6, name6, price6,  category6, icon6);
		
		
		ProductCard productCard = new ProductCard(product);
		ProductCard productCard1 = new ProductCard(product1);
		ProductCard productCard2 = new ProductCard(product2);
		ProductCard productCard3 = new ProductCard(product3);
		ProductCard productCard4 = new ProductCard(product4);
		ProductCard productCard5 = new ProductCard(product5);
		ProductCard productCard6 = new ProductCard(product6);
				
		
		productCardList.add(productCard);
		productCardList.add(productCard1);
		productCardList.add(productCard2);
		productCardList.add(productCard3);
		productCardList.add(productCard4);
		productCardList.add(productCard5);
		productCardList.add(productCard6);
	
		for (ProductCard productCardItem : productCardList) 
			productPanel.add(productCardItem);

	}
}
