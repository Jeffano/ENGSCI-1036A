import java.util.Scanner;

/**
 * Name: Jeffano John
 * Date: October 7th 2021
 * Student Number: 251230759
 * Description: This program calculates the total and gratuity rate from the user inputted subtotal and gratuity rate.
 */

public class Quiz3 {
    public static void main (String[] args){

        //defining a Scanner object called scanner
        Scanner scanner = new Scanner(System.in);

        //Asks user for the subtotal
        System.out.println("Enter Subtotal: ");

        //reads the subtotal from scanner
        double subTotal = scanner.nextInt();

        //Asks user for the gratuity rate
        System.out.println("Enter Gratuity: ");

        //reads the gratuity rate from scanner
        double gratuityRate = scanner.nextInt();

        //Calculating gratuity
        double gratuity = subTotal * gratuityRate/100;

        //Calculating total
        double total = subTotal + gratuity;

        //Prints the final amount and gratuity amount
        System.out.println("The Gratuity is $" + gratuity + " and total is $" + total);
    }
}
