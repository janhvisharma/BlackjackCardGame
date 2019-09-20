/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of checkAnswer method, of class Player.
     */
    @Test
    public void testCheckAnswerGood() {
        System.out.println("checkAnswer Good Test");
        String answer = "Hit";
        Player instance = new Player("Efe");
        boolean expResult = true;
        boolean result = instance.checkAnswer(answer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of checkAnswer method, of class Player.
     */
    @Test
    public void testCheckAnswerBad() {
        System.out.println("checkAnswer Bad Test");
        String answer = "BADINPUT";
        Player instance = new Player("Efe");
        boolean expResult = false;
        boolean result = instance.checkAnswer(answer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of checkAnswer method, of class Player.
     */
    @Test
    public void testCheckAnswerBoundry() {
        System.out.println("checkAnswer Boundry Test");
        String answer = "Stand";
        Player instance = new Player("Efe");
        boolean expResult = true;
        boolean result = instance.checkAnswer(answer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
