package Lesson11_ReadFIleCSV;

import java.util.ArrayList;
import java.util.List;

public class CSVMain {
    public static void main(String[] args) {
        List<Country> list = new ArrayList<>();
        Country a= new Country(1,23,"Viet Nam");
        Country b= new Country(2,234,"Trung Quoc");
        Country c= new Country(14,51,"USA");
        list.add(a);
        list.add(b);
        list.add(c);
        csv.writeToFileCSV(list,"C:\\Users\\dung\\IdeaProjects\\alo\\src\\Lesson11_ReadFIleCSV\\country.txt");
        csv.readFileCSV("C:\\Users\\dung\\IdeaProjects\\alo\\src\\Lesson11_ReadFIleCSV\\country.txt");
    }
}
