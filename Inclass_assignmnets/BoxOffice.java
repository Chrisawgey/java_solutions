package Inclass_assignmnets;

import java.util.Scanner;

public class BoxOffice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input the name of the movie
    System.out.print("Enter the name of the movie >>  ");

    // input stored in variable named "moviename"
    // using.nextLine() to retrieve the next line of data and return as a string
    String moviename = scanner.nextLine();

    // Asking the user to input the number of Adult tickets sold
    System.out.print("Enter the number of Adult tickets sold >> ");
    int adultTickets = scanner.nextInt();

    // Asking the user to input the number of Child tickets sold
    System.out.print("Enter the number of Child tickets sold >> ");
    int childTickets = scanner.nextInt();

    // Declaring the the prices of adult and child tickets and percentage kept
    double adultTicketPrice = 10.00;
    double childTicketPrice = 6.00;
    double percentage = 0.20; // 20%

    // Calculating the total amount of money made from the tickets
    double grossProfit = (adultTickets * adultTicketPrice) + (childTickets * childTicketPrice);
    double netProfit = grossProfit * percentage;
    double amountToDistributor = grossProfit - netProfit;

    // printing out the results
    System.out.println("Movie Name: " + moviename);
    System.out.println("Adult tickets sold: " + adultTickets);
    System.out.println("Child tickets sold: " + childTickets);
    System.out.println("Gross Box Office Profit: $" + grossProfit);
    System.out.println("Net Box Office Profit: $" + netProfit);
    System.out.println("Amount Paid to Distributor: $" + amountToDistributor);

    scanner.close();
  }
}
