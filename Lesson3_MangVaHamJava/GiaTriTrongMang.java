package Lesson3_MangVaHamJava;

import java.util.Scanner;

public class GiaTriTrongMang {
    public static void main(String[] arr) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten can tim: ");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.printf("ten cua ban da tim thay o vi tri thu %d", i);
                isExist = true;
                break;

            }
        }
        if (!isExist) {
            System.out.println("Not found " + name + " in the list.");
        }
    }
}

