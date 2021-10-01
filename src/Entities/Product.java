package Entities;
//  Five attributes: ID, name, price,  quantity, category

//TODO: Think about whether quantity included or not
public class Product {
	private final String id;
	private final String name;
	private final String category;
	private int price;
	private int quantity;
	private final String icon;

	public Product(String id, String name, int price, String category,String icon) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.icon = icon;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public String getIcon() {
		return icon;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	


}
