package com.company;



import java.util.Scanner;

public class Main {

    private static int round = 1;
    private static char[] board = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};
    private static String msgX = "X's turn";
    private static String msgO = "O's turn";
    private static int X;
    private static int Y = Integer.MAX_VALUE;
    private static Scanner sc = new Scanner(System.in);


    private static void run() {

        while (true) {
            System.out.println("Round: " + round++);
            System.out.println(msgX);
            playeXmove();
            System.out.println(msgO);
            playerOmove();

            if (round == 5) {
                System.out.println("It's a DRAAAAAAAAAAAW!");
                return;
            }
        }
    }

    private static void playeXmove() {

        printBoard();

        X = sc.nextInt();
        if (X == Y || X>=9){
            System.out.println("You fuckin blind you chose bad field");
            X = sc.nextInt();
        }
        switch (X) {
            case 0:
                board[0] = 'X';
                break;
            case 1:
                board[1] = 'X';
                break;
            case 2:
                board[2] = 'X';
                break;
            case 3:
                board[3] = 'X';
                break;
            case 4:
                board[4] = 'X';
                break;
            case 5:
                board[5] = 'X';
                break;
            case 6:
                board[6] = 'X';
                break;
            case 7:
                board[7] = 'X';
                break;
            case 8:
                board[8] = 'X';
                break;
        }
        printBoard();
        checkX();
    }



    private static void playerOmove() {
        Y = sc.nextInt();
        if (Y == X || Y>=9){
            System.out.println("You fuckin blind you chose bad field");
            Y = sc.nextInt();

        }
        switch (Y) {
            case 0:
                board[0] = 'O';
                break;
            case 1:
                board[1] = 'O';
                break;
            case 2:
                board[2] = 'O';
                break;
            case 3:
                board[3] = 'O';
                break;
            case 4:
                board[4] = 'O';
                break;
            case 5:
                board[5] = 'O';
                break;
            case 6:
                board[6] = 'O';
                break;
            case 7:
                board[7] = 'O';
                break;
            case 8:
                board[8] = 'O';
                break;

        }
        printBoard();
        checkO();
    }



    private static void checkX() {

        if (board[0] == 'X' && board[1] == 'X' && board[2] == 'X'
                || board[3] == 'X' && board[4] == 'X' && board[5] == 'X'
                || board[6] == 'X' && board[7] == 'X' && board[8] == 'X'
                || board[0] == 'X' && board[4] == 'X' && board[8] == 'X'
                || board[2] == 'X' && board[4] == 'X' && board[6] == 'X'
                || board[0] == 'X' && board[3] == 'X' && board[6] == 'X'
                || board[1] == 'X' && board[4] == 'X' && board[7] == 'X'
                || board[2] == 'X' && board[5] == 'X' && board[8] == 'X') {
            System.out.println("************");
            System.out.println("Winner is X-man");
            System.out.println("************");
            System.exit(0);
        }
    }

    private static void checkO() {

        if (board[0] == 'O' && board[1] == 'O' && board[2] == 'O'
                || board[3] == 'O' && board[4] == 'O' && board[5] == 'O'
                || board[6] == 'O' && board[7] == 'O' && board[8] == 'O'
                || board[0] == 'O' && board[4] == 'O' && board[8] == 'O'
                || board[2] == 'O' && board[4] == 'O' && board[6] == 'O'
                || board[0] == 'O' && board[3] == 'O' && board[6] == 'O'
                || board[1] == 'O' && board[4] == 'O' && board[7] == 'O'
                || board[2] == 'O' && board[5] == 'O' && board[8] == 'O') {
            System.out.println("************");
            System.out.println("Winner is Orangutan");
            System.out.println("************");
            System.exit(0);
        }
    }

    private static void printBoard() {
        System.out.println(" " + board[0]  + " | " + board[1] + " | "  + board[2]);
        System.out.println("***********");
        System.out.println(" " + board[3]  + " | " +  board[4]  + " | " + board[5]);
        System.out.println("***********");
        System.out.println(" " + board[6]  + " | " +  board[7] + " | " +  board[8]);
        System.out.println("***********" );

    }


    public static void main(String[] args) {

        run();

    }
}