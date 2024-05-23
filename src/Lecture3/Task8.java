package Lecture3;

import java.util.Arrays;
import java.util.Random;

/*
8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве
*/
public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        float[] array3 = new float[10];

         for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(9)+1;
            array2[i] = random.nextInt(9)+1;
            array3[i] = (float)array1[i]/array2[i];
             }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));


        int count=0;
        for (int i = 0; i < array1.length; i++) {
            if (array3[i]%1==0)
                count++;
        }
        System.out.println(count);
    }
}
