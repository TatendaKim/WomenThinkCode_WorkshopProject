package OnlineShoppingSystem;

public class Main {
    public static void main(String[] args) {
        // Instantiate Product objects
        Product product1 = new Product("Shirt", 29.99, 1);
        Product product2 = new Product("Jeans", 59.99, 1);
        Product product3 = new Product("Shoes", 79.99, 1);


        // Instantiate Customer objects
        Customer customer1 = new Customer("john123", "password", "123 Main St");
        Customer customer2 = new Customer("jane456", "securepass", "456 Elm St");

        // Add products to shopping carts
        customer1.addToCart(product1);
        customer1.addToCart(product2);
        customer2.addToCart(product2);
        customer2.addToCart(product3);

        // Complete purchases
        customer1.completePurchase();
        customer2.completePurchase();

        // Display customer information
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    }
}
