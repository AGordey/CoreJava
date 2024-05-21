package Lecture2;
/*
2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */
public class Task2 {
    public static void main(String[] args) {

        int ameb = 1;
        for (int i = 3; i <= 24; i += 3) {
            ameb *= 2;
        }
        System.out.println("Количество амеб через 24 часа будет " + ameb);
    }
}

