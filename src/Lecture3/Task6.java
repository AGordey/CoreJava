package Lecture3;

import java.util.Arrays;
import java.util.Random;

/*
6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью
*/
public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        boolean a = true;
        int t = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                break;
            }

            if (array[i] > array[i + 1]) {
                a = false;
            }
        }
        if (a) {
            System.out.println("Последовательность возрастающая");
        } else {
            System.out.println("Последовательность не возрастающая");
        }
    }

}

