package Conditionals_Control_Flow;

public class Reservation3 {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Reservation3(int count, int capacity, boolean open) {
        // Write conditional statement below
        if (count < 1 || count > 8 ) {
            System.out.println("Invalid reservation!");
        }

        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Conditionals_Control_Flow.Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Conditionals_Control_Flow.Reservation denied");
            isConfirmed = false;
        }
    }

    public void informUser() {
        System.out.println("Please enjoy your meal!");
    }

    public static void main(String[] args) {

        Reservation3 partyOfThree = new Reservation3(3, 12, true);
        Reservation3 partyOfFour = new Reservation3(4, 3, true);

        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}