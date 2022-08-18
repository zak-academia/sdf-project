import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        menuTest();
        //roundTest();
        //GroupOfCardsTest();
    }

    public static void menuTest() {
        boolean lock = true;
    
        ArrayList<String> options = new ArrayList<String>();   
        options.add("continue");
        
        while (lock) {
            int choice = Menu.menu("\nTest", options, 3);

            if (choice == 0) {
                lock=false;
            } 

            if (choice == 1) {
                System.out.print("chose continue");
            }
        }
    }

    public static void roundTest() {
       Round r1 = new Round(1);
       boolean result = r1.start();
       System.out.println(result);
    }

    public void GroupOfCardsTest() {
        GroupOfCards deck = new GroupOfCards();
        deck.generateDeck();

        for (Card c: deck.getCards()) {
            System.out.println(c.toString());
        }

        System.out.println(deck.getCount() + " and  " + deck.getSum());
    }
}
