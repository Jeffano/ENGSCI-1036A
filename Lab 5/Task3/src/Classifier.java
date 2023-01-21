/**
 * Name: Jeffano John
 * Date: Thursday Oct. 28th 2021
 * Student Number: 251230759
 * Description: This program reads a rank from the user and prints the corresponding category.
 */
import java.util.Scanner;

public class Classifier {
    public static void main(String[] args) {
        //Creating a scanner object
        Scanner input = new Scanner (System.in);

        //Printing an opening statement
        System.out.println("Enter Rank:");
        //Initializing and reading the rank value from the user
        int rank = input.nextInt();

        //Using nested if-else statement to check if a value between 1 and 4 has been entered
        if (rank >= 1 && rank <= 4){
            //Runs another if-else statement to print the appropriate category
            if (rank == 1){
                System.out.println("Unacceptable");
            }
            else if (rank == 2){
                System.out.println("Below Expectations");
            }
            else if (rank == 3){
                System.out.println("Meets Expectations");
            }
            else if (rank == 4){
                System.out.println("Exceeds Expectations");
            }
        }
        else {
            System.out.println("A rank between 1 and 4 was not entered");
        }
    }
}
