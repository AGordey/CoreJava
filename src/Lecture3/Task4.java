package Lecture3;

import java.util.Arrays;
import java.util.Random;

/*
4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке.
*/
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
         for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
             }
        System.out.println(Arrays.toString(array));
       for (int i = 0; i < array.length; i++) {
             if (array[i] % 2 != 0) {
                 array[i]=0;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
