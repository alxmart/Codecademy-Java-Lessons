package Object_Oriented;

public class Store2 {

    // instance fields
    String productType;

    // constructor method
    public Store2(String product) {
        productType = product;
    }

    // advertise method
    public void advertise2() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    // main method
    public static void main(String[] args) {

        Store2 lemonadeStand2 = new Store2("Lemonade");

        lemonadeStand2.advertise2();
        lemonadeStand2.advertise2();
        lemonadeStand2.advertise2();

    }
}