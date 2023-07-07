package OnlineShoppingSystem;

import java.util.ArrayList;

public class Customer extends User{
    private String address;
    private ArrayList<String> shoppingCart;
    private String purchaseHistory;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(String item) {
        this.shoppingCart = new ArrayList<>();
        shoppingCart.add("item1");


    }

    public String getPurchaseHistory(){
        return purchaseHistory;
    }

    public void setPurchaseHistory(String purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

//    public String addProducts(String item) {
//        for(String item : shoppingCart){
//            System.out.println(item);
//
//        }
    }

