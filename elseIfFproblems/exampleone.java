package elseIfFproblems;

import java.util.Scanner;

public class exampleone {
    public static void main(String[] args) {
        //making a new scanner to call what the user inputs
        Scanner scanner = new Scanner(System.in);

        //asking the user what the number is that they are choosing
        System.out.print("input number: ");
        //using int to keep the value they entered 
        int input = scanner.nextInt();

        //calling the if statement with the brackets
        if(input % 2 == 0)
            {
            System.out.println("The number is positive");
            }
        else {
            System.out.println("The number is odd");
        }

        scanner.close();

    }
    
}
