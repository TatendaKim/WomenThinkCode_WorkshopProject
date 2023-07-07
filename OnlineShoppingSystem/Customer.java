package OnlineShoppingSystem;

import java.util.ArrayList;
import java.util.PropertyResourceBundle;

public class Customer extends User {
    private String address;
    private ArrayList<Product> shoppingCart;
    private ArrayList<Product> purchaseHistory;

    //Constructor
    public Customer(String username, String password, String address) {
        super(username, password);
        this.address = address;
        this.shoppingCart = new ArrayList<>();
        this.purchaseHistory = new ArrayList<>();
    }

    //Getter and Setter for address
    public String getAddress(String address) {

        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for shoppingCart
    public ArrayList<Product> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    // Getter and Setter for purchaseHistory
    public ArrayList<Product> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(ArrayList<Product> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    //My method for adding a product to the Shopping Cart
    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    // My method for completing a purchase
    public void completePurchase() {
        purchaseHistory.addAll(shoppingCart);
        shoppingCart.clear();
    }

    public String toString() {
        return "Customer Information:\n" +
                "Username: " + getUsername() + "\n" +
                "Address: " + address + "\n" +
                "Shopping Cart: " + shoppingCart.toString() + "\n" +
                "Purchase History: " + purchaseHistory.toString();
    }


}
