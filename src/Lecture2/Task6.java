package Lecture2;

/*
6)Напишите программу вывода всех четных чисел от 2 до 100
включительно
 */
public class Task6 {
    public static void main(String[] args) {
        int z=0;
        for (z=2;z<=100;z++){
            if (z%2==0) System.out.println(z);
        }
    }
}

