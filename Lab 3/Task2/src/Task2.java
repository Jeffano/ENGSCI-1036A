/**
 * Name: Jeffano John
 * Date: October 7th 2021
 * Student Number: 251230759
 * Description: This program outputs a value after running it through the arithmetic expression
 */

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args){

        //defining a Scanner object called scanner
        Scanner scanner = new Scanner(System.in);

        //reads a value from scanner
        int n = scanner.nextInt();

        //calculating the result after inputting the value n into the arithmetic expression
        int solution = ( ((n +1) * n + 2) * n + 3 );

        //printing the result of the arithmetic expression
        System.out.println(solution);
    }
}
