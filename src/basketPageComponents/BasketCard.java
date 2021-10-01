package basketPageComponents;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import Entities.Product;
import Pages.BasketPage;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class BasketCard extends JPanel implements ItemListener {
	
	private JPanel iconPanel;
	private JLabel productIconLabel;
	private JPanel removePanel;
	private JButton removeButton;
	private JPanel namePanel;
	private JLabel nameLabel;
	private JPanel pricePanel;
	private JLabel priceLabel;
	private JPanel quantityPanel;
	
	private JComboBox comboBox;
	private Product product;
	private int totalPrice;
	
	
	private Border blackline = BorderFactory.createLineBorder(Color.black);
	
	private Color RED = Color.decode("#d72323");
	
	/**
	 * Create the panel.
	 */
	public BasketCard(Product product){
		this.product = product;
		this.totalPrice = 1000;
		
		// <<----------------------------------------- MAIN Features  ------------------------------------->
		setBounds(0, 0, 759, 156);
		this.setPreferredSize(new Dimension(750, 134));
		setLayout(null);
		// <<----------------------------------------- Icon Panel  ------------------------------------->
		iconPanel = new JPanel();
		iconPanel.setBorder(blackline);
		iconPanel.setBackground(Color.LIGHT_GRAY);
		iconPanel.setBounds(0, 0, 200, 134);
		add(iconPanel);
		iconPanel.setLayout(new CardLayout(0, 0));
		// <<----------------------------------------- Product Icon Label  ------------------------------------->
		productIconLabel = new JLabel("");
		productIconLabel.setIcon(new ImageIcon(BasketPage.class.getResource(product.getIcon())));
		productIconLabel.setHorizontalAlignment(SwingConstants.CENTER);
		iconPanel.add(productIconLabel, "name_294162790655500");
		// <<----------------------------------------- Remove Panel  ------------------------------------->
		removePanel = new JPanel();
		removePanel.setBackground(Color.LIGHT_GRAY);
		removePanel.setBorder(blackline);
		//removePanel.setBorder(new EmptyBorder(45,45,45,45));
		removePanel.setBounds(603, 0, 147, 134);
		add(removePanel);
		// <<----------------------------------------- Remove Button  ------------------------------------->
		removeButton = new JButton("");
		removeButton.setBackground(RED);
		removeButton.setBounds(45, 45, 57, 44);
		removeButton.setFocusable(false);
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("remove button is clicked.");
	
			}
		});
		removePanel.setLayout(null);
		removeButton.setIcon(new ImageIcon(BasketPage.class.getResource("/images/close.png")));
		removeButton.setHorizontalAlignment(SwingConstants.CENTER);
		removePanel.add(removeButton);
		// <<----------------------------------------- Name Panel  ------------------------------------->
		namePanel = new JPanel();
		namePanel.setBorder(blackline);
		namePanel.setBackground(Color.LIGHT_GRAY);
		namePanel.setBounds(198, 0, 154, 134);
		add(namePanel);
		namePanel.setLayout(new CardLayout(0, 0));
		// <<----------------------------------------- Name Label  ------------------------------------->
		nameLabel = new JLabel(product.getName());
		nameLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		namePanel.add(nameLabel, "name_296970021819600");
		// <<----------------------------------------- Price Panel  ------------------------------------->
		pricePanel = new JPanel();
		pricePanel.setBorder(blackline);
		pricePanel.setBackground(Color.LIGHT_GRAY);
		pricePanel.setBounds(474, 0, 129, 134);
		add(pricePanel);
		pricePanel.setLayout(new CardLayout(0, 0));
		// <<----------------------------------------- Price Label  ------------------------------------->
		priceLabel = new JLabel(String.valueOf(product.getPrice()));
		priceLabel.setFont(new Font("Lucida Console", Font.BOLD, 16));
		priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pricePanel.add(priceLabel, "name_296933531217300");
		
		quantityPanel = new JPanel();
		quantityPanel.setBorder(blackline);
		quantityPanel.setBackground(Color.LIGHT_GRAY);
		quantityPanel.setBounds(351, 0, 123, 134);
		add(quantityPanel);
		
		String s1[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		quantityPanel.setLayout(null);
		comboBox = new JComboBox(s1);
		comboBox.addItemListener(this);
		comboBox.setBounds(30, 50, 63, 34);
		comboBox.setFont(new Font("Lucida Console", Font.BOLD, 14));
		quantityPanel.add(comboBox);
		
		setVisible(true);

	}
	
	
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getSource() == comboBox) {
			int price = Integer.valueOf((String) comboBox.getSelectedItem()) * product.getPrice();
			this.totalPrice = price;
			priceLabel.setText(String.valueOf(totalPrice) + "TL");
		}
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	public JComboBox getComboBox() {
		return comboBox;
	}


	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public JButton getRemoveButton() {
		return removeButton;
	}


	public void setRemoveButton(JButton removeButton) {
		this.removeButton = removeButton;
	}
	

}
