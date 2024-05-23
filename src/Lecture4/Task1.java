package Lecture4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean[] array = new boolean[11];
        for (int i = 0; i < array.length; i++) {
            System.out.print("введи число ");
            int a = scanner.nextInt();
            int b = random.nextInt(2);
            if (a == b) {
                array[i] = true;
            }
        }
        int count = 0;
        System.out.println(Arrays.toString(array));
        for (boolean n : array) {
            if (n) count++;
        }
        if (count< (double)array.length/2) {
            System.out.println("комп выиграл");
            System.out.println("True = " + count);
            System.out.println((double)array.length/2);
        } else { System.out.println("человек выиграл");System.out.println("True = " + count);System.out.println((double)array.length/2);
        }
    }
}
