package blackjackgame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * BlackJack.class is the program that contains the main logic of the game
 * @author Mert Havza, Janhvi Sharma
 * @version 1 August 8, 2019
 */
public class BlackJack extends Game
{
    private final String gameName;//the title of the game
    private ArrayList <Player> players;// the players of the game

    //field variables have been initialized with 0
    private int dealersHand=0; //this holds the total card value of the dealer.
    private int playerScore=0; //this holds the player's score
    private int dealerScore=0; //this holds the dealer's score
    private int rounds;
    private int roundCounter=1;

    private boolean nameValidation = false;
    private boolean roundValidation = false;

    private String playerName;


    Scanner userInput = new Scanner(System.in); //object of the scanner

    BlackJackCard[] dealerHand = new BlackJackCard[2]; //object of the dealer's hand array

    GroupOfCards deck = new GroupOfCards(); //the object of the card deck

    Random rand = new Random(); //object of the random
    

    /**
     * BlackJack Constructor
     * @param givenName
     */
    public BlackJack(String givenName)
    {
        super();
        this.gameName = givenName;
        this.players = new ArrayList <Player>();
    }

    /**
     *
     * @return gameName
     */
    public String getGameName() {
        return this.gameName;
    }

    /**
     * Array List of Player
     * @return players
     */
    public ArrayList <Player> getPlayers() {
        return players;
    }

    /**
     *
     * @param name
     */
    public void setPlayers(String name)
    {
        this.players.add(new Player(name));
    }

    /**
     * play method contains the main logic of the BlackJack game
     */
    public void play() {

        do {

            System.out.println("Enter the player name");

            playerName = userInput.nextLine();

            nameValidation = checkPlayerName(playerName);

        }while(nameValidation == false);

        do {

            System.out.println("Please enter the number of rounds");

            rounds = userInput.nextInt();

            roundValidation =  checkRound(rounds);

        }while(roundValidation == false);




        Player player1 = new Player(playerName); //object of the player.

        BlackJack blackJack = new BlackJack("BlackJack"); //object of the game BlackJack

        deck.createFullDeck(); //full deck has been created.

        deck.shuffle(); //deck has been shuffled.

        while(rounds > 0) { //game ends after 6 rounds.



            for (int i = 0; i < 2; i++) {

                int dealerCard = rand.nextInt(deck.getSize()); //a random number has generated between 1-52

                dealerHand[i] = deck.getCard(dealerCard); //with that random number, a random card selected.
                deck.removeCard(dealerCard); //selected card is removed from the deck.

            }
            System.out.println("\n\n#################################");
            System.out.println(roundCounter+". ROUND !!!");

            System.out.println("Dealers Hand: ");

            for (int i = 0; i < 2; i++) { //dealers hand is calculated.

                System.out.println(dealerHand[i]);

                dealersHand += deck.findValue(dealerHand[i]);

            }

            System.out.println("Dealer's hand value is "+dealersHand+"\n\n");

            int playerCardValue = player1.play(); //play() method has been invoked from the Player class and that
            //method returns the card value of the player.
            //if the player's hand value surpasses 21, the play() method returns -1

            //if players hand surpasses 21 or it is lower than dealer's hand, dealer's score will increase.
            if(playerCardValue < dealersHand || playerCardValue == -1 ) {
                System.out.println("Dealer Won");
                dealerScore++;
                dealersHand = 0;
                //since round ends here, dealersHand value is reset.
            }

            //if they are equal, there will be no increment.
            else if(playerCardValue == dealersHand) {

                dealersHand = 0;

                continue;

            }

            //else, player is won.
            else {
                System.out.println( player1.getPlayerID()+" Won");
                playerScore++;
                dealersHand = 0;
            }

            rounds--;
            roundCounter++;

        }

    }

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public void declareWinner() {

        if(dealerScore>playerScore) {
            System.out.println("The Winner is Dealer.");
        }

        else if(playerScore>dealerScore) {
            System.out.println("The Winner is Player");
        }

    }

    /**
     * this method is used to check the players name. it has to contain letters.
     * @param name
     * @return validation
     */

    public boolean checkPlayerName(String name) {

        boolean validation = false;

            if(name.matches("^[a-zA-Z]*$")) {

                System.out.println("Welcome to BlackJack !!! \n\n");

                validation = true;


            }

            else {

                System.out.println("Player name cannot contain numbers and special characters please" +
                        " try again");

            }

            return validation;

    }

    /**
     * this method is used to check the user input for the round. it must be between 1-7
     * @param round
     * @return validation
     */

    public boolean checkRound(int round) {

        boolean validation = false;

        if(round <1 || round>6) {

            System.out.println("You have to specify a round number between 1-7");

        }

        else {
            System.out.println("This Blackjack Game will be played "+round+" rounds!!\n\n");

            validation = true;
        }

        return validation;

    }


}



