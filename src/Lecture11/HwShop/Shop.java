package Lecture11.HwShop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class   Shop {
    private List<Product> list;

    public Shop() {
        list = new ArrayList<>();
    }

    public void addProductInList(Product product) throws DuplicateErrorException {
        if (list.contains(product)) {      //Если продукт существует (результат true в условии), то выкидываем ошибку
            throw new DuplicateErrorException(product.getId());
        }
        //Если в if блок не зашли значит он уникальный можно добавлять его
        list.add(product);
    }

    public List<Product> getAllProducts() {
        return list;
    }

    public void deleteProduct(int id) {
        list.remove(new Product(id)) ;
        //Еще вариант
//        int index = list.indexOf(new Product(id));
//        if (index>=0) list.remove(index);
    };

    public void updateProduct(Product product) {
           int index = list.indexOf(product);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId() == product.getId()) {
//                index = i;
//                break;
//            }
//        }
        if (index >= 0) {
            list.set(index, product);
        }
    }

}


