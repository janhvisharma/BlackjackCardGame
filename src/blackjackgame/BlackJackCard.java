package blackjackgame;

/**
 * BlackJackCard.class is the program that creates a single card for blackjack
 * @author Mert Havza, Janhvi Sharma
 * @version 1 August 8, 2019
 */
public class BlackJackCard extends Card
{

    private Suits suit;
    private Values value;

    /**
     * BlackJackCard Constructor
     * @param suit
     * @param value
     */
    public BlackJackCard(Suits suit, Values value){

        this.suit = suit;
        this.value = value;

    }

    /**
     *
     * @return value
     */
    public Values getValue() {

        return this.value;

    }

    /**
     *
     * @return suit and value
     */
    @Override
    public String toString() {

        return this.suit.toString() + "-" + this.value.toString();
    }



}
