/**
 * Name: Jeffano John
 * Date: Saturday Nov. 13th 2021
 * Student #: 251230759
 * Description: uses a while loop to accept, as input, a set of non-negative
 * integers, that is either positive or zero, each written on a separate line.
 * When the program encounters 11, it should stop and output the total length of the sequence so far
 * (not including the final 11)
 */

import java.util.Scanner;

public class StopsAtEleven {
    public static void main(String[] args) {

        //initializing a scanner class
        Scanner scanner = new Scanner(System.in);

        //Defining the count and integer variable
        int count = 0;
        int integer;

        //Asks users to input a value
        System.out.println("Please enter a set of Non-Negative Intgers");

        //reading the values from the scanner
        integer = scanner.nextInt();

        //Creates a while loop to check if the integer is less than 11
        while (integer < 11){
            //Counts the number of values inputted
            count++;
            //Asks the user to input a value again
            integer = scanner.nextInt();
        }

        //Prints the total number of times a number was inputted before an 11 was encountered.
        System.out.println(count);

    }
}
