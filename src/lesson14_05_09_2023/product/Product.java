package lesson14_05_09_2023.product;

import lesson14_05_09_2023.product.utility.RandomGenerateId;

public class Product {

	private String name;
	private String Id;
	private int stock;
	private double price;
	private String productCode;
	private boolean isActive = true;

// Overloading

	public Product() {
		this.Id = RandomGenerateId.generateId();

	}

	public Product(String name, int stock, double price) {
		this();
		this.name = name;

		this.stock = stock;
		this.price = price;
		this.productCode = RandomGenerateId.generateProductCode(name);
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = RandomGenerateId.generateProductCode(productCode);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock < 0) {
			System.out.println("Stok değeri 0 dan küçük girilemez");
		} else {
			this.stock = stock;
			addToListing();
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void updateName(String name) {
		setName(name);
	}

	public void saveToDatabase() {
		System.out.println(getName() + " Veri tabanına kaydedildi.");
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void removeFormListing() {
		setActive(false);
		System.out.println(getName() + " Gösterimden kaldırıldı..");

	}

	public void addToListing() {
		setActive(true);
		System.out.println(getName() + " Stoğa ürün eklendi");

	}

}
