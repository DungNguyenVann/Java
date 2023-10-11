package BaiTap_DongGoi;

public class Student {
    private String name = "John";
    private String Class = "C02";

    void setName(String name) {
        this.name = name;
    }

    void setClasses(String Class) {
        this.Class = Class;
    }

    public static void main(String[] args) {
        Student a = new Student();
        a.setClasses("12a7");
        a.setName("Dung");
    }
}
