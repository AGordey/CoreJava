package Lecture4;

import java.util.Random;
import java.util.Scanner;
/*
Начало всех задач:
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
строкой и т. д.)
 */

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы ");
        System.out.println();
        int a = 5; // scanner.nextInt();

        int[][] array = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = random.nextInt(50);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[][] array2 = new int[a][a];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array2[i][j] = array[j][i];
            }
        }
        System.out.println("Транспонированная матрица ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

    }
}