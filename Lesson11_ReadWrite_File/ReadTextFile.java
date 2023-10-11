package Lesson11_ReadWrite_File;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadTextFile {
    public static void main(String[] args) {
        try {
            BufferedReader f = new BufferedReader(new FileReader("C:\\Users\\dung\\IdeaProjects\\alo\\src\\Lesson11\\input.txt"));
            String line;
            while ((line = f.readLine()) != null) {
                System.out.println(line);
            }
            f.close();
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}