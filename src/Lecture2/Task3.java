package Lecture2;

/*
3)Вычислить: 1+2+4+8+...+256
 */
public class Task3 {
    public static void main(String[] args) {

        int a = 1;
        int sum = 0;
        while (a < 256) {
            if (a == 1) {
                sum += 1;
            };
            a *= 2;
            sum += a;
        }
        System.out.println(sum);
    }
}

