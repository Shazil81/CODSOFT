import java.util.*;
public class project1{
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to the NUMBER GAME ! ");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            guess = sc.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations, you guessed the number!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again:");
            } else {
                System.out.println("Your guess is too high. Try again:");
            }
        }

        sc.close();
    }
}