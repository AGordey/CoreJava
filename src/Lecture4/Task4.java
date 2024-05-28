package Lecture4;

import java.util.Random;
import java.util.Scanner;
/*
Начало всех задач:
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
включительно)
 */

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы ");
        System.out.println();
        int a = 5;//scanner.nextInt();

        int[][] array = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = random.nextInt(10);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {                                 // i= 0 1 2 3 4
            for (int j = 0; j < array.length - i - 1; j++) {      // array.length-i-1= 4 3 2 1 0
                if (array[i][j] % 2 == 0) {
//                    System.out.print(" " +array[i][j]);
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Сумма четных элементов над побочной диагональю равна " + sum);
    }
}
