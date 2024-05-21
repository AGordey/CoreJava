package Lecture1;
/*
5) Даны 3 целых числа. Найти количество положительных и отрицательных
чисел в исходном наборе.
 */

public class Task5 {
    public static void main(String[] args)  {
        int a = -4;
        int b = -4;
        int c = 4;
        int countMoreZero=0;
        int countLessZero=0;
        if (a > 0) {
            countMoreZero++;
        } else if (a<0) {
            countLessZero++;
        }
        if (b > 0){
            countMoreZero++;
        } else if (b<0) {
            countLessZero++;
        }
        if (c > 0){
            countMoreZero++;
        } else if (c<0) {
            countLessZero++;
        }
        System.out.println("Количество положительных чисел в наборе " + countMoreZero);
        System.out.println("Количество отрицательных чисел в наборе " + countLessZero);
    }
}
