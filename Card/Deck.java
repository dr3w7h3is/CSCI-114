/**
* CSIS 114 Lab Dealhands
*
* @author Drew Theis
* @version 4/29/2018
*/
// imports ArrayList class for use in program
import java.util.ArrayList;

public class Deck
{
    private ArrayList<Card> cards;
    /**
     * Constructor for objects of class Deck
     * 
     * Create initial list of cards set to standard 52 deck of playing cards
     */
    public Deck()
    {
        // Delcares vairbales to used within the Constructor
        cards = new ArrayList <Card> ();
        int setZero = 0;
        int suitMin = 0;
        int suitMax = 3;
        int rankMin = 2;
        int rankMax = 14;
        int lineBreak = 13;
        // For loop generates the suit to be passed from 0 to 3 
        for(int operationSuit = suitMin; operationSuit <= suitMax; operationSuit++)
        {
            // For loop generates the rank to be passed from 2 to 52
            for(int randomRank = rankMin; randomRank <= rankMax; randomRank++)
            {
                // Adds value from return of Card class passing in order suit and rank
                cards.add(new Card(operationSuit,randomRank));
            }
        }
        // For loop for printing the ordered set of the generated deck starts at 0 continues until operation reaches the size of the Deck
        for (int newPrint = 0; newPrint < cards.size(); newPrint++)
        {
            // If statement to neatly print list cards by adding a line break operation with no remainder of value 14 since there are 14 cards per rank
            if (newPrint % lineBreak == setZero)
            {
                System.out.println();
            }
            // Prints element from cards by getting value in operation
            System.out.print(cards.get(newPrint) + " ");
        }
    }
    /**
    * Method shuffle
    * @param gives string for card values formats suit and rank
    */
    public void shuffle()
    {
        // Delcares vairbales to used within the method
        int max = cards.size();
        int lineBreak = 13;
        int setZero = 0;
        // For loop that runs for unil reaching the size of list cards default it 52
        for (int shuffleOperation = 0; shuffleOperation  < cards.size(); shuffleOperation++)
        {
            // Generates a random number from 1 to max
            int random = (int) (Math.random() * max);
            // Gets random element from cards that then assigns that to the end of the list
            cards.add(max, cards.get(random));
            // Removes the element from cards
            cards.remove(random);
            // Decreases the value of max by for every operation
            max--;
        }
        for (int shufflePrint = 0; shufflePrint < cards.size(); shufflePrint++)
        {
            // If statement to neatly print list cards by adding a line break operation with no remainder of value 14 since there are 14 cards per rank
            if (shufflePrint % lineBreak == setZero)
            {
                System.out.println();
            }
            // Prints element from cards by getting value in operation
            System.out.print(cards.get(shufflePrint) + " ");
        }
    }
    /**
    * Method dealCard
    * @param gives string for card values formats suit and rank
    */
    public void dealCard(int players)
    {
        // Delcares vairbales to used within the method
        int lineBreak = 13;
        int maxCards = 5;
        int setZero = 0;
        int playerCard;
        // For loop the operates for as many players starting at 1 than max operation is based on value passed to method
        for (int playerNum = 1; playerNum <= players; playerNum++)
        {
            // Sets player card back to 0 before each operation of dealing a player hand
            playerCard = 0;
            // Creates new instance of newHand using the Hand class for each operation of dealing players hand
            Hand newHand = new Hand();
            // For loop runs until dealing var maxCards default set to 5
            for (int cardNum = 0; cardNum < maxCards; cardNum++)
            {
                // Adds element value from playerCard from cards and asigns it to newHand
                newHand.addCard(cards.get(playerCard));
                // Removes the new assinged card from list cards
                cards.remove(playerCard);
                // New value assigned to playerCard taking playerCard pervious value and adding the differance from players to playerNum
                playerCard += players - playerNum;
            }
            // Prints player number and string value of hand in newHand
            System.out.print("Player: " + playerNum + newHand + "\n");
        }
        // Print statment to show what cards are left
        System.out.print("\nWhat remains");
        
        for (int dealPrintOp = 0; dealPrintOp < cards.size(); dealPrintOp++)
        {
            // If statement to neatly print list cards by adding a line break operation with no remainder of value 14 since there are 14 cards per rank
            if (dealPrintOp % lineBreak == setZero)
            {
                System.out.println();
            }
            // Prints element from cards by getting value in operation
            System.out.print(cards.get(dealPrintOp) + " ");
        }
    }
    /**
    * Method for toString
    * @return gives arraylist to string for DealHands
    */
    public String toString()
    {
        return cards.toString();
    }
}
