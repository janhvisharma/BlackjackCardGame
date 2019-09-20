package blackjackgame;


import java.util.ArrayList;

/**
 * Game.class abstract of the card games
 * @author Mert Havza, Janhvi Sharma
 * @version 1 August 8, 2019
 */
public abstract class Game
{
    private String gameName = "";//the title of the game
    private ArrayList <Player> players;// the players of the game

    /**
     * Game constructor
     * @param givenName
     */
    public Game(String givenName)
    {
        gameName = givenName;
        players = new ArrayList();
    }

    /**
     * Default constructor for Game
     */
    public Game() {

    }

    /**
     * @return the gameName
     */
    public String getGameName()
    {
        return gameName;
    }

    /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers()
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players)
    {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();



}//end class
