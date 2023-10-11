package Lesson11_ReadFIleCSV;

public class Country {
    private int id;
    private int temp;
    private String name;


    Country(int id, int temp, String name) {
        this.id = id;
        this.temp = temp;
        this.name = name;
    }

    void setId(int id) {
        this.id = id;
    }

    void setTemp(int temp) {
        this.temp = temp;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public int getTemp() {
        return temp;
    }

    public String getName() {
        return name;
    }
}
