package Lecture8.HW;

import java.util.Scanner;

public class Application {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Запущен калькулятор");
        run();
        System.out.println("Завершен калькулятор");
    }


    public void run() {
        while (true) {
            System.out.println("Введите числа над которыми хочешь выполнить операции через пробел");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.nextLine();
            Operation operation = selectOperation(a,b);
            if (operation == null) break;
            operation.calculation();
        }
    }

    public Operation selectOperation(int a, int b) {
        showMenu();
        String operation = scanner.nextLine();
        switch (operation) {
            case "+":
                return new Add(a, b);
            case "-":
                return new Substract(a, b);
            case "*":
                return new Multiply(a, b);
            case "/":
                return new Devide(a, b);
            case "0":
                return null;
            default:
                System.out.println("Введи что то корректное из меню");
                return selectOperation(a,b);


        }
    }


    public void showMenu() {
        System.out.println("Выбери операцию, что ты хочешь сделать с двумя числами");
        System.out.println("+ - для сложения ");
        System.out.println("- - для сложения ");
        System.out.println("* - для сложения ");
        System.out.println("/ - для сложения ");
        System.out.println("Нажми 0 для выхода");
    }

}
