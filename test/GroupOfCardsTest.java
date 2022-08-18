/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mohid Bazian, Nicolas Parra, Omaer Chaudrey, Zakaria Sekhri
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
        System.out.println("---------------");
    }

    /**
     * Test of getCards method, of class GroupOfCards.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        GroupOfCards instance = new GroupOfCards();
        ArrayList<Card> expResult =  instance.getCards();
        ArrayList<Card> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getSum method, of class GroupOfCards.
     */
    @Test
    public void testGetSumGood() {
        System.out.println("getSum");
        GroupOfCards instance = new GroupOfCards();
        int expResult = 0;
        int result = instance.getSum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
       @Test
    public void testGetSumBad() {
        System.out.println("getSum");
        GroupOfCards instance = new GroupOfCards();
        int expResult = 1;
        int result = instance.getSum();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCount method, of class GroupOfCards.
     */
    @Test
    public void testGetCountGood() {
        System.out.println("getCount");
        GroupOfCards instance = new GroupOfCards();
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
   @Test
    public void testGetCountBad() {
        System.out.println("getCount");
        GroupOfCards instance = new GroupOfCards();
        int expResult = 1;
        int result = instance.getCount();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    /**
     * Test of addCard method, of class GroupOfCards.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = new Card();
        GroupOfCards instance = new GroupOfCards();
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of removeCard method, of class GroupOfCards.
     */
    @Test
    public void testRemoveCard() {
        System.out.println("removeCard");
        Card card = null;
        GroupOfCards instance = new GroupOfCards();
        instance.removeCard(card);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of generateDeck method, of class GroupOfCards.
     */
    @Test
    public void testGenerateDeck() {
        System.out.println("generateDeck");
        GroupOfCards instance = new GroupOfCards();
        instance.generateDeck();
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
