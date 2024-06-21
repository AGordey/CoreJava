package Lecture11.HwShop;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        try {
            shop.addProductInList(new Product(1, "Колготки ", 50));
            shop.addProductInList(new Product(2, "Носки ", 120));
            shop.addProductInList(new Product(2, "Трусы ", 25));
            shop.addProductInList(new Product(4, "Панталоны ", 75));
            shop.addProductInList(new Product(5, "Подтяжки ", 70));
        } catch (DuplicateErrorException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Просто вывели все товары");
        System.out.println(shop.getAllProducts());
        System.out.println("Вывели все товары с сортировкой по цене по возрастанию");
        Collections.sort(shop.getAllProducts(), new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (Integer.compare(o1.getPrice(), o2.getPrice()));
            }
        });
        System.out.println(shop.getAllProducts());
        shop.deleteProduct(5);
        System.out.println("Вывели товары без удаленного товара ");
        System.out.println(shop.getAllProducts());
        Collections.sort(shop.getAllProducts(), new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare(o2.getId(), o1.getId());
            }
        });
        System.out.println("Вывели товары с сортировкой по более позднему добавлению");
        System.out.println(shop.getAllProducts());
        shop.updateProduct(new Product(1, "Колготищи ", 200));
        System.out.println("После редактирования товара");
        System.out.println(shop.getAllProducts());
    }
}
