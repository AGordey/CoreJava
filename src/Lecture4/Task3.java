package Lecture4;

import java.util.Random;
import java.util.Scanner;
/*
Начало всех задач:
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
3)Проверить произведение элементов какой диагонали больше
 */

public class Task3 {
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
        int glDiag = 1;
        int pobDiag = 1;
// Вычисляем произведение главной диагонали
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                if (i==j) glDiag*=array[i][j];
        }
//        System.out.println("Произведение главной диагонали "+glDiag);
// Вычисляем произведение побочной диагонали
        for (int i = 0; i < array.length; i++) {
            pobDiag*=(array[i][array.length - i - 1] );
        }
//        System.out.println("Произведение побочной диагонали "+pobDiag);

        System.out.println(glDiag>pobDiag? "Произведение главной диагонали больше" : "Произведение побочной диагонали больше" );
    }
}
