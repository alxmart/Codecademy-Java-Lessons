package Inheritance_Polymorphism;

class Ramen5 extends Noodle5 {

    Ramen5() {
        super(30.0, 0.3, "flat", "wheat flour");
    }

    @Override
    public String getCookPrep() {
        return "Boil ramen for 5 minutes in broth, then add" +
                " meat, mushrooms, egg, and vegetables.";
    }

}