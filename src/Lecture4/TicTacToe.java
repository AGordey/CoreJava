package Lecture4;

import java.util.Scanner;

public class TicTacToe {
    public static int[] coordinates;
    public static int countStep = 0;
    private static final char[][] board = new char[3][3];
    public static boolean win = false;
    public static String firstPlayer;
    public static String secondPlayer;


    public static void enterNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока за 'X' ");
        firstPlayer = scanner.nextLine();
        System.out.print("Введите имя второго игрока за 'О' ");
        secondPlayer = scanner.nextLine();
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '.';
            }
        }
    }

    public static void showBoard(char[][] board) {
        System.out.println("Игровая доска");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void putStep(int[] coordinates) {
        if (board[coordinates[0] - 1][coordinates[1] - 1] == '.') {
            if (countStep % 2 == 0) {
                board[coordinates[0] - 1][coordinates[1] - 1] = 'X';
            } else {
                board[coordinates[0] - 1][coordinates[1] - 1] = 'О';
            }
            countStep++;
        } else {
            System.out.println("Ячейка занята. Повторите ввод");
        }
    }

        public static int[] enterCoordinatesForStep () {
            System.out.println("Введите координаты вашего хода от 1 до 3 включительно");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введи координату a= ");
            int a = scanner.nextInt();
            System.out.println();
            if (a < 1 || a > 3) {
                System.out.print("Ввели некорректную координату, повторите ввод =");
                a = scanner.nextInt();
            }

            System.out.print("Введи координату b= ");
            int b = scanner.nextInt();
            System.out.println();
            if (b < 1 || b > 3) {
                System.out.print("Ввели некорректную координату, повторите ввод =");
                b = scanner.nextInt();
            }
            coordinates = new int[]{a, b};
            return coordinates;
        }


        public static boolean checkWin () {
            int count = 0;
            for (int p = 0; p < 3; p++) {
                for (int t = 0; t < 3; t++) {
                    if (board[p][t] == '.') {
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Ничья. Свободные поля закончились");
                win = true;
            }
            //проверить горизонтали для Х
            for (int i = 0; i < 3; i++) {

                if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X' ||     //проверить горизонтали
                        board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X' || //проверяем вертикали
                        board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' || // проверяем главную диаг
                        board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') { // проверяем побочную диаг
                    System.out.println("Выиграл " + firstPlayer + "! Игра окончена");
                    win = true;
                    break;
                }
                if (board[i][0] == 'О' && board[i][1] == 'О' && board[i][2] == 'О' ||     //проверить горизонтали
                        board[0][i] == 'О' && board[1][i] == 'О' && board[2][i] == 'О' || //проверяем вертикали
                        board[0][0] == 'О' && board[1][1] == 'О' && board[2][2] == 'О' || // проверяем главную диаг
                        board[0][2] == 'О' && board[1][1] == 'О' && board[2][0] == 'О') { // проверяем побочную диаг
                    System.out.println("Выиграл " + secondPlayer + "! Игра окончена");
                    win = true;
                    break;
                }

            }
            return win;
        }

        public static void main (String[]args){
            enterNames();
            initializeBoard(board); // cоздал игровое поле
            showBoard(board); // показал игровое поле
            while (!win) {
                enterCoordinatesForStep();
                putStep(coordinates);
                showBoard(board);
                checkWin();
            }
        }
    }

