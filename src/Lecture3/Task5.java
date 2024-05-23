package Lecture3;

import java.util.Arrays;
import java.util.Random;

/*
5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны)
*/
public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(15);
            array2[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
        }
        double average1 = sum1 / array1.length;
        double average2 = sum2 / array2.length;
        if (average1 < average2) {
            System.out.println("Среднее значение второго массива больше");
        } else if (average1 > average2) {
            System.out.println("Среднее значение первого массива больше");
        } else {
            System.out.println("Среднее значение массивов равны");
        }

    }


}

