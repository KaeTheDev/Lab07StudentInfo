import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int studentNum = 0;
        String userResponse = "";

        String repeat = " ";
        Boolean count = false;

        String[] studentNames = {"Mack", "Lynda", "Kae", "Arnold"};
        String[] favColor = {"Green", "Blue", "Purple", "Black"};
        String[] homeTown = {"Miami", "New York", "Detroit", "Seattle"};


        do {
            try {
                System.out.print("Which student would you like to learn more about? (enter 1-4): ");
                studentNum = scan.nextInt();
                scan.nextLine();
                System.out.println("Your student is: " + studentNames[studentNum - 1]);
                count = true;
                System.out.print("What would you like to know? (Enter 'color' or 'hometown'): ");
                userResponse = scan.nextLine();

                if (userResponse.contains("color")) {
                    System.out.println("This student's favorite color is " + favColor[studentNum - 1]);
                } else if (userResponse.contains("home")) {
                    System.out.println("This student is from " + homeTown[studentNum - 1]);
                }
            } catch (Exception e) {
                System.out.println("That is invalid entry. Please try again.");
            }
            System.out.println("Would you like to check another student (Yes/No)?: ");
            repeat = scan.nextLine();
        } while (repeat.equalsIgnoreCase("yes"));
    }
}//END OF MAIN
