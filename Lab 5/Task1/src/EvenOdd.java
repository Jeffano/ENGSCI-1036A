/**
 * Name: Jeffano John
 * Date: Thursday Oct. 28th 2021
 * Student Number: 251230759
 * Description: This program reads an integer and determines if the value is odd or even.
 */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        //Creating a scanner object
        Scanner input = new Scanner (System.in);

        //Printing an opening statement
        System.out.println("Enter an Integer:");
        //Initializing and reading an integer from the user
        int number = input.nextInt();
        
        //Using if statement to check if the integer is odd or even and outputting the appropriate response
        if ((number % 2) == 0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
        //Using if statement to check if the integer is odd or even and outputting the appropriate response
        if ((number % 2) == 0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
}
