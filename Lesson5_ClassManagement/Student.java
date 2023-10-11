package Lesson5_ClassManagement;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private Date birthDay;
    private int score;
    private Classes className;

    public Student(int id, String name, Date birthDay, int score, Classes className) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.score = score;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Classes getClassName() {
        return className;
    }

    public void setClassName(Classes className) {
        this.className = className;
    }
}
