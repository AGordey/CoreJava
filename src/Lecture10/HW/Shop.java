package Lecture10.HW;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Shop {
    private List<Product> list = new LinkedList<>();



    public void addProductInList(Product product) {
        if (!list.contains(product)) {
            list.add(product);
        } else {
            System.out.println("Этот продукт уже есть в списке");
        }
    }

    public List<Product> getAllProducts() {
        return list;
    }
    public void deleteProduct(int idOfProduct) {
        Iterator<Product> iterator = list.iterator(); // Создаем итератор для перебора элементов списка

        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == idOfProduct) {
                iterator.remove(); // Удаляем продукт с указанным id
                return; // Завершаем метод после удаления первого продукта с указанным id
            }
        }

        System.out.println("Продукт с указанным id не найден.");
    }
    public void editProduct(Product product, String newName, int newPrice) {
        boolean i = list.contains(product);
        if (i) {
            int a = list.indexOf(product);
            product.setName(newName);
            product.setPrice(newPrice);
            list.set(a,product);
        }
        else {
            System.out.println("Не нашел объект для редактирования");
        }

    }

}
