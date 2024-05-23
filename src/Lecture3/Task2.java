package Lecture3;

import java.util.Arrays;

/*
2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
порядке (99 97 95 93 … 7 5 3 1).
*/
public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int numberInArray = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                array[numberInArray] = i;
                numberInArray++;
            }
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }

    }
}
