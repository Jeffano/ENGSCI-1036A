/**
 * Name: Jeffano John
 * Date: Saturday Nov. 13th 2021
 * Student #: 251230759
 * Description: A coin class is made to store the sideup, flip the coin and return the side of the coin
 */
public class Coin {

    //Initializes the varible
    String sideUp;

    //Initializing the coin constructor
    public Coin(String sU){
        sideUp = sU;
    }

    //Returns the side of a coin
    public String getSideUp(){
        return sideUp;
    }

    //Method to flip the coin
    public void toss(){
        //Generates the random number
        int randNumber = (int) Math.round(Math.random());
        //Assigns the proper heads/tails depending on the random number generated
        if (randNumber == 0){
            sideUp = "heads";
        }
        else{
            sideUp = "tails";
        }
    }
}
