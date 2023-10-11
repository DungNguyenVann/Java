//package Lesson3_MangVaHamJava.ProductManagement;
//
//import java.util.ArrayList;
//
//class ProductManagementSystem {
//    ArrayList<Product> products;
//    public ProductManagementSystem() {
//      products = new ArrayList<>();
//    }
//
//    public void showProductList(Product[] productList) {
//        System.out.println("List of Products:");
//        for (Product product : productList) {
//            System.out.println("ID: " + product.getId());
//            System.out.println("Name: " + product.getName());
//            System.out.println("Price: " + product.getPrice());
//            System.out.println("Description: " + product.getDescription());
//            System.out.println("--------------------------");
//        }
//    }
//
//    public void addProduct(Product newProduct, Product[] productList) {
//        // Tạo một mảng mới có kích thước lớn hơn mảng ban đầu 1 đơn vị
//        Product[] newProductList = new Product[productList.length + 1];
//
//        // Sao chép các phần tử từ mảng ban đầu sang mảng mới
//        for (int i = 0; i < productList.length; i++) {
//            newProductList[i] = productList[i];
//        }
//
//        // Thêm sản phẩm mới vào cuối mảng mới
//        newProductList[newProductList.length - 1] = newProduct;
//
//        // Gán mảng mới vào mảng ban đầu
//        productList = newProductList;
//
//        // In ra thông báo thêm sản phẩm thành công
//        System.out.println("Added new product: " + newProduct.getName());
//    }
//
//    public void removeProduct(int productId, Product[] productList) {
//        // Tạo một mảng mới có kích thước nhỏ hơn mảng ban đầu 1 đơn vị
//        Product[] newProductList = new Product[productList.length - 1];
//
//        // Tìm vị trí của sản phẩm cần xóa trong mảng ban đầu
//        int removeIndex = -1;
//        for (int i = 0; i < productList.length; i++) {
//            if (productList[i].getId() == productId) {
//                removeIndex = i;
//                break;
//            }
//        }
//
//        // Nếu không tìm thấy sản phẩm cần xóa, in ra thông báo lỗi và kết thúc hàm
//        if (removeIndex == -1) {
//            System.out.println("Product with ID " + productId + " not found");
//            return;
//        }
//
//        // Sao chép các phần tử từ mảng ban đầu sang mảng mới, trừ phần tử cần xóa
//        int newIndex = 0;
//        for (int i = 0; i < productList.length; i++) {
//            if (i != removeIndex) {
//                newProductList[newIndex] = productList[i];
//                newIndex++;
//            }
//        }
//
//        // Gán mảng mới vào mảng ban đầu
//        productList = newProductList;
//
//        // In ra thông báo xóa sản phẩm thành công
//        System.out.println("Removed product with ID " + productId);
//    }
//
//    public Product findProductByName(String name, Product[] productList) {
//        for (Product product : productList) {
//            if (product.getName().equals(name)) {
//                return product;
//            }
//        }
//        return null;
//    }
//
//    public void sortProductsByName(Product[] productList) {
//        for (int i = 1; i < productList.length; i++) {
//            Product temp = productList[i];
//            int j = i - 1;
//            while (j >= 0 && productList[j].getName().compareTo(temp.getName()) > 0) {
//                productList[j + 1] = productList[j];
//                j--;
//            }
//            productList[j + 1] = temp;
//        }
//    }
//
//    public void updateProduct(int productId, String newName, double newPrice, Product[] productList) {
//        // Tìm vị trí của sản phẩm cần cập nhật trong mảng
//        int updateIndex = -1;
//        for (int i = 0; i < productList.length; i++) {
//            if (productList[i].getId() == productId) {
//                updateIndex = i;
//                break;
//            }
//        }
//
//        // Nếu không tìm thấy sản phẩm cần cập nhật, in ra thông báo lỗi và kết thúc hàm
//        if (updateIndex == -1) {
//            System.out.println("Product with ID " + productId + " not found");
//            return;
//        }
//
//        // Cập nhật thông tin sản phẩm
//        productList[updateIndex].setName(newName);
//        productList[updateIndex].setPrice(newPrice);
//
//        // In ra thông báo cập nhật thành công
//        System.out.println("Updated product with ID " + productId);
//    }
//}
//

package Lesson3_MangVaHamJava.ProductManagement;

import java.util.ArrayList;

class ProductManagementSystem {
    public ArrayList<Product> products;

    public ProductManagementSystem() {
        products = new ArrayList<>();
    }

    void showProductList() {
        for (Product product : products) {
            System.out.println("List of Products:");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Description: " + product.getDescription());
            System.out.println("--------------------------");
        }
    }

    void addProduct(Product pr) {
        products.add(pr);
    }

    void removeProduct(int idProduct) {
        Product product = null;
        for (Product product1 : products) {
            if (product1.getId() == idProduct) {
                product = product1;
                break;
            }
        }
//C2:
//        for (int i=0 ; i < products.size(); i++){
//            if (products.get(i).getId()== idProduct){
//                product = products.get(i);
//                break;
//            }
//        }
        if (product != null) {
            products.remove(product);
        } else {
            System.out.println("Product With Id: " + idProduct + " Not Found");
        }
    }

    public Product findProductByName(String nameProduct) {
        for (Product product : products) {
            if (product.getName().equals(nameProduct)) {
                return product;
            }
        }
        return null;
    }

//    public Product findProductById(int productId){
//        for (Product product : products){
//            if(product.getId()==productId){
//                return product;
//            }
//        }
//        return null;
//    }

    void updateProduct(int productId, String newName, double newPrice) {
        int updateIndex = -1;
        for (Product product : products) {
            if (product.getId() == productId) {
                updateIndex = productId;
                product.setName(newName);
                product.setPrice(newPrice);
            }
        }
        if (updateIndex == -1) {
            System.out.println("Product Not Found with " + productId);
        }
    }

//    public void sortProductsByName() {
////        for (int i = 0; i < products.size(); i++) {
////            Product temp = products.get(i);
////            int j = i - 1;
////            while (j >= 0 && products.get(j).getName().compareTo(temp.getName()) > 0) {
////                products.get(j+1) = products.get(j) ;
////                j--;
////            }
////        }
////    }
}
