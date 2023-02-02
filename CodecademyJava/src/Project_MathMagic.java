public class Project_MathMagic {
    public static void main(String[] args) {

        //The original number:
        int myNumber = 99;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6 ;
        System.out.println(stepSix);

    }
}