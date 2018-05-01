/**
* CSIS 114 Lab Dealhands
*
* @author Drew Theis
* @version 4/29/2018
*/
// imports ArrayList class for use in program
import java.util.ArrayList;

public class Hand
{
    // Declares arraylist cards for class
    private ArrayList<Card> cards;
    /**
     * Constructor for objects of class Hand
     * handles arraylist fors adding cards to players hand
     */
    public Hand()
    {
        cards = new ArrayList <Card> ();
    }
    /**
    * Method for toString
    * @param adds value of element to arraylist cards
    */
    public void addCard(Card c)
    {        
        cards.add(c);
    }
    /**
    * Method for toString
    * @return gives string for card assigned to player hand
    */
    public String toString()
    {
        return cards.toString();
    }
}
