package Lecture4;

import java.util.Scanner;

/*
массивы int
логика
проверки - нет выхода за пределы поля, на то занята ли эта ячейка, проверка на выигрыш,
 */
public class TicTacToe {
    public static int[] coordinates;
    public static int countStep = 0;
    private static char[][] board = new char[3][3];
    public static boolean win = false;
    public static String firstPlayer;
    public static String secondPlayer;


    public static void  enterNames(){
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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void putStep(int[] coordinates) {
        if (countStep % 2 == 0) {
            board[coordinates[0] - 1][coordinates[1] - 1] = 'X';
        } else {
            board[coordinates[0] - 1][coordinates[1] - 1] = 'O';
        }
        countStep++;

    }

    public static int[] enterCoordinatesForStep() {
        System.out.println("Введите координаты вашего хода от 1 до 3 включительно");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи координату a= ");
        int a = scanner.nextInt();
        if (a < 1 || a > 3) {
            System.out.print("Ввели некорректную координату, повторите ввод =");
            a = scanner.nextInt();
        }

        System.out.print("Введи координату b= ");
        int b = scanner.nextInt();
        if (b < 1 || b > 3) {
            System.out.print("Ввели некорректную координату, повторите ввод =");
            b = scanner.nextInt();
        }
        coordinates = new int[]{a, b};
        return coordinates;
    }


    public static boolean checkWin() {
        //проверить горизонтали
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X' ||
                    board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                win = true;
            }
            //проверяем вертикали
            for (int j = 0; j < 3; j++) {
                if (board[0][j] == 'X' && board[1][j] == 'X' && board[2][j] == 'X' ||
                        board[0][j] == 'O' && board[1][j] == 'O' && board[2][j] == 'O') {
                    win = true;
                }
                //проверяем главную диагональ
                if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ||
                        board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
                    win = true;
                }
                //проверяем побочную диагональ
                if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X' ||
                        board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                    win = true;
                }
            }
        }
        return win;
    }

    public static boolean checkDraw() {

    };


//    public static void somebodyWin() {
//            System.out.println("Игра прекращена. Кто то выиграл");
//    }


    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        initializeBoard(board); // cоздал игровое поле
        showBoard(board); // показал игровое поле
        while (!win) {
            enterCoordinatesForStep();
            putStep(coordinates);
            showBoard(board);
            checkWin();
        }
        System.out.println("Игра прекращена. Кто то выиграл");
    }
}

