import java.util.ArrayList;
import java.util.Random;

// @author Omaer Chaudhry

public class Round {
    // Field variables
    private GroupOfCards deck;
    private GroupOfCards playersHand;
    private GroupOfCards dealersHand;
    private int roundNumber;
    
    Round(int rN) {
        this.deck = new GroupOfCards();
        this.deck.generateDeck();

        this.playersHand = new GroupOfCards();
        this.dealersHand = new GroupOfCards();

        this.roundNumber = rN;
    }

    public boolean start() {
        boolean lock = true;
        boolean result = false;
    
        ArrayList<String> options = new ArrayList<String>();   
        options.add("Hand Info");
        options.add("Hit");
        options.add("Stand");

        if (this.roundNumber == 1) {
            System.out.println("First round huh, well good luck champ.");
        }
        if (this.roundNumber == 3) {
            System.out.println("Half way there. Lets see if you make it.");
        }
        if (this.roundNumber == 5) {
            System.out.println("Lets hope that luck holds out for one more round.");
        }

        while (lock) {
            int choice = Menu.menu("Round " + this.roundNumber, options, 3);

            if (choice == 0) {
                lock=false;
            } 

            if (choice == 1) {
                System.out.print("Player's Info");
                System.out.print("\n    Number in hand: " + this.playersHand.getCount());
                System.out.println("\n    Sum of hand: " + this.playersHand.getSum());
            }

            if (choice == 2) {
                hit();
                if (playersHand.getSum() > 21) {
                    System.out.println("\nYou lost - Your hand was above 21");
                    result = false;
                    lock = false;
                }
                if (playersHand.getSum() == 21) {
                    System.out.println("\nYou won - Your hand was 21");
                    result = true;
                    lock = false;
                }
            }

            if (choice == 3) {
                stand();
                if (this.playersHand.getSum() > this.dealersHand.getSum() && this.playersHand.getSum() <= 21) {
                    result= true;
                }
                else if (this.playersHand.getSum() < this.dealersHand.getSum() && this.dealersHand.getSum() <= 21) {
                    result= false;
                }
                lock = false;
            }
        }

        return result;
    }

    // hand related methods
    public void hit() {
        serveCard(this.playersHand);
    }

    public void dealerHit() {
        serveCard(this.dealersHand);
    }

    public void serveCard(GroupOfCards hand) {
        Random rand = new Random();
        Card served_card = this.deck.getCards().get(rand.nextInt(this.deck.getCount()));

        this.deck.removeCard(served_card);
        hand.addCard(served_card);
    }

    public void stand() {
        boolean lock = true;
        dealerHit();

        while (lock) {
            if (dealersHand.getSum() > 21) {
                lock = false;
            } else if (dealersHand.getSum() == 21) {
                lock = false;
            } else if (dealersHand.getSum() <= playersHand.getSum()) {
                dealerHit();
            } else if (dealersHand.getSum() < 21 && dealersHand.getSum() > playersHand.getSum()) {
                lock = false;
            }
        }
    }
}
