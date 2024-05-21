package Lecture2;

/*
4)Составьте программу, вычисляющую A*B, не пользуясь операцией
умножения.
 */
public class Task4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = 0;
        while (b > 0) {
            result +=a;
            b--;
        }
        System.out.println(result);
    }
}

