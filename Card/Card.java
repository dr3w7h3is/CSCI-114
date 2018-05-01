/**
* CSIS 114 Lab Dealhands
*
* @author Drew Theis
* @version 4/29/2018
*/

public class Card
{
    //creates Constant interger rank and suit
    private final int rank;
    private final int suit;
    /**
     * Constructor for objects of class Card
     * set passed values in creating rank and suit
     * checks passed values to check if input is valid to be assigned
     */
    public Card(int inSuit, int inRank)
    { 
        // Sets rank to passed interger value inRank
        rank = inRank;
        // Sets suit to passed interger value inSuit
        suit = inSuit;
        // If statement to check if input is valid rank, if rank less than 2 or greater than 14, it is invalid
        if (rank < 2 || rank > 14) 
        {
            // Print statment to inform of error
            System.out.println("In Card: Constructor() var: inRank not valid: " + inRank);
            //System.exit();
        }
        // If statement to check if input is valid suit, if suit less than 0 or greater than 3, it is invalid
        if (suit < 0 || suit > 3) 
        {
            // Print statment to inform of error
            System.out.println("In Card: Constructor() var: inSuit not valid: " + inSuit);
            //System.exit();
        }
    }
    /**
    * Method for toString
    * @return gives string for card values formats suit and rank
    * takes passed values to assign rank and suit value of individual card
    * takes numbers larger than 10 to be respective values for J, Q, K, A
    * takes interger value for suit and assigns clubs, diamonds, hearts, and spades
    */
    public String toString()
    {
        // Declares and set vars used in method
        int minNum = 2;
        int maxNum = 10;
        int jack = 11;
        int queen = 12;
        int king = 13;
        int ace = 14;
        int clubs = 0;
        int diamonds = 1;
        int hearts = 2;
        int spades = 3;
        String outRankSuit = "";
        // If statment to check if rank is between minNUm and maxNum to assign to outRankSuit
        if (rank >= minNum && rank <= maxNum)
        {
            outRankSuit += rank;
        }
        // If statement to check if rank is equal to value jack (default 11) to assign 'J' to the string ourRandSuit
        else if (rank == jack)
        {
            outRankSuit += 'J';
        }
        // If statement to check if rank is equal to value queen (default 12) to assign 'Q' to the string ourRandSuit
        else if (rank == queen)
        {
            outRankSuit += 'Q';
        }
        // If statement to check if rank is equal to value king (default 13) to assign 'K' to the string ourRandSuit
        else if (rank == king)
        {
            outRankSuit += 'K';
        }
        // If statement to check if rank is equal to value jack (default 14) to assign 'A' to the string ourRandSuit
        else if (rank == ace)
        {
            outRankSuit += 'A';
        }
        // If statement to check if suit is equal to value clubs (default 0) to assign unicode character '\u2663' to the string ourRandSuit
        if (suit == clubs) 
        {
            outRankSuit += '\u2663';
        }
        // If statement to check if suit is equal to value diamonds (default 1) to assign unicode character '\u2662' to the string ourRandSuit
        else if (suit == diamonds) 
        {
            outRankSuit += '\u2662'; 
        }
        // If statement to check if suit is equal to value hearts (default 2) to assign unicode character '\u2661' to the string ourRandSuit
        else if (suit == hearts) 
        {
             outRankSuit += '\u2661';
        }
        // If statement to check if suit is equal to value spades (default 3) to assign unicode character '\u2660' to the string ourRandSuit
        else if (suit == spades) 
        {
            outRankSuit += '\u2660';
        }
        // Returns outRankSuit
        return outRankSuit.toString();
    }
}
