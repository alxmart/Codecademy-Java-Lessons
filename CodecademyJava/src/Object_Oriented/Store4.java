package Object_Oriented;

public class Store4 {
    // instance fields
    String productType;

    // constructor method
    public Store4(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    };

    // main method
    public static void main(String[] args) {
        Store4 lemonadeStand = new Store4("Lemonade");
        lemonadeStand.greetCustomer("Homer");

    }
}