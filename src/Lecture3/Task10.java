package Lecture3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.
*/
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = 0;
        boolean validInput = false; // Переменная для отслеживания корректности ввода

        while (!validInput) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 3) {
                    System.out.print("Введите число больше 3: ");
                } else {
                    validInput = true; // Устанавливаем флаг корректного ввода
                }
            } else {
                System.out.print("Введите корректные данные (число больше 3): ");
                scanner.next(); // Очищаем буфер ввода при некорректных данных
            }
        }
        int[] array = new int[n];
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n);
            if (array[i] % 2 == 0) count++;
        }
        int[] arrayOfEven = new int[count];
        System.out.println(Arrays.toString(array));
//        System.out.println("Четных элементов " + count);
        if (count == 0) {
            System.out.println("Нету четных чисел в массиве, второй массив не создан");
        } else {
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    arrayOfEven[j] = array[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(arrayOfEven));
        }

    }
}

//
//        Random random = new Random();
//        int[] array = new int[20];
//         for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(20);
//             }
//        System.out.println(Arrays.toString(array));
//       for (int i = 0; i < array.length; i++) {
//             if (array[i] % 2 != 0) {
//                 array[i]=0;
//            }
//        }
//        System.out.println(Arrays.toString(array));
