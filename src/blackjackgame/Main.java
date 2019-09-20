package blackjackgame;

import java.util.*;

/**
 * Main.class is the program that contains the main method
 * @author Mert Havza, Janhvi Sharma
 * @version 1 August 8, 2019
 */
public class Main  {

    /**
     * Main method
     * @param args
     */
    public static void main (String [] args) {

        BlackJack blackjack = new BlackJack("Blackjack");

        blackjack.play();

        blackjack.declareWinner();


    }



}
