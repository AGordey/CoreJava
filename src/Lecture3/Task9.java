package Lecture3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
9)Пользователь должен указать с клавиатуры положительное число, а
программа должна создать массив указанного размера из случайных целых
чисел из [0;15] и вывести его на экран в строку. После этого программа должна
определить и сообщить пользователю о том, сумма какой половины массива
больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число,
то выдать соответствующее сообщение
*/
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               int a = 0;
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (a < 0) {
                System.out.println("Недопустимое число");
            }
        }
        Random random = new Random();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(array));

        int middleOfArray = array.length / 2;
        int sumLevo = 0;
        int sumPravo = 0;
        for (int i = 0; i < middleOfArray; i++) {
            sumLevo += array[i];
        }
        for (int i = middleOfArray; i < array.length; i++) {
            sumPravo += array[i];
        }
        if (sumLevo > sumPravo) {
            System.out.println("Левая половина массива больше по сумме элементов");
        } else if (sumLevo < sumPravo) {
            System.out.println("Правая половина массива больше по сумме элементов");
        } else
            System.out.println("Левая и правая по сумме элементов равны");

    }
}
