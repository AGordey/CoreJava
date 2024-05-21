package Lecture1;
/*
6) Даны 2 числа. Вывести большее из них.
 */

public class Task6 {
    public static void main(String[] args) {
        int a = -4;
        int b = 4;
        if (a > 0) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println("Числа равны");
        }
    }
}
