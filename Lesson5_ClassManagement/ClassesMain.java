package Lesson5_ClassManagement;

import java.util.Scanner;

public class ClassesMain {
    public static void main(String[] args) {
        Class_Management class_management = new Class_Management();
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("moi ban nhap ten lop: ");
        String nameClass = sc.nextLine();
        Classes classes = new Classes(id, nameClass);
        Classes classes1 = new Classes(id, nameClass);
        class_management.addCLasses(classes);
//        class_management.addCLasses(classes1);
        class_management.showClasses();

    }
}
