import java.util.Scanner;
import java.util.Random;

public class CoinTossGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int wins = 0;
        int losses = 0;
        String playAgain = "Y";

        System.out.println("================================");
        System.out.println("        COIN TOSS GAME");
        System.out.println("================================");

        while (playAgain.equalsIgnoreCase("Y")) {

            System.out.println("\nChoose:");
            System.out.println("1. Heads");
            System.out.println("2. Tails");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice! Please choose 1 or 2.");
                continue;
            }

            if (choice == 1) {
                System.out.println("You chose Heads!");
            } else {
                System.out.println("You chose Tails!");
            }

            // Toss the coin
            int coin = random.nextInt(2);

            String result;

            if (coin == 0) {
                result = "Heads";
            } else {
                result = "Tails";
            }

            System.out.println("Coin Result: " + result);

            // Check winner
            if ((choice == 1 && result.equals("Heads")) ||
                    (choice == 2 && result.equals("Tails"))) {

                System.out.println("🎉 You Win!");
                wins++;

            } else {

                System.out.println("❌ You Lose!");
                losses++;
            }

            System.out.println("\n----------------------------");
            System.out.println("Wins   : " + wins);
            System.out.println("Losses : " + losses);
            System.out.println("----------------------------");

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = sc.next();
        }

        int totalGames = wins + losses;

        System.out.println("\n================================");
        System.out.println("          FINAL SCORE");
        System.out.println("================================");
        System.out.println("Total Games : " + totalGames);
        System.out.println("Wins        : " + wins);
        System.out.println("Losses      : " + losses);
        System.out.println("================================");

        System.out.println("Thank you for playing!");

        sc.close();
    }
}