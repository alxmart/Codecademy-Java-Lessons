package Debugging;

// try {
//  Block of code to try
// }  catch (NullPointerException e) {
//      Print the error message like this:
//      System.err.println("NullPointerException: " + e.getMessage());
//      Or handle the error another way here
//     }

public class Try_Catch {

    public static void main(String[] args) {

        int width = 0;
        int length = 40;

        try {
            int ratio = length / width;
        } catch (ArithmeticException e) {
            System.err.println("Division By zero" + e.getMessage());
        } ;

    }
}
