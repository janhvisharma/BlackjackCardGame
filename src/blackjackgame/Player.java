package blackjackgame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Player.class is the program that contains the main logic of the game
 * @author Mert Havza, Janhvi Sharma
 * @version 1 August 8, 2019
 */
public class Player extends User
{
    private String playerID; //the unique ID for this player
    private int totalValue; //total card value
    private int playerCard; //player card value
    private String answer;

    private boolean validation = false;

    //since, player has a option to add more cards, player's hand should be a dynamic array, thus
    //player hand is declared as an arraylist.
    ArrayList <BlackJackCard> playerHand; //arraylist of the player hand

    Random rand = new Random(); //object of the random

    Scanner userInput = new Scanner(System.in); //object of the scanner

    GroupOfCards deck = new GroupOfCards(); //object of the card deck

    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name)
    {
        super();
        playerID= name;
    }

    /**
     * @return the playerID
     */
    public String getPlayerID()
    {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID)
    {
        playerID = givenID;
    }

    /**
     * Method that contains main game logic for the player.
     * @return totalValue
     */
    public int play() {

        totalValue=0; // this value holds the total value of the player's hand

        //a new card deck has been created.
        playerHand = new ArrayList<BlackJackCard>();

        //full card deck has been created.
        deck.createFullDeck();
        //deck is shuffled.
        deck.shuffle();

        for (int i = 0; i < 2; i++) {

            playerCard = rand.nextInt(deck.getSize()); //a random number has generated between 1-52

            playerHand.add(deck.getCard(playerCard)); //with that random number, a random card selected.
            deck.removeCard(playerCard); //selected card is removed from the deck.

        }

        while(true) { //since it is up to player to end the cycle of card picking, this cycle is defined as infinite.

            totalValue = 0;

            for (int i = 0; i < playerHand.size(); i++) { //this for loop calculates the total value of the player's hand.

                System.out.println(playerHand.get(i));
                totalValue += deck.findValue(playerHand.get(i));

            }

            //if the total value surpasses 21, this method will return -1.
            if (totalValue > 21) {
                System.out.println("You have passed 21 you lose.");
                return -1;
            }

            System.out.println("Your total value is " + totalValue);


            do {

                System.out.println("Hit or Stand?");

                answer = userInput.nextLine();

                validation = checkAnswer(answer);

            } while (validation == false);


            totalValue = hitOrStand(answer);

            if(answer.equals("stand")) {

                break;
            }

        }

        return totalValue;

    }

    /**
     * hitOrStand method is used when player askes for a new card or chooses to continue.
     * @param answer
     * @return totalValue
     */
    public int hitOrStand(String answer) {

        //hit means player wants to get a new card.
        if(answer.equals("hit")) {

            //total value is cleared since it is gonna be calculated again

            playerCard = rand.nextInt(deck.getSize()); //random number generated.
            playerHand.add(deck.getCard(playerCard)); //random card has been selected.


        }

        if(answer.equals("stand")) {

            System.out.println("Your total value is "+totalValue);


        }

        else {
            totalValue = -1;
        }

        return totalValue;

    }

    public boolean checkAnswer(String answer) {

        boolean validate = false;

        if(answer.toLowerCase().equals("hit") || answer.toLowerCase().equals("stand")) {
            validate = true;
        }

        return validate;
    }

}
