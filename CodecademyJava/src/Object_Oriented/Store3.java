package Object_Oriented;

public class Store3 {
    // instance fields
    String productType;

    // constructor method
    public Store3(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // main method
    public static void main(String[] args) {
        String cookie = "Cookies";
        Store3 cookieShop = new Store3(cookie);
        cookieShop.advertise();

    }
}