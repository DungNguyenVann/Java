package Lesson11_ReadFIleCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class csv {
    public static List<Country> readFileCSV(String fileName) {
        List<Country> countryList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                int id = Integer.parseInt(fields[0]);
                int temp = Integer.parseInt(fields[1]);
                String name = fields[2];
                Country country = new Country(id, temp, name);
                countryList.add(country);
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countryList;
    }

    public static void writeToFileCSV(List<Country> countryList, String fileName) {
        try(BufferedWriter bw= new BufferedWriter(new FileWriter(fileName))){
          for(Country country: countryList){
              String line = country.getId()+","+ country.getTemp()+","+country.getName();
              bw.write(line);
              bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
