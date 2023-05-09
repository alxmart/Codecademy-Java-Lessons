package Conditionals_Control_Flow;

public class Order {

    public static void main(String[] args) {

        double itemCost = 30.99;

        // Write an if-then statement:

        if (itemCost > 24.00) {
            System.out.println("High value item!");
        }

        boolean isFilled = true;

        if (isFilled) {
            System.out.println("Shipping");
        } else {
            System.out.println("Conditionals_Control_Flow.Order not ready");
        };
    }

}
