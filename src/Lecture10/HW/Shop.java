package Lecture10.HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shop {
    private List<Product> list;

    public Shop() {
        list = new ArrayList<>();
    }

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
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idOfProduct) {
                index = i;
                break;
            }
        }
    if (index>=0) {
        list.remove(index);
    }
    }
;
    public void updateProduct(Product product) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == product.getId()) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            list.set(index, product);
        }
    }

}


