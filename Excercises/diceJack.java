/* At first The user will be prompt to enter three Random numbers between 1 - 6
 * Then 3 dices Will be rolled  And then the sum off Those two Scenarios and then will be compared
 * If the sum of dice rolls Is  Less than the sum of numbers entered by the user
 *  AND The difference between them is less than 5 then the User wins!
 * If these two conditions do not meet then the user loses the game
 */



package Excercises;
import java.util.Scanner;

public class diceJack {

    /**
     *
     * @return
     */
    public static int rollDice () {
        return (int) (Math.random() * 6) + 1;
    }

    /**
     *
     * @param n1
     * @param n2
     * @param n3
     * @return
     */
    public static boolean isInvalidInput (int n1, int n2, int n3) {
        boolean isLessThan1 = (n1 < 1) || (n2 < 1) || (n3 < 1);
        boolean isMoreThan6 = (n1 > 6) || (n2 > 6) || (n3 > 6);
        return isLessThan1 || isMoreThan6;
    }

    /**
     *
     * @param enteredSum
     * @param randomSum
     */
    public static void sumPrint (int enteredSum, int randomSum) {
        System.out.println("\nSum of entered numbers: " + enteredSum);
        System.out.println("Sum of random numbers: " + randomSum);

        printResult (enteredSum, randomSum);
    }

    /**
     *
     * @param enteredSum
     * @param randomSum
     */
    public static void printResult (int enteredSum, int randomSum) {
        if (enteredSum > randomSum && (enteredSum - randomSum) < 5) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Enter three numbers between 1 and 6: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        if (isInvalidInput(n1, n2, n3)) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        int r1 = rollDice();
        int r2 = rollDice();
        int r3 = rollDice();
        System.out.println("Dice rolled: " + r1 + " " + r2 + " " + r3);

        sumPrint (n1 + n2 + n3, r1 + r2 + r3);

        input.close();
    }
}
