/**
 * Name: Jeffano John
 * Date: October 7th 2021
 * Student Number: 251230759
 * Description: This program finds the addition of the squares of the two values inputted.
 */

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args){

        //defining a Scanner object called scanner
        Scanner scanner = new Scanner(System.in);

        //reads a value from scanner
        int aValue = scanner.nextInt();

        //reads the next value from the scanner
        int bValue = scanner.nextInt();

        //calculating the addition of the square of each value
        int solution = ( (aValue * aValue) + (bValue * bValue) );

        //printing the result of the addition of squares of each value
        System.out.println(solution);
    }
}
