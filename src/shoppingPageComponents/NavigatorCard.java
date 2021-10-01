package shoppingPageComponents;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;


import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class NavigatorCard extends JPanel {
	private JButton navigationButton;
	private final Color EBONY = Color.decode("#0A0708");
	private final Color COOL_GRAY= Color.decode("#444444");
	private final Color PEWTER = Color.decode("#B1B1B1");
	private final Color GRAY = Color.decode("#747474");
	
	/**
	 * Create the panel.
	 */
	public NavigatorCard(String buttonLabel) {
		this.setBorder(new EmptyBorder(20,20,20,20));
		this.setPreferredSize(new Dimension(255,80));
		this.setOpaque(false);
		//this.navigationButton.setFocusable(false);
		
		navigationButton = new JButton(buttonLabel);
		navigationButton.setBackground(EBONY);
		navigationButton.setForeground(PEWTER);
		
		navigationButton.setPreferredSize(new Dimension(240,30));
		this.navigationButton.setFocusable(false);
//		navigationButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		this.setLayout(new CardLayout(0, 0));
		this.add(navigationButton, "name_213096285524500");
		
	}

	public JButton getNavigationButton() {
		return navigationButton;
	}

	public void setNavigationButton(JButton navigationButton) {
		this.navigationButton = navigationButton;
	}
	
	

}
