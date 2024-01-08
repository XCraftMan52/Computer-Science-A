package Arrays_2D.Tic_Tac_Toe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] board = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        Scanner input = new Scanner(System.in);
        int Player1Score = 0;
        int Player2Score = 0;
        System.out.println("Welcome to the Tic-Tac-Toe Showdown!");
        System.out.println("Player 1 (X) enter your name below: ");
        String Player1 = input.nextLine();
        System.out.println("Player 2 (O) enter your name below: ");
        String Player2 = input.nextLine();
        boolean endGame = false;
        while (!endGame) {
        System.out.println("This Tic-Tac-Toe showdown will be " + Player1 + " (X) vs. " + Player2 + " (O). Let's begin!");
        System.out.println("Here is the board: ");
        printBoard(board);
        int turn = 1;
        boolean gameOver = false;
        while (!gameOver) {
            String player = "";
            if (turn % 2 == 1) {
                player = Player1;
            } else {
                player = Player2;
            }
            System.out.println(player + " your move! Where do you want to go? (1 - 9)");
            int move = input.nextInt();
            while (move < 1 || move > 9) {
                System.out.println("Please enter a valid number 1 - 9: ");
                move = input.nextInt();
            }
            String piece = "";
            if (turn % 2 == 1) {
                piece = "X";
            } else {
                piece = "O";
            }
            // Detect if a piece is already there
            while (move == 1 && !board[0][0].equals("1") || move == 2 && !board[0][1].equals("2") || move == 3 && !board[0][2].equals("3") || move == 4 && !board[1][0].equals("4") || move == 5 && !board[1][1].equals("5") || move == 6 && !board[1][2].equals("6") || move == 7 && !board[2][0].equals("7") || move == 8 && !board[2][1].equals("8") || move == 9 && !board[2][2].equals("9")) {
                System.out.println("That spot is already taken. Please enter a valid move: ");
                move = input.nextInt();
            }
            switch (move) {
                case 1:
                    board[0][0] = piece;
                    break;
                case 2:
                    board[0][1] = piece;
                    break;
                case 3:
                    board[0][2] = piece;
                    break;
                case 4:
                    board[1][0] = piece;
                    break;
                case 5:
                    board[1][1] = piece;
                    break;
                case 6:
                    board[1][2] = piece;
                    break;
                case 7:
                    board[2][0] = piece;
                    break;
                case 8:
                    board[2][1] = piece;
                    break;
                case 9:
                    board[2][2] = piece;
                    break;
                default:
                    break;
            }
            printBoard(board);
            // Check if game is over
            if (board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2])) {
                gameOver = true;
            } else if (board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2])) {
                gameOver = true;
            } else if (board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2])) {
                gameOver = true;
            } else if (board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0])) {
                gameOver = true;
            } else if (board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1])) {
                gameOver = true;
            } else if (board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2])) {
                gameOver = true;
            } else if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
                gameOver = true;
            } else if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
                gameOver = true;
            } else if (turn == 9) {
                System.out.println("It's a tie!");
                gameOver = true;
            }
            if (turn != 9 && gameOver) {
                if (player.equals(Player1)) {
                    Player1Score++;
                } else {
                    Player2Score++;
                }
                System.out.println("Congratulations, " + player + " -- you win!");
                System.out.println("Score:" + Player1 + ": " + Player1Score + " " + Player2 + ": " + Player2Score);
            }
            System.out.println();
            turn++;
        }
        System.out.println("Would you like to play again? (Y/N)");
        String playAgain = input.next();
        while (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N")) {
            System.out.println("Please enter a valid response (Y/N): ");
            playAgain = input.next();
        }
        if (playAgain.equalsIgnoreCase("N")) {
            endGame = true;
        }
    }


        input.close();
        
    }
    public static void printBoard(String[][] board) {
        System.out.println();
       for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++) {
            System.out.print(" " + board[i][j] + " ");
            if (j % board[i].length != board[i].length - 1) {
                System.out.print("|");
            }
        }
        if (i != board.length - 1) {
            System.out.println("\n-----------");
        }
       }
       System.out.println();

    }
}
