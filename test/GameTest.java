/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class GameTest {
    
    public GameTest() {
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
     * Test of playRound method, of class Game.
     */
    @Test
    public void testPlayRoundGood() {
        System.out.println("playRound");
        int rN = 0;
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
        public void testPlayRoundBad() {
        System.out.println("playRound");
        int rN = 0;
        boolean expResult = true;
        boolean result = false;
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of outcome method, of class Game.
     */
    @Test
    public void testOutcome() {
        System.out.println("outcome");
        boolean didPlayerWin = false;
        Game.outcome(didPlayerWin);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
