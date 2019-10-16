package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// Construtor Padrão
	
	public Product() { 
	}

	// Construtor
	
	public Product(String name, double price, int quantity) { 
		this.name = name; // this >> public String name
		this.price = price;
		this.quantity = quantity;
	}
	
	// Sobrecarga mais de uma versão da mesma operação
	
	public Product(String name, double price) { 
		this.name = name; // this >> public String name
		this.price = price;
	}
	
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}
}
