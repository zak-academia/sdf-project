import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static int menu(String title, ArrayList<String> options, int max_boundary) {
        System.out.println(build_menu(title, options));
        int choice = handleChoice(max_boundary);

        return choice;
    }

    public static String build_menu(String title, ArrayList<String> options) {
        String output = title + " Menu";
        output += "\n    (0) Quit";
        
        for (int i =0; i<options.size(); i++) {
            int j = i + 1;
            output += "\n    (" + j + ") " + options.get(i);
        }
        
        return output;
    }

    public static int handleChoice(int max_boundary) {
        int output = 0;
        boolean lock = true;

        while (lock){
            try {
                System.out.print("\nInput a selection: ");

                Scanner input = new Scanner(System.in);
                int choice = input.nextInt(); // this is causing issues

                if (choice >= 0 && choice <= max_boundary) {
                    output = choice;
                    lock = false;
                } else {
                    System.out.println("You did not input a number between 0 and " + max_boundary);
                }
            } catch (InputMismatchException e) {
                System.out.println("You did not input a number");
            } 
        }
        
        return output;
    }
}