public class RoomDimensions {

    //Initializing variables
    double length,width,area;
    String output;

    //Initializing the room dimension constructor
    public RoomDimensions(double len, double w){
        length = len;
        width = w;
    }

    //Method to find the area and returns the area value
    public double getArea(){
        //Calculates the ara and returns it
        area = length * width;
        return area;
    }

    //Method to return all the dimensions and area with the values
    public String toString(){
        //Creating a output line and returns it
        output = "Length: " + length + " Width: " + width + " Area: " + getArea();
        return output;
    }
}
