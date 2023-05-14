package Inheritance_Polymorphism;

class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(
            String langName,
            int speakers,
            String regions,
            String wdOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }

    public void getInfo() {

        System.out.println(this.name + " is spoken by "
                + this.numSpeakers + " people mainly in "
                + this.regionsSpoken + ".");

        System.out.println("The language follows the word order: "
                + this.wordOrder);
    }

    public static void main(String[] args) {

        Language brport = new Language("br portuguese",
                230000000,
                "2",
                "5");
        brport.getInfo();

        Mayan huastec = new Mayan("huastec",
                2330000);
        huastec.getInfo();

        SinoTibetan mandarin = new SinoTibetan(
                "Mandarin Chinese",
                2330000);
        mandarin.getInfo();

        SinoTibetan burmese = new SinoTibetan(
                "Burmese",
                2330000);
        burmese.getInfo();

    }
}
