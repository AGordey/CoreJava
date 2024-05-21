package Lecture1;

import java.util.Scanner;
/*
1) В переменную записываем число. Надо вывести на экран сколько в этом
числе цифр и положительное оно или отрицательное. Например, "это
однозначное положительное число". Достаточно будет определить, является ли
число однозначным, "двухзначным или трехзначным и более.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if (a > 0) {
            if (a < 10) {
                System.out.println("Это однозначное положительное число");
            } else if (a < 100) {
                System.out.println("Это двузначное положительное число");
            } else {
                System.out.println("Это трехзначное положительное число");
            }

        } else if (a < 0) {
            if (Math.abs(a) < 10) {
                System.out.println("Это однозначное отрицательное число");
            } else if (Math.abs(a) < 100) {
                System.out.println("Это двузначное отрицательное число");
            } else {
                System.out.println("Это трехзначное отрицательное число");
            }
        }
        else {
            System.out.println("Число равно 0");

        }

    }
}
