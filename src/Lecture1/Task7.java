package Lecture1;
/*
7) (Дополнительно) В переменную записываете количество программистов. В
зависимости от количества программистов необходимо вывести правильно
окончание. Например:
• 2 программиста
• 1 программиста
• 10 программистов
• и т.д.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String ending = "";
        if (a == 1 || a % 10 == 1) {
            ending = "т";
        } else if (a % 10 == 2 || a % 10 == 3 || a % 10 == 4) {
            ending = "a";
        } else
            ending = "ов";
        System.out.println(a + " программист" + ending);
    }
}
