import java.util.Random;

/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves
 * as a modifier.
 *
 * @author dancye
 * @author Mohid Bazian, Zakaria Sekhri, Omaer Chaudrey, Nicolas Parrera
 */
public class Card {

    public enum Suite {
        ACE, KING, QUEEN, JACK
    } // Cards by Suite Name

    public enum Value {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE
    } // Cards by Value

    // Variable Initialization
    private Suite suite; 
    private Value value;

    // Constructors
    public Card() {
        Random rand = new Random();
        this.suite = Suite.values()[rand.nextInt(Suite.values().length)];
        this.value = Value.values()[rand.nextInt(Value.values().length)];
    }

    public Card(Suite cSuit, Value cValue) {
        this.suite = cSuit;
        this.value = cValue;
    }

    // Getters and Setters
    public Suite getSuite() {
        return suite;
    }

    public Value getValue() {
        return value;
    }

    public int convertValue() {
        return this.value.ordinal() + 1;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}