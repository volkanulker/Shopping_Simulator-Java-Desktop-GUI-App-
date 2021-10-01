package shoppingPageComponents;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Entities.Product;
import Pages.ShoppingPage;

public class ProductCard extends JPanel {
	private int width = 256;
	private int height = 300;
	private JPanel iconPanel;
	private JLabel productIcon;
	private JPanel productNamePanel;
	private JLabel productNameLabel;
	private JPanel buttonPanel;
	private JButton addToBasketButton;
	private JLabel priceLabel;
	private JPanel pricePanel;
	private Product product;
	
	
	private final Color EBONY = Color.decode("#0A0708");
	private final Color COOL_GRAY= Color.decode("#444444");
	private final Color PEWTER = Color.decode("#B1B1B1");
	private final Color GRAY = Color.decode("#747474");
	
	/**
	 * Create the panel.
	 */
	public ProductCard(Product product) {
		this.product = product;
		//<------------------------- Main Panel ----------------------------------------->	
		this.setBorder(new EmptyBorder(10,10,10,0));
		this.setBackground(Color.ORANGE);
		this.setPreferredSize(new Dimension(width, height));
		//<------------------------- Icon ----------------------------------------->		
		iconPanel = new JPanel();
		iconPanel.setBackground(Color.ORANGE);
		iconPanel.setPreferredSize(new Dimension(width-40, 150));
		this.add(iconPanel);
		iconPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				
		productIcon = new JLabel("");
		iconPanel.add(productIcon);
		productIcon.setIcon(new ImageIcon(ShoppingPage.class.getResource(product.getIcon())));
		//<------------------------- Product  ----------------------------------------->	
		productNamePanel = new JPanel();
		productNamePanel.setBackground(Color.ORANGE);
		productNamePanel.setPreferredSize(new Dimension(width-40, 30));
		this.add(productNamePanel);
		productNamePanel.setLayout(new CardLayout(0, 0));
		
		productNameLabel = new JLabel(product.getName());
		productNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productNamePanel.add(productNameLabel, "name_197194656840800");
		productNameLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		
		pricePanel = new JPanel();
		pricePanel.setBackground(Color.ORANGE);
		pricePanel.setPreferredSize(new Dimension(width-40, 30));
		add(pricePanel);
		
		priceLabel = new JLabel(product.getPrice()+"TL");
		pricePanel.add(priceLabel);
		
		//<------------------------- Button ----------------------------------------->	
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.ORANGE);
		buttonPanel.setPreferredSize(new Dimension(width-40, 60));
		this.add(buttonPanel);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		addToBasketButton = new JButton("add to basket");
		addToBasketButton.setForeground(Color.white);
		addToBasketButton.setBackground(EBONY);
		addToBasketButton.setFocusable(false);
		addToBasketButton.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		addToBasketButton.setPreferredSize(new Dimension(width-60,30));
		buttonPanel.add(addToBasketButton);
		
	}

	public JButton getAddToBasketButton() {
		return addToBasketButton;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	
	
	
	
	

}
