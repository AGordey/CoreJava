package Lecture4;

import java.util.Random;
import java.util.Scanner;
/*
Начало всех задач:
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
2)Вывести нечетные элементы находящиеся под главной
диагональю(включительно).
 */

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы ");
        int a = scanner.nextInt();

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
        System.out.println("Нечетные элементы под главной диагональю НЕ включительно с главной");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i][j] % 2 != 0) System.out.print(array[i][j] + " ");

            }
        }
        System.out.println();
        System.out.println("Нечетные элементы под главной диагональю включительно с главной");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i][j] % 2 != 0) System.out.print(array[i][j] + " ");

            }
        }
    }
}
