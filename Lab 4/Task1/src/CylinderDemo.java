/**
 * Name: Jeffano Jhn
 * Date: Friday October 22nd 2021
 * Student #: 251230759
 * Description: The program uses methods and classes to read values from the user to calculate volume and surface area of a cylinder.
 */
import java.util.Scanner;

public class CylinderDemo {
    public static void main(String[] args) {
        //Stores the values from the scanner inputted by the user.
        Double radius;
        Double height;

        //Creating the scanner object
        Scanner input = new Scanner(System.in);

        //Reading the radius from scanner
        System.out.println("Enter the radius of a cylinder:");
        radius = input.nextDouble();

        //Reading the height from scanner
        System.out.println("Enter the height of a cylinder:");
        height = input.nextDouble();

        //Creating the Cylinder object
        Cylinder c = new Cylinder(radius,height);

        //Setting the radius and height
        c.setRadius(radius);
        c.setHeight(height);

        //Printing the final statements with values and calculations
        System.out.println("The cylinder's radius is " + radius);
        System.out.println("The cylinder's height is " + height);
        System.out.println("The cylinder's volume is " + c.getVolume());
        System.out.println("The cylinder's curved surface area is " + c.getCurvedSurfaceArea());
        System.out.println("The cylinder's total surface area is " + c.getTotalSurfaceArea());
    }
}
