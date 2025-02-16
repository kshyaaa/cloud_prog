import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
}

class InventoryManagementSystem {
    private ArrayList<Product> products;
    
    public InventoryManagementSystem() {
        this.products = new ArrayList<>();
    }
    
    public void addProduct(String name, double price){
        Product newProduct = new Product(name, price);
        products.add(newProduct);
        System.out.println("Product added: " + name + " - Php" + price);
    }
    
    public void displayProducts(){
        if (products.isEmpty()){
            System.out.println("No products available.");
        }
        else {
            System.out.println("Product List:");
            for (Product product : products) {
                System.out.println("Name: " + product.getName() + ", Price: Php" + product.getPrice());
            }
        }
    }
}
public class InventoryManagementApp
{
	public static void main(String[] args) {
		InventoryManagementSystem inventory = new InventoryManagementSystem();
		Scanner input = new Scanner (System.in);
		
		System.out.println("***************************************************");
		System.out.println("    Welcome to the Inventory Management System \n    By: Kishia O. Laubenia");
		System.out.println("***************************************************");
		
		while (true) {
		    System.out.println("\nMenu:");
		    System.out.println("1. Add Product");
		    System.out.println("2. Display Products");
		    System.out.println("3. Exit");
		    System.out.println("");
		    System.out.print("Enter your choice: ");
		    
		    int choice = input.nextInt();
		    input.nextLine();
		    
		    switch (choice) {
		        case 1:
		            System.out.print("\nEnter product name: ");
		            String name = input.nextLine();
		            System.out.print("Enter product price: ");
		            double price = input.nextDouble();
		            inventory.addProduct(name, price);
		            break;
		        case 2:
		            inventory.displayProducts();
		            break;
		        case 3:
		            System.out.println("Goodbye!");
		            input.close();
		            return;
		        default:
		            System.out.println("Invald choice. Please try again.");
		          
		    }
		}
	}
}
