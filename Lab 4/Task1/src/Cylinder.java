/**
 * Name: Jeffano Jhn
 * Date: Friday October 23rd 2021
 * Student #: 251230759
 * Description: The Cylinder class stores data of the radius and height and calculates the volume, curved surface and total surface area.
 */

public class Cylinder {

    //Declaring the variables and setting the value for PI
    private double dblRadius;
    private double dblHeight;
    private final double PI = 3.14159;

    //Initializing the Cylinder constructor
    public Cylinder(double r, double h){
        dblRadius = r;
        dblHeight = h;
    }

    //The setRadius method sets the radius
    public void setRadius(double r){
        dblRadius = r;
    }

    //The setHeight method sets the height
    public void setHeight (double h){
        dblHeight = h;
    }

    //The getRadius method returns the radius
    public double getRadius(){
        return dblRadius;
    }

    //The getRadius method returns the height
    public double getDblHeight(){
        return dblHeight;
    }

    //The getVolume method returns the volume of the cylinder
    public double getVolume(){
        //Calculates the volume
        double dblVolume = PI * dblRadius * dblRadius * dblHeight;
        //Returns the volume value
        return dblVolume;
    }

    //The getCurvedSurfaceArea method returns the area formed by the curved surface of the cylinder
    public double getCurvedSurfaceArea(){
        //Calculates the curved surface area
        double dblCurvedSurfaceArea = 2 * PI * dblRadius * dblHeight;
        //Returns the curved surface area value
        return dblCurvedSurfaceArea;
    }

    //The getTotalSurfaceArea method returns the total surface area of the cylinder
    public double getTotalSurfaceArea(){
        //Calculates the total surface area
        double dblTotalSurfaceArea = 2 * PI * dblRadius * (dblHeight + dblRadius);
        //Returns the total surface area value
        return dblTotalSurfaceArea;
    }
}

