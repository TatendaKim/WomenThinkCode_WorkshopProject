package OnlineShoppingSystem;

public class Product {

    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and Setter for name
    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;

    }

    // Getter and Setter for price
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    //Getter and Setter for quantity
    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double calculateTotalCost(){
        return  price * quantity;
    }


}
