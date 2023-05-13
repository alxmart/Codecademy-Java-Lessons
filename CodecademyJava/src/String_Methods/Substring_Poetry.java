package String_Methods;

public class Substring_Poetry {

    public static void main(String[] args) {

        String line = "The Heav'ns and all the Constellations rung";
        System.out.println(line.substring(24));

        String line2 = "The Heav'ns and all the Constellations rung";
        System.out.println(line2.substring(27, 33));

        String line3 = "The Heav'ns and all the Constellations rung";
        System.out.println(line3.substring(24, 25));
        // Prints: C

        String line4 = "The Heav'ns and all the Constellations rung";
        // Change the arguments:
        System.out.println(line4.substring(4, 11));
        // Prints: Heav'ns
    }


}
