package Lecture3;

import java.util.Arrays;
import java.util.Random;

/*
7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив
*/
public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(150);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(max + " " + index);
    }
}
