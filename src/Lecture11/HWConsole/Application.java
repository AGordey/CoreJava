package Lecture11.HWConsole;

import java.util.List;
import java.util.Scanner;

public class Application extends Shop {
    private Scanner scanner = new Scanner(System.in);
    Shop shop = new Shop();

    public void start() {
        System.out.println("Вас приветствует Магазин");
        run();
        System.out.println("Вы вышли из магазина, до свидания");
    }

    private void run() {
        while (true) {
            System.out.println("Введите число для выбора типа операции");
            showMenu();

            }
        }


    public boolean selectOperation() {
        int i = scanner.nextInt();
        scanner.nextLine();
        switch (i) {
            case 1:
                List<Product> products = shop.getAllProducts();
                if (products.isEmpty()) {
                    System.out.println("Список товаров пуст");
                } else {
                    for (Product product : products) {
                        System.out.println(product);
                    }
                }
                break;
            case 2:
                System.out.println("Введите id, наименование и цену товара через пробел");
                int id = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера
                String name = scanner.nextLine();
                int price = scanner.nextInt();
                Product product = new Product(id, name, price);
                shop.addProductInList(product);
                System.out.println("Товар добавлен");
                break;
//            case 3:
//                return ;
//            case 4:
//                return ;
            case 0:
                return false;
            default:
                System.out.println("Введи что то корректное из меню");
                return true; //selectOperation();
        }
        return false;
    }

    public void showMenu() {
        System.out.println("Выбери опцию, что ты хочешь сделать");
        System.out.println("1 - Вывести все товары ");
        System.out.println("2 - Добавление товара ");
        System.out.println("3 - Удаление товара ");
        System.out.println("4 - Редактирование товара ");
        System.out.println("0 - для выхода");
    }
}
