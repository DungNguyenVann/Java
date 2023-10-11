package Lesson11_ManageProduct_FIle;

public class Product {
    private int id;
    private String name;
    private String manufactureName;
    private double price;
    private String describe;

    public Product(int id, String name, String manufactureName, double price, String describe) {
        this.id = id;
        this.name = name;
        this.manufactureName = manufactureName;
        this.price = price;
        this.describe = describe;
    }

    void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufactureName() {
        return manufactureName;
    }


    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
