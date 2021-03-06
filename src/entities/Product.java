package entities;

public class Product{

	private String name;
	private Double price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return this.getName().toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product [name=" + this.name + ", price=" + String.format("%.2f" ,this.price) + "]";
	}

}
