package lesson14_05_09_2023.product;

import java.util.List;

public class Cart {
	
	
	private double totalPrice;
	private int amount;
	private List<Product>products;
	
	
	public Cart() {
	
		
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}

// Sepete ekleme methodu
	// totalPrice kontrolü
	// amount kontrolü
	// stock kontrolü
	
	public void addToCard (Product product) {
		if (product.getStock()>=0) {
			System.out.println("STOKTA ÜRÜN KALMAMIŞTIR.");
			product.removeFormListing();
		}else {
			getProducts().add(product);
			product.setStock(product.getStock()-1);
			setAmount(getAmount()+1);
			setTotalPrice(getTotalPrice()+product.getPrice());
		}
	}
	

}
