package Excercises;

import java.util.Scanner;

public class rockPaperScissors {

    public static int getComputerChoice() {
        return (int) (Math.random() * 3); // 0 | 1 | 2
    }

    /**
     *
     * @param number
     * @return
     */
    public static String numberToString(int number) {
        if (number == 0) {
            return "rock";
        } else if (number == 1) {
            return "paper";
        } else if (number == 2) {
            return "scissor";
        } else {
            return "Invalid choice!";
        }
    }

    /**
     *
     * @param userChoice
     * @param computerChoice
     */
    public static void whoWon(int userChoice, int computerChoice) {
        /*
         * 0 - rock
         * 1 - paper
         * 2 - scissor
         */
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else {

            if (userChoice == 0 && computerChoice == 1) {
                System.out.println("\nOops! you lost.");
                return;
            } else if (userChoice == 0 && computerChoice == 2) {
                System.out.println("Yayy, you won!!");
                return;
            }

            if (userChoice == 1 && computerChoice == 2) {
                System.out.println("Oops! you lost.");
            } else if (userChoice == 1 && computerChoice == 0) {
                System.out.println("Yayy, you won!!");
            }

            if (userChoice == 2 && computerChoice == 0) {
                System.out.println("Oops! you lost.");
            } else if (userChoice == 2 && computerChoice == 1) {
                System.out.println("Yayy, you won!!");
            }

        }
    }

    public static boolean isValidChoice(int userChoice) {
        return (userChoice >= 0 && userChoice < 3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n*To go with 'rock', enter 0 \n*To go with 'paper', enter 1 \n*To go with 'scissor', enter 2 \n");

        System.out.print("Here we go!!! ROCK PAPER SCISSORS: ");
        int userChoice = input.nextInt();

        if (!isValidChoice(userChoice)) {
            System.out.println("Invalid choice!");
        } else {
            System.out.println("You chose: " + numberToString(userChoice));

            int computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + numberToString(computerChoice));

            whoWon(userChoice, computerChoice);
        }

        input.close();
    }
}
