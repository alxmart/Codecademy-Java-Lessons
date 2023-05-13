package Inheritance_Polymorphism;

class Noodle5 {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle5(double lenInCent, double wthInCent, String shp,
            String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public String getCookPrep() {
        return "Boil noodle for 7 minutes and add sauce.";
            }


    public static void main(String[] args) {
        Noodle spaghetti, ramen, pho;

        Spaghetti5 spaghetti5 = new Spaghetti5();
        Ramen5 ramen5 = new Ramen5();
        Pho5 pho5 = new Pho5();

        // Add your code below:
        Noodle5[] allTheNoodles = { spaghetti5, ramen5, pho5};

        for (Noodle5 noodle : allTheNoodles) {
            System.out.println(noodle.getCookPrep());
        }

    }

}