package Lesoon11_DocGhiDuLieuCoCauTruc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person a = new Person("trung", 16, "nam");
        Person b = new Person("thang", 17, "nam");
        Person c = new Person("hung", 18, "nam");
        Person d = new Person("dung", 21, "nam");

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        FileIOExample.writeToFile(list,"C:\\Users\\dung\\IdeaProjects\\alo\\src\\Lesoon11_DocGhiDuLieuCoCauTruc\\person.txt");
        FileIOExample.readFromFile("C:\\Users\\dung\\IdeaProjects\\alo\\src\\Lesoon11_DocGhiDuLieuCoCauTruc\\person.txt");
    }
}
