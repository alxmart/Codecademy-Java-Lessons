public class Project_Calculator {

    public Project_Calculator() {
    };

    public int add(int a, int b) {
        return a + b;
    };

    public int subtract(int a, int b) {
        return a - b;
    };

    public int multiply(int a, int b) {
        return a * b;
    };

    public int devide(int a, int b) {
        return a / b;
    };

    public int modulo(int a, int b) {
        return a % b;
    };


    public static void main(String[] args) {

        Project_Calculator myCalculator = new Project_Calculator();

        System.out.println(myCalculator.add(5,7));

        System.out.println(myCalculator.subtract(45,11));

        System.out.println(myCalculator.multiply(5,7));

        System.out.println(myCalculator.devide(12,3));

        System.out.println(myCalculator.modulo(10,3));

    };

};