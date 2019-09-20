/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author efehavza
 */
public class BlackJackTest {
    
    public BlackJackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of checkPlayerName method, of class BlackJack.
     */
    @Test
    public void testCheckPlayerNameGood() {
        System.out.println("checkPlayerName Good Test");
        String name = "Mert";
        BlackJack instance = new BlackJack("BlackJack");
        boolean expResult = true;
        boolean result = instance.checkPlayerName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of checkPlayerName method, of class BlackJack.
     */
    @Test
    public void testCheckPlayerNameBad() {
        System.out.println("checkPlayerName Bad Test");
        String name = "Mert123";
        BlackJack instance = new BlackJack("BlackJack");
        boolean expResult = false;
        boolean result = instance.checkPlayerName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of checkPlayerName method, of class BlackJack.
     */
    @Test
    public void testCheckPlayerNameBoundry() {
        System.out.println("checkPlayerName Boundry Test");
        String name = "EFE";
        BlackJack instance = new BlackJack("BlackJack");
        boolean expResult = true;
        boolean result = instance.checkPlayerName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of checkRound method, of class BlackJack.
     */
    @Test
    public void testCheckRoundGood() {
        System.out.println("checkRound Good Test");
        int round = 4;
        BlackJack instance = new BlackJack("BlackJack");
        boolean expResult = true;
        boolean result = instance.checkRound(round);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of checkRound method, of class BlackJack.
     */
    @Test
    public void testCheckRoundBad() {
        System.out.println("checkRound Bad Test");
        int round = 7;
        BlackJack instance = new BlackJack("BlackJack");
        boolean expResult = false;
        boolean result = instance.checkRound(round);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of checkRound method, of class BlackJack.
     */
    @Test
    public void testCheckRoundBoundry() {
        System.out.println("checkRound Boundry Test");
        int round = 1;
        BlackJack instance = new BlackJack("BlackJack");
        boolean expResult = true;
        boolean result = instance.checkRound(round);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
    
}
