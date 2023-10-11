package Lesoon11_DocGhiDuLieuCoCauTruc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileIOExample {
    public static List<Person> readFromFile(String filename) {
        List<Person> people = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int age = Integer.parseInt(fields[1]);
                String gender = fields[2];
                Person person = new Person(name, age, gender);
                people.add(person);
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }

    public static void writeToFile(List<Person> people, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Person person : people) {
                String line = person.getName() + "," + person.getAge() + "," + person.getGender();
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
