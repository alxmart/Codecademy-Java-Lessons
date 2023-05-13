package Inheritance_Polymorphism;

class NoodleRestaurant {
    String name;

    public NoodleRestaurant(String customerName){
        name = customerName;
    }

    public void order(Noodle5 noodle) {
        System.out.println(noodle.getCookPrep());
        System.out.println("Order for " + name + " is ready.");
    }

    public static void main(String[] args) {
        Noodle5 ramen, pho;
        ramen = new Ramen5();
        pho = new Pho5();

        NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
        NoodleRestaurant customer2 = new NoodleRestaurant("Maritza");

        // Add your code here
        Noodle5 pho5 = null;
        customer1.order(pho);
        customer2.order(ramen);

    }
}
