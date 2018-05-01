/**
* CSIS 114 Lab Dealhands
*
* @author Drew Theis
* @version 4/29/2018
*/

// imports Scanner class for use in program
// imports ArrayList class for use in program
import java.util.Scanner;
import java.util.ArrayList;

public class DealHands
{
    public static void main(String[] args) 
    {
        // Print statement to tell user it's a new deck
        System.out.print("A brand new. Fresh deck");
        // Uses Deck class for generating new deck and printing ordered deck
        Deck newDeck = new Deck();
        // Print statment to tell user the deck is shuffled
        System.out.print("\n\nShuffled");
        // Calls shuffle method in Deck class to shuffle and print deck
        newDeck.shuffle();
        // Prompts the user to input how many players there will be
        System.out.print("\n\nHow many players? ");
        // Uses Scanner to get input from user
        Scanner scan = new Scanner(System.in);
        // Assignes input from user as integer to var players
        int players = scan.nextInt();
        // Uses dealCard method from Desk class passing user input players
        newDeck.dealCard(players);
        
        
        // Print statment to inidicate begining of error testing
        System.out.print("\n\nTest error handling\n");
        
        //System.exit(0);
        
        Card badCard = new Card(4, -1);
        badCard.toString();
    }
}
