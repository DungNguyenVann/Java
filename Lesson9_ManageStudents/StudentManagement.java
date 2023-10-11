package Lesson9_ManageStudents;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement implements IGeneralManagement<Student> {

    private List<Student> students = new ArrayList<>();

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public void showAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void addNew(Student student) {
        students.add(student);

    }

    @Override
    public int findById(String id) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void updateById(String id, Student student) {
        int index = findById(id);
        if (index != -1) {
            students.set(index, student);
        } else {
            System.out.println("this student id is not available");
        }
    }

    @Override
    public void removeById(String id) {
        int index = findById(id);
        if (index != -1) {
            students.remove(index);
        } else {
            System.out.println("this student id is not available");
        }
    }

    public void addStudentToClass(int index, Clazz clazz){
        Student student =students.get(index);
        student.setClazz(clazz);
        students.set(index, student);
    }

    public int countStudentInClass(Clazz clazz){
        int count=0;
        for (int i=0; i<students.size();i++){
            Student student= students.get(i);
            if (student.getClazz().getId().equals(clazz.getId())){
                count++;
            }
        }
        return count;
    }
}
