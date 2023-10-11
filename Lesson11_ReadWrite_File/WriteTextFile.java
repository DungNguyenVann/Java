package Lesson11_ReadWrite_File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\dung\\IdeaProjects\\alo\\src\\Lesson11\\output.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hello Word");
            bw.newLine();
            bw.write("this is a text file");

            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
