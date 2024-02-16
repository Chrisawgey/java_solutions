package Inclass_assignmnets;

import java.util.Scanner;

public class Disount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Variable Declaration
        final double PACKAGE_PRICE = 99.0;
        final int PACKAGE_10_19 = 20;
        final int PACKAGE_20_49 = 30;
        final int PACKAGE_50_99 = 40;
        final int PACKAGE_100more = 50;

        System.out.print(" Enter the number of units sold: ");
        int units_sold = scanner.nextInt();

        if(units_sold <= 0) {
            System.out.println("invalid. Enter a number that is higher than zero");
        }


        //decalares a variable named 'discount' of type 'int'
        int discount;
            if(units_sold >= 10 && units_sold <= 19) {
                discount = PACKAGE_10_19;
            } else if( units_sold >= 20  && units_sold <= 49) {
                discount = PACKAGE_20_49;
            } else if( units_sold >= 50 && units_sold <= 99) {
                discount = PACKAGE_50_99;
            } else {
                discount = PACKAGE_100more;
            }

            // the total cost is calculated by mutlyiplying the quantity, package price
            //and the complement of the discount percentage
            double totalCost = units_sold * PACKAGE_PRICE * (1 - discount/100);

            System.out.println("Total cost of the purchase $" + totalCost);

            scanner.close();
    }
}
