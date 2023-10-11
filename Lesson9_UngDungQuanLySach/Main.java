package Lesson9_UngDungQuanLySach;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory<Product> inventory = new Inventory<>();
        inventory.addProduct(new Book("The Lord of the Rings", 29.99, "J.R.R Tolkien", 1178));
        inventory.addProduct(new Book("The Hobbit", 12.99, "J.R.R Tolkien", 310));
        inventory.addProduct(new Product("iphone X", 999.99));
        inventory.addProduct(new Pen("Ballpoint Pen", 1.99, "Blue"));
        inventory.addProduct(new Pen("Fountain Pen", 12.99, "Black"));
        inventory.addProduct(new Pen("Gel Pen", 0.99, "Red"));

        List<Product> products = inventory.getProducts();
        for (Product product : products) {
            System.out.println("Product name: " + product.getName());
            System.out.println("Product price: " + product.getPrice());
            if (product instanceof Book) {
                Book book = (Book) product;
                System.out.println("Book author: " + book.getAuthor());
                System.out.println("Book page count: " + book.getPageCount());
            }
            System.out.println();
        }


    }
}
