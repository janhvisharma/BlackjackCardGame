package blackjackgame;

import java.util.ArrayList;
import java.util.Collections;

/**
 * GroupOfCards.class is the program that contains the main logic of the game
 * @author Mert Havza, Janhvi Sharma
 * @version 1 August 8, 2019
 */
public class GroupOfCards
{

    //The group of blackJackCards, stored in an ArrayList
    private ArrayList <BlackJackCard> blackJackCards;
    private int size;//the size of the grouping

    /**
     * Constructor
     */
    public GroupOfCards(){
        //Create a new deck of playing blackJackCards
        this.blackJackCards = new ArrayList<BlackJackCard>();

    }

    /**
     * Creates the full card deck
     */
    public void createFullDeck(){
        //Generate Cards
        //Loop Through Suits
        for(Suits cardSuit : Suits.values()){
            //Loop through Values
            for(Values cardValue : Values.values()){
                //Add new card to the mix
                this.blackJackCards.add(new BlackJackCard(cardSuit,cardValue));
            }
        }
    }

    /**
     * A method that will get the group of blackJackCards as an ArrayList
     * @return the group of blackJackCards.
     */
    public ArrayList<BlackJackCard> showCards() {
        return blackJackCards;
    }

    public void shuffle()
    {
        Collections.shuffle(blackJackCards);
    }

    public void removeCard(int index) {
        this.blackJackCards.remove(index);
    }

    public BlackJackCard getCard(int index) {
        return this.blackJackCards.get(index);
    }

    /**
     * @return the size of the group of blackJackCards
     */
    public int getSize() {
        return this.blackJackCards.size();
    }

    public void drawCard(GroupOfCards draw) {

        this.blackJackCards.add(draw.getCard(0));
        draw.removeCard(0);
    }

    /**
     * @param givenSize the max size for the group of blackJackCards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

    //find value method gets the values of each card by using regular expressions.

    /**
     * method for finding the value of the cards using regex
     * @param blackJackCard
     * @return value
     */
    public int findValue(BlackJackCard blackJackCard) {

        int value = 0;

        String ace = ".*ACE$";
        String two = ".*TWO$";
        String three = ".*THREE$";
        String four = ".*FOUR$";
        String five = ".*FIVE$";
        String six = ".*SIX$";
        String seven = ".*SEVEN$";
        String eight = ".*EIGHT$";
        String nine = ".*NINE$";
        String ten = ".*TEN$";
        String jack = ".*JACK$";
        String queen = ".*QUEEN$";
        String king = ".*KING$";

        if(blackJackCard.toString().matches(ace)) {

            value = 1;
        }

        if(blackJackCard.toString().matches(two)) {
            value = 2;
        }

        if(blackJackCard.toString().matches(three)) {
            value = 3;
        }

        if(blackJackCard.toString().matches(four)) {
            value = 4;
        }

        if(blackJackCard.toString().matches(five)) {
            value = 5;
        }

        if(blackJackCard.toString().matches(six)) {
            value = 6;
        }

        if(blackJackCard.toString().matches(seven)) {
            value = 7;
        }

        if(blackJackCard.toString().matches(eight)) {
            value = 8;
        }

        if(blackJackCard.toString().matches(nine)) {
            value = 9;
        }

        if(blackJackCard.toString().matches(ten) || blackJackCard.toString().matches(jack) ||
                blackJackCard.toString().matches(queen) || blackJackCard.toString().matches(king)) {
            value = 10;
        }

        return value;
    }


}//end class
