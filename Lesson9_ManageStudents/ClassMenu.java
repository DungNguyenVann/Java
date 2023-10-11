package Lesson9_ManageStudents;

import java.util.Scanner;
import  Lesson9_ManageStudents.ClassManagement;
import Lesson9_ManageStudents.StudentManagement;
import Lesson9_ManageStudents.Clazz;
import Lesson9_ManageStudents.Student;


public class ClassMenu {
//    private ClassManagement classManagement = new ClassManagement();
//    public static StudentManagement studentManagement = new StudentManagement();
//    StudentMenu studentMenu = new StudentMenu();

    private Scanner scanner = new Scanner(System.in);

    public void run() {
        int choice;
        do {
            menu();
            System.out.println("Nhập lựa chọn:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    showAllClass();
                    break;
                }
                case 2: {
                    addNewClass();
                    break;
                }
                case 3: {
                    updateClassInfo();
                    break;
                }
                case 4: {
                    removeClass();
                    break;
                }
                case 5: {
                    addStudentToClass();
                    break;
                }
                case 6: {
                    showStudentInClass();
                    break;
                }
            }
        } while (choice != 0);
    }

    private void showStudentInClass() {
        classManagement.showNumberOfStudentInClass();
    }

    private void addStudentToClass() {
        System.out.println("Nhập mã lớp muốn thêm sinh viên vào:");
        String id = scanner.nextLine();
        int index = classManagement.findById(id);
        if (index == -1) {
            System.out.println("Không có mã lớp này");
        } else {
            studentManagement.showAll();
            Clazz clazz = classManagement.findById(index);
            System.out.println("Nhập mã sinh viên mà bạn muốn thêm vào trong lớp:");
            String studentId = scanner.nextLine();
            int studentIndex = studentManagement.findById(studentId);
            studentManagement.addStudentToClass(studentIndex, clazz);
        }
    }
