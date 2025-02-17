import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();


        int randomNumber = rand.nextInt(10) + 1;
        int userGuess = 0;


        do {
            System.out.println("Guess random number 1-10: ");

            while (!in.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer 1-10.");
                in.next();
            }
            userGuess = in.nextInt();
        } while (userGuess < 1 || userGuess > 10);

        System.out.println("The random number was: " + randomNumber);

        if (userGuess == randomNumber) {
            System.out.println("Correct");
        } else if (userGuess < randomNumber) {
            System.out.println("Guess too low.");
        } else {
            System.out.println("Guess too high.");
        }


    }
}
