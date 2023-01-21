/**
 * Name: Jeffano John
 * Date: October 7th 2021
 * Student Number: 251230759
 *
 * Description: This program splits a double value into a whole and fractional part of the number into two separate lines.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task4 {
    public static void main (String[] args){

        //defining a decimal formatting object called df to round to 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");

        //defining a Scanner object called scanner
        Scanner scanner = new Scanner(System.in);

        //reads a double value from scanner
        double d = scanner.nextDouble();

        //converts double value to an integer
        double whole = (int)d;

        //finds the fractional part
        double fractional = d - whole;

        //prints the whole part of the number
        System.out.println(whole);

        //prints the fractional part of the number
        System.out.println(df.format(fractional));
    }
}
