package Lesson5_ClassManagement;

import java.util.ArrayList;
import java.util.List;

public class Class_Management {
    private List<Classes> classesList = new ArrayList<>();

    void showClasses() {
        for (Classes classList : classesList) {
            System.out.println("List Class: ");
            System.out.println(classList.getId_Class());
            System.out.println(classList.getName_Class());
            System.out.println(" ");
        }
    }

    void addCLasses(Classes classes) {
        classesList.add(classes);
    }

    void removeClasses(int idClasses) {
        Classes classes = null;
        for (Classes cl : classesList) {
            if (cl.getId_Class() == idClasses) {
                classes = cl;
                break;
            }
        }
        if (classes != null) {
            classesList.remove(classes);
            System.out.println("Remove Class Completed");
        }else {
            System.out.println("Id Class Not Found");
        }
    }

    void updateClasses(int idClasses, String newNameClass) {
        int updateClasses = -1;
        for (Classes cl : classesList) {
            if (cl.getId_Class() == idClasses) {
                updateClasses = idClasses;
                cl.setName_Class(newNameClass);
                break;
            }
        }
        if (updateClasses == -1){
            System.out.println("Class Not Found With Id: "+idClasses);
        }
    }
}
