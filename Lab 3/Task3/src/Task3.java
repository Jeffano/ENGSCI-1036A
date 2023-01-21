/**
 * Name: Jeffano John
 * Date: October 7th 2021
 * Student Number: 251230759
 * Description: This program prints the ones and tens digit of the inputted value
 */

import java.util.Scanner;

public class Task3 {
    public static void main (String[] args){

        //defining a Scanner object called scanner
        Scanner scanner = new Scanner(System.in);

        //reads a value from scanner
        int d = scanner.nextInt();

        //finds the ones digit of value d
        int ones = d % 10;

        //finds the tens digit of value d
        int tens = d / 10;

        //prints the ones and tens digit of value d
        System.out.println( ones + "<->" + tens);
    }
}
