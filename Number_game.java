import java.util.*;
public class Number_game {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Random ran =new Random();
        System.out.println("Welcome to The Game");
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = ran.nextInt(100) + 1;
            int attempts = 0;
            int uptoAttempts = 7;

            System.out.println("Selected a number between 1 and 100.");

            while (attempts < uptoAttempts) {
                System.out.print("Enter your guess: ");
                int Guess = sc.nextInt();
                sc.nextLine();

                attempts++;

                if (Guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (Guess < targetNumber) {
                    System.out.println("Too small Number! Try again.");
                    System.out.println("You Loss "+attempts+" attempt");
                } else {
                    System.out.println("Too high  Number! Try again.");
                    System.out.println("You Loss "+attempts+" attempt");
                }
            }

            if (attempts >= uptoAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = sc.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your score: " + score);

        sc.close();

    }
    
}
