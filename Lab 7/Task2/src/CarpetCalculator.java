import java.util.Scanner;

public class CarpetCalculator {
    public static void main(String[] args) {
        //Creating a scanner object
        Scanner input = new Scanner(System.in);

        //Initializing the variables
        double cost,length,width;

        //Asks the user to input the price per square foot and reads it
        System.out.println("Enter the price per square foot:");
        cost = input.nextDouble();

        //Asks the user to for length and reads it
        System.out.println("Enter the length of the room:");
        length = input.nextDouble();

        //Asks the user for the width and reads it
        System.out.println("Enter the width of the room:");
        width = input.nextDouble();

        //Creating the roomdimensions and roomcarpet objects
        RoomDimensions rd = new RoomDimensions(length,width);
        RoomCarpet rc = new RoomCarpet(rd,cost);

        //Prints the dimensions and total cost by calling the class
        System.out.println("Room Dimensions");
        System.out.println(rd.toString());
        System.out.println(rc.toString());
    }
}
