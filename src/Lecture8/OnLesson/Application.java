package Lecture8.OnLesson;

import java.util.Scanner;

public class Application {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Привет");
        run();
        System.out.println("Пока");
    }


    private void run() {
        while (true) {
            Drawable drawable = selectFigure();
            if (drawable == null) {
                break;
            }
            drawable.draw();
        }
    }

    private Drawable selectFigure() {
        showMenu();
        System.out.println("Выберите фигуру");
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                System.out.println("Введи размер стороны квадрата ");
                int a = scanner.nextInt();
                return new Square(a);
            case 2:

                return new Triangle();

            case 3:
                return new Circle();
            case 0:
                return null;
            default:
                System.out.println("Нет такой фигуры");
                return selectFigure();
        }
    }

    private void showMenu() {
        System.out.println("1-Квадрат");
        System.out.println("2-Треугольник");
        System.out.println("3-Круг");
        System.out.println("0-Выход");
    }
}
