package Excercises;

import java.util.Scanner;

public class ticTacToe {

    public static void printBoard(char[][] board) {
        System.out.println();
        System.out.println("\t " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("\t---+---+---");
        System.out.println("\t " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("\t---+---+---");
        System.out.println("\t " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }

    public static boolean isWin(char[][] board, char turn) {
        if ((board[0][0] == turn) && (board[1][0] == turn) && (board[2][0] == turn)) return true;
        if ((board[0][0] == turn) && (board[0][1] == turn) && (board[0][2] == turn)) return true;
        if ((board[0][0] == turn) && (board[1][1] == turn) && (board[2][2] == turn)) return true;
        if ((board[2][0] == turn) && (board[2][1] == turn) && (board[2][2] == turn)) return true;
        if ((board[0][2] == turn) && (board[1][2] == turn) && (board[2][2] == turn)) return true;
        if ((board[0][2] == turn) && (board[1][1] == turn) && (board[2][0] == turn)) return true;
        if ((board[0][1] == turn) && (board[1][1] == turn) && (board[2][1] == turn)) return true;
        return ((board[1][0] == turn) && (board[1][1] == turn) && (board[1][2] == turn));
    }

    public static boolean updateBoard(char[][] board, int x, int y, char turn) {
        if (board[x][y] == ' ') {
            board[x][y] = turn;
            printBoard(board);
            return false;
        } else {
            System.out.println("\n\nSpace already occupied!!");
            printBoard (board);
            return true;
        }
    }

    public static boolean isValidMove(int boardLength, int x) {
        if ((x < boardLength) && (x >= 0)) {
            return true;
        } else {
            System.out.println("Invalid move!! Try again...");
            return false;
        }
    }

    public static int getUserInput(String inputDesire) {
        int x;
        do {
            System.out.print("Enter " + inputDesire + " number: ");
            x = input.nextInt();
        } while (!isValidMove(board.length, x));
        return x;
    }

    static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nLet's play tic tac toe");

        int x, y;
        printBoard(board);

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                do {
                    System.out.println("\nTurn X");
                    x = getUserInput("row");
                    y = getUserInput("column");
                } while (updateBoard (board, x, y, 'X'));

                if (isWin(board, 'X')) {
                    System.out.println("\n\nX wins!!");
                    System.exit(0);
                }
            } else {
                do {
                    System.out.println("\nTurn O");
                    x = getUserInput("row");
                    y = getUserInput("column");
                } while (updateBoard (board, x, y, 'O'));

                if (isWin(board, 'O')) {
                    System.out.println("\n\nO wins!!");
                    System.exit(0);
                }
            } //else block
        } //for loop block

        System.out.println("\n\nIt's a tie!!");

        input.close();
    }
}