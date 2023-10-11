package Lesson5_ClassManagement;

public class Classes {
    private int id_Class;
    private  String name_Class;

    public Classes(int id_Class, String name_Class) {
        this.id_Class = id_Class;
        this.name_Class = name_Class;
    }

    public int getId_Class() {
        return id_Class;
    }

    public void setId_Class(int id_Class) {
        this.id_Class = id_Class;
    }

    public String getName_Class() {
        return name_Class;
    }

    public void setName_Class(String name_Class) {
        this.name_Class = name_Class;
    }
}
