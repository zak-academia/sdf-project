/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 * @author Zakaria Sekhri August 2-22
 * @author Mohid Bazian August 2022
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {
    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards = new ArrayList<Card>();
    private int count = 0;//the size of the grouping
    private int sum = 0;//the sum of the cards

    public GroupOfCards() {}
    
    public GroupOfCards(ArrayList<Card> list) {
        this.cards = list;

        updateInfo();
    }

    // getters
    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getSum() {
        return this.sum;
    }
   
    public int getCount() {
        return this.count;
    } 

    public void addCard(Card card){
        this.cards.add(card);

        updateInfo();
    }
    
    public void removeCard(Card card){
        this.cards.remove(card);

        updateInfo();
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public void generateDeck() {
        for (Card.Suite s: Card.Suite.values()) {
            for (Card.Value v: Card.Value.values()) {
                this.addCard(new Card(s, v));
            }
        }

        updateInfo();
    }

    private void updateInfo() {
        if (this.cards.size() != 0) {
            for (Card c: this.cards) {
                this.sum += c.convertValue();
            }
        } else {
            this.sum = 0;
        }

        this.count = this.cards.size();
    }
}