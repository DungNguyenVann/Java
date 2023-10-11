package Lesson5_ClassManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentManagement {
    List<Student> studentList = new ArrayList<>();

    void showStudent() {
        for (Student st : studentList) {
            System.out.println("Student List: ");
            System.out.println("Id: " + st.getId());
            System.out.println("Name: " + st.getName());
            System.out.println("BirthDay: " + st.getBirthDay());
            System.out.println("Score: " + st.getScore());
            System.out.println("Class: " + st.getClassName());
        }
    }

    public Student findStudentById(int idStudent) {
        for (Student st : studentList) {
            if (st.getId() == idStudent) {
                return st;
            }
        }
        return null;
    }

    void addStudent(Student student) {
        studentList.add(student);
    }

    void updateStudent(int idStudent, String newName, Date newBirthDay, Classes newClass) {
        int index = -1;
        for (Student st : studentList) {
            if (st.getId() == idStudent) {
                index = idStudent;
                st.setName(newName);
                st.setBirthDay(newBirthDay);
                st.setClassName(newClass);
            }
        }
        if (index == -1) {
            System.out.println("Student Not Found With Id: " + idStudent);
        }
    }

    void removeStudent(int idStudent) {
        Student student = null;
        for (Student student1 : studentList) {
            if (student1.getId() == idStudent) {
                student = student1;
                break;
            }
        }
        if(student != null){
            studentList.remove(student);
            System.out.println("Remove Student Completed");
        } else {
            System.out.println("Id Student Not Found");
        }
    }
}
