/**
 * Name: Jeffano John
 * Date: Saturday Nov. 13th 2021
 * Student #: 251230759
 * Description: A class that generates a coin toss simulator. It has a initial side, then flipped 10 times. Each time the coin is flipped, it is recorded and printed.
 * Then the total number of times heads and tails were counted and printed.
 */

public class CoinTossSimulator {
    public static void main(String[] args) {

        //Initializing the variables and assigning values
        String coinSide = "heads";
        int heads = 0;
        int tails = 0;

        //Creating the coin object
        Coin c = new Coin(coinSide);

        //Tosses the coin for initial side
        c.toss();
        //Prints out the opening statement and initial side by calling the getSideUp method
        System.out.println("The side initially facing up: " + c.getSideUp());
        System.out.println("Now I will toss the coin 10 times");

        //Tosses the coin 10 times
        for (int i = 0; i < 10; i++){
            //Calls the coin toss and getSideUp method to find the side
            c.toss();
            coinSide = c.getSideUp();
            //Checks if the coin side is heads or tails and then recorded
            if (coinSide == "heads"){
                heads++;
            }
            else {
                tails++;
            }
            //Prints out the side for every toss
            System.out.println("Toss: " + coinSide);
        }
        //Prints the total times heads and tails were printed
        System.out.println("Total Heads: " + heads);
        System.out.println("Total Tails: " + tails);
    }
}
