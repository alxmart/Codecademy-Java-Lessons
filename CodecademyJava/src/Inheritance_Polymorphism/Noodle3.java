package Inheritance_Polymorphism;
class Noodle3 {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle3(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public void cook() {
        System.out.println("Boiling.");
        this.texture = "cooked";
    }

    public static void main(String[] args) {
        Spaetzle kaesespaetzle = new Spaetzle();
        kaesespaetzle.cook();
    }

}