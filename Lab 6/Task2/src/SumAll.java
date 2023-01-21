/**
 * Name: Jeffano John
 * Date: Saturday Nov. 13th 2021
 * Student #: 251230759
 * Description: asks the user for a positive nonzero integer value. The program should use a do-while loop to get the sum of all the integers from 1 up to the number
 * entered.
 */
import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        //Initializing a scanner class
        Scanner scanner = new Scanner(System.in);

        //Declaring a variable and assigns a value
        int number;
        int count = 0;
        int sum = 0;

        //Asks the user to print the required integer
        System.out.println("Please print a positive nonzero integer value");

        //Reads the value from the user
        number = scanner.nextInt();

        //Runs the condition of adding all the integers from 1 all the way to the number entered
        do {
            sum += count;
            count++;
        //Checks if the values have been added till the number entered
        } while (count <= number);

        //Prints out the final sum of the values
        System.out.println(sum);
    }
}
