package Lecture3;

import java.util.Arrays;

/*
1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
затем в столбик (отделяя один элемент от другого началом новой строки). Перед
созданием массива подумайте, какого он будет размера.
*/
public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        int[] array = new int[count];
        int numberInArray = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                array[numberInArray] = i;
                numberInArray++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

    }
}
