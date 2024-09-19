package card;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Keenan Dias
 * @studentNumber 991731074
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // Random value between 1 and 13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // Random suit from the SUITS array
            magicHand[i] = c;
        }
        
        // Hard-coded luckyCard
        Card luckyCard = new Card();
        luckyCard.setValue(2); // Choose your card number
        luckyCard.setSuit("Clubs"); // Choose your card suit
        
        // Search the magic hand for the lucky card
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        // Report the result
        if (found) {
            System.out.println("Congratulations! The lucky card is in the magic hand.");
        } else {
            System.out.println("Sorry, the lucky card is not in the magic hand.");
        }
        
        // Display the magic hand
        System.out.println("The magic hand contains: ");
        for (Card card : magicHand) {
            System.out.println(card);
        }
        
        System.out.println("The lucky card is: " + luckyCard);
    }
}
