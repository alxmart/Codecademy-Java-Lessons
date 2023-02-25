public class Reservation2 {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Reservation2(int count, int capacity, boolean open) {
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;
    }

    public void confirmReservation() {

        if (restaurantCapacity >= guestCount &&
                isRestaurantOpen == true ) {
            System.out.println("Reservation is confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation is denied");
            isConfirmed = false;

        }
    /*
       Write conditional
       ~~~~~~~~~~~~~~~~~
       if restaurantCapacity is greater
       or equal to guestCount
       AND
       the restaurant is open:
         print "Reservation confirmed"
         set isConfirmed to true
       else:
         print "Reservation denied"
         set isConfirmed to false
    */
    }

    public void informUser() {
        System.out.println("Please enjoy your meal!");
    }

    public static void main(String[] args) {

        Reservation2 partyOfThree = new Reservation2(3, 12, true);
        Reservation2 partyOfFour = new Reservation2(4, 3, true);

        partyOfThree.confirmReservation();
        partyOfThree.informUser();
        partyOfFour.confirmReservation();
        partyOfFour.informUser();
    }
}