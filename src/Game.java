import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {
        int roundNumber = 0;
        int playerWins = 0;
        int playerLosses = 0;

        System.out.println("Welcome to Princess Rescue: Blackjack Edition\n\n");

        ArrayList<String> options = new ArrayList<String>();   
        options.add("Start Game");
        options.add("Info");

        boolean lock = true;
        while (lock) {
            int choice = Menu.menu("Main", options, 2);

            if (choice == 0) {
                lock = false;
            }
            
            if (choice == 1) {
                System.out.println("Good luck Challenger, you will need it.");

                while (roundNumber<5) {
                    roundNumber++;
                    if (playerWins == 3) {
                        roundNumber = 0;
                        playerWins = 0;
                        playerLosses = 0;
                        outcome(true);
                        break;
                    } else if (playerLosses == 3) {
                        roundNumber = 0;
                        playerWins = 0;
                        playerLosses = 0;
                        outcome(false);
                        break;
                    } else {
                        boolean result = playRound(roundNumber);

                        if (result) { playerWins++; }
                        else { playerLosses++; }
                    }
                }
            }

            if (choice == 2) {
                System.out.println("Princess Rescue");
                System.out.print("\nIn Princess Rescue you vie for the hand of a princess through the game of blackjack. ");
                System.out.print("Compete in 5 rounds with an objective to win 3 of them to win the princesses hand in marriage.");
                System.out.print("\n\nCreated by:");
                System.out.print("\n    Project Lead - Zakaria Sekhri");
                System.out.print("\n    Team Members: ");
                System.out.print("\n      -  Mohid Bazian");
                System.out.print("\n      -  Nicholas Parra");
                System.out.println("\n      -  Omaer Chaudry\n");
            }
        }
    }
    
    public static boolean playRound(int rN) {
        Round r = new Round(rN);
        boolean result = r.start();

        return result;
    }

    public static void outcome(boolean didPlayerWin) {
        System.out.print("That was well played.");

        if (didPlayerWin) {
            System.out.println("\n\nCongradulations you WON the princesses hand in marriage. ");
        }
        else {
            System.out.println(" Unfortunately you lost and did not get the princesses hand in marriage");
        }
    }
}
