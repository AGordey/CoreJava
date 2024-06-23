package Lecture11.HWConsole;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> list;

    public Shop() {
        list = new ArrayList<>();
    }

    public void addProductInList(Product product) /*throws DuplicateErrorException*/ {
        if (list.contains(product)) {
            System.out.println(" Продукт с "+product.getId()+ " есть в списке и его не добавил");
//            throw new DuplicateErrorException(product.getId());
        }
        list.add(product);
    }

    public List<Product> getAllProducts() {
        return list;
    }

    public void deleteProduct(int id) {
        list.remove(new Product(id));
    }

    public void updateProduct(Product product) {
        int index = list.indexOf(product);
        if (index >= 0) {
            list.set(index, product);
        }
    }

}


