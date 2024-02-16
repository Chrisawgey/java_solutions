package elseIfFproblems;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int inputnum = input.nextInt();

        if(inputnum % 2 == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("the number is odd");
        }
        
        input.close();


    }
    
}
