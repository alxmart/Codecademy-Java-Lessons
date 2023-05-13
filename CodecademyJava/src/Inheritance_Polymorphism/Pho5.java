package Inheritance_Polymorphism;

class Pho5 extends Noodle5 {
    Pho5() {
        super(30.0, 0.64, "flat", "rice flour");
    }

    @Override
    public String getCookPrep() {
        return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";
    }

}