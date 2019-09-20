package blackjackgame;

/**
 * User.class is the abstract class for the general user
 * @author Mert Havza, Janhvi Sharma
 * @version 1 August 8, 2019
 */
public abstract class User
{
    private String playerID; //the unique ID for this player

    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public User(String name)
    {
        playerID= name;
    }

    public User() {

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
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    public abstract int play();

}
