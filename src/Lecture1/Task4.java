package Lecture1;

/*
4) Даны 3 целых числа. Найти количество положительных чисел в исходном
наборе.
 */
public class Task4 {
    public static void main(String[] args)  {
        int a = -4;
        int b = -4;
        int c = 4;
        int count=0;
        if (a > 0)
            count++;
        if (b > 0)
            count++;
        if (c > 0)
            count++;
        System.out.println("Количество положительных чисел в наборе " + count);
    }
}
