/**
* CSIS 114 Lab Solitaire
*
* @author Drew Theis
* @version 4/5/2018
*/
// imports ArrayList class for use in program
import java.util.ArrayList;

public class Solitaire {
    // declares an ArrayList 'piles'
    private ArrayList <Integer> piles;
    /**
     * Constructor for objects of class Solitaire
     */
    public Solitaire() 
    {
        // declares and set interger 'max' to value 15
        int max = 15;
        // declares and sets interger value of num to random value between 1 and 'max' used for creating inital number of piles
        int num = (int) (Math.random() * max) + 1;
        // Sets 
        piles = new ArrayList <Integer> ();
        // for loop to generate number of cards in each pile
        for (int i=0; i < num; i++)
        {
            // declares and set a temperary value 'tmp' to a random number
            // random number min and max changes per operation based on previous number generated
            // tmp is set by a min of 1 and a chaning value of 'max' minus 'num' plus 'i' which is number of operations
            // 'max' has to generate atleat 1 card in each pile so minus 'num' and adding 'i' accounts for the operations which is equal to the number
            // pile being generated. 'max' gets rewriten by the number of cards added if operation succeeds to keep the amount of total cards 15
            // with a min of 1 in each pile
            int tmp = (int) (Math.random() * (max - num + i)) + 1;
            // if statement looks to see operation is on last operation for number of piles
            if (i == num - 1) 
            {
                // 'max' is added to piles in there statement since it is the last pile and total cards needs to be 15
                piles.add(max);
            }
            // else for normal operation
            else
            {
                // adds 'tmp' to arraylist 'piles'
                piles.add(tmp);
                // sets new 'max' by subtracting newly added cards in value 'tmp'
                max -= tmp;
            }
        }
    }
    /**
    * Method for toString
    * @return gives arraylist to string for solitaireTester
    */
    public String toString() 
    {
        return piles.toString();
    }
    /**
    * Method for over
    * @return gives boolean exspression of true or false to solitaireTester
    * determines if game is over
    */
    public boolean over() 
    {
        // declares and sets 'match' for parameter to end game 
        int[] match = {1,2,3,4,5};
        // for loop to operate same number of times of the length of intergers in 'match'
        for (int i = 0; i < match.length; i++) {
            // if statement compares pile and match per interger
            // indexOf method while return a value of '-1' if match isn;t found in arraylist
            if (piles.indexOf(match[i]) == -1) {
               // returns boolean exspression of false if indexOf method for 'match' returns '-1'
               return false;
            }
        }
        // returns boolean exspression of true when if statement doesn't match '-1'
        return true;
    }
    /**
    * Method for round
    * @param newPile creates new set of piles by removing 1 card from each pile and adding back total to left hand side
    */
    public void round() 
    {
        // declares and sets interger 'newPile' from piles using size method which returns the number of elements
        int newPile = piles.size();
        // for loop to run based on number of elements using size method of 'piles'
        for (int i = 0; i < piles.size(); i++) {
            // subtracts a vlaue of 1 from each pile
            // uses get methed for each element in operation from 'i' then subtracts 1 from that value
            // usses set method to apply new value in position 'i' which is element number in operation
            piles.set(i, (piles.get(i)) - 1);
            // if statement uses get method to set value of element in current opertion if less than or equal to 0
            if (piles.get(i) <= 0) {
                // uses remove method on piles of element numbers from 'i' since value is caught by if statment and value is equal or less than 0
                piles.remove(i);
                // subtract a value of 1 from 'i' since the previous remove method changes elements numbers in arraylist of piles allowing 
                // if statement to compare value of new element number again after change
                i--;
            }
        }
        // uses add method to add value of 'newPile' to position 0 of 'piles'
        piles.add(0, newPile);
    }
}