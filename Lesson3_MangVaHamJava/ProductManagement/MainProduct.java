package Lesson3_MangVaHamJava.ProductManagement;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        ProductManagementSystem productManagementSystem = new ProductManagementSystem();
        // Thêm mới sản phẩm
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id:");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        System.out.println("Enter product name:");
        String name = scanner.nextLine();
        System.out.println("Enter product price:");
        float price = scanner.nextFloat();
        scanner.nextLine(); // consume newline character
        System.out.println("Enter product description:");
        String description = scanner.nextLine();
        Product product = new Product(id, name, price, description);
        productManagementSystem.addProduct(product);
//        productManagementSystem.sortProductsByName();
//        productManagementSystem.removeProduct(1);
        // Hiển thị thông tin sản phẩm
        productManagementSystem.showProductList();
//        // Tìm kiếm sản phẩm
//        System.out.print("Enter product name to search: ");
//        String name1 = scanner.nextLine();
//        productManagementSystem.findProductByName(name1);
//        if (name1 != null) {
////            System.out.println("Product found: " + name1.id + " " + name1.name + " " + name1.price + " " + name1.description);
//            System.out.println("OK");
//        } else {
//            System.out.println("Product not found");
//        }

//        productManagementSystem.updateProduct(1,"RICEE",123);
//        productManagementSystem.showProductList();
    }
}
