package Lesson9_UngDungQuanLySach;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Product> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public boolean removeProduct(T product) {
        return products.remove(product);
    }

    public boolean containProduct(T product) {
        return products.contains(product);
    }

    public List<T> getProducts(){
            return products;
    }
}
