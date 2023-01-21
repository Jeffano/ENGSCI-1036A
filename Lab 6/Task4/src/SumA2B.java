/**
 * Name: Jeffano John
 * Date: Saturday Nov. 13th 2021
 * Student #: 251230759
 * Description: Use for-loop to print the sum of all integers from a to b ( a < b), a and b are two user input values
 */
import java.util.Scanner;

public class SumA2B {
    public static void main(String[] args) {
        //Initializing a scanner class
        Scanner scanner = new Scanner(System.in);

        //Asking the user to enter two values
        System.out.println("Enter two values. Value B must be greater than A.");

        //Asking users for value A and reading the value
        System.out.println("Enter Value A");
        int a = scanner.nextInt();

        //Asking users for value B and reading the value
        System.out.println("Enter Value B");
        int b = scanner.nextInt();

        //Initializing a variable and assigning it
        int sum = 0;

        //Uses a for loop to start from value A and add up to value B
        for (int i = a; i <= b; i++){
            //Finds the sum of all the values from A to B inclusive
            sum = sum + i;
        }
        //Prints out the sum of the values.
        System.out.println(sum);
    }
}
