public class RoomCarpet {

    //Initializing the variables
    private RoomDimensions size;
    private double carpetCost;

    //Initializing the room carper constructor
    public RoomCarpet(RoomDimensions dim, double cost){
        size = dim;
        carpetCost = cost;
    }

    //Method that returns the calculated total cost of the carpet
    public String getTotalCost(){
        //Gets the area of the carper from the RoomDimensions class
        double area = size.getArea();
        //Calculates the area
        double totalCost = area * carpetCost;
        //Returns the total cost to 2 decimal places
        return String.format("%.02f", totalCost);
    }

    //Method to return the carpet cost
    public String toString(){
        //Creates the output by calling the total cost method and returns it
        String output = "Carpet Cost: $" + getTotalCost();
        return output;
    }
}
