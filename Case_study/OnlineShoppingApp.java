import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("Product: " + name + " | Price: " + price);
    }
}

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeProduct(String productName) {
        Iterator<Product> iterator = products.iterator();
        boolean removed = false;

        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equalsIgnoreCase(productName)) {
                iterator.remove();
                removed = true;
                System.out.println(productName + " removed from cart.");
                break;
            }
        }

        if (!removed) {
            System.out.println("Product not found in cart.");
        }
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Shopping cart is empty.");
        } else {
            System.out.println("Products in Cart:");
            System.out.println("----------------------");
            for (Product product : products) {
                product.displayProduct();
            }
            System.out.println("----------------------");
            System.out.println("Total Cost: " + calculateTotalCost());
        }
    }
}

public class OnlineShoppingApp {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 800);
        Product p3 = new Product("Keyboard", 1500);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        System.out.println();
        cart.displayCart();

        System.out.println();
        cart.removeProduct("Mouse");

        System.out.println();
        cart.displayCart();
    }
}
