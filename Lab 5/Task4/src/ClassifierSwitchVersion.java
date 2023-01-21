/**
 * Name: Jeffano John
 * Date: Thursday Oct. 28th 2021
 * Student Number: 251230759
 * Description: This program reads a rank from the user and prints the corresponding category using a switch statement
 */
import java.util.Scanner;

public class ClassifierSwitchVersion {
    public static void main(String[] args) {
        //Creating a scanner object
        Scanner input = new Scanner(System.in);

        //Printing an opening statement
        System.out.println("Enter Rank:");
        //Initializing and reading the rank value from the user
        int rank = input.nextInt();

        //Using switch statement to print the category that matches the rank
        switch (rank) {
            case 1:
                System.out.println("Unacceptable");
                break;
            case 2:
                System.out.println("Below Expectations");
                break;
            case 3:
                System.out.println("Meets Expectations");
                break;
            case 4:
                System.out.println("Exceeds Expectations");
                break;
            default:
                System.out.println("A rank between 1 and 4 was not entered");
        }
    }
}
