package Inclass_assignmnets;

import java.util.Scanner;

public class InterestEarned {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the principle: $");
        Double principle = scanner.nextDouble();

        System.out.print("What is the interest rate: ");
        Double interest = scanner.nextDouble()/100;

        System.out.print("What is the nuber of times interest is compounded: ");
        Double compound = scanner.nextDouble();

        //Total amount formula
        Double firstStep = interest/compound;
        Double secondStep = firstStep + 1;
        Double thirdStep = Math.pow(secondStep, compound);
        Double finalStep = thirdStep * principle;

        //find the interest
        Double interestRate = finalStep-principle;

        System.out.println("Interest Rate: " + interest + "%");
        System.out.println("Times Compounded: " + compound);
        System.out.println("Principle: $" + principle);
        System.out.println("Interest: $" + interestRate);
        System.out.println("Amount in Savings: $" + finalStep);

        scanner.close();
    }
}
