package Conditionals_Control_Flow;// This program will calculate the monthly car payment a user
//   should expect to make after taking out a car loan.

public class Project_CarLoan_Payment_Calculator {

    public static void main(String[] args) {

        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

        int remainingBalance = 0;

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            remainingBalance = carLoan - downPayment;
        }

        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = (monthlyBalance * interestRate) / 100;
        int monthlyPayment = monthlyBalance + interest;

        System.out.println("Monthly payment: " + monthlyPayment);
    }
}