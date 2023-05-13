package String_Methods;

public class ToUpperCaseToLowerCase_Hashtag {

    public static void main(String[] args) {

        String input = "Cricket!";

        String upper = input.toUpperCase();
        // stores "CRICKET!"
        System.out.println(upper);

        String lower = input.toLowerCase();
        // stores "cricket!"
        System.out.println(lower);

        String hashtag = "#100DaysOfCode";
        // Make the hashtag lowercase:
        System.out.println(hashtag.toLowerCase());
    }

}
