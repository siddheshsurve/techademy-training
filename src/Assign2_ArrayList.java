import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Assign2_ArrayList {

    public static void addStudents(ArrayList<String> studentNames) {
        studentNames.add("Siddhesh");
        studentNames.add("Mayur");
        studentNames.add("Shashank");
        studentNames.add("Om");
        studentNames.add("Pranav");
    }

    public static void displayStudentNames(ArrayList<String> studentNames) {
        System.out.println("Student Names: ");
        for(String name: studentNames) {
            System.out.println(name);
        }
    }

    public static void addStudentAtIndex(ArrayList<String> studentNames, String studentName, int index) {
        studentNames.add(index, studentName);
    }

    public static void removeStudentByName(ArrayList<String> studentNames, String studentName) {
        studentNames.remove(studentName);
    }

    public static void sortStudentNames(ArrayList<String> studentNames) {
        Collections.sort(studentNames);
    }

    public static void displayStudentNamesUsingIterator(ArrayList<String> studentNames) {
        System.out.println("Student names using iterator: ");
        Iterator<String> itr = studentNames.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        addStudents(studentNames);
        displayStudentNames(studentNames);
        addStudentAtIndex(studentNames, "Ajay", 3);
        System.out.println("\n After adding new student :-");
        displayStudentNames(studentNames);
        removeStudentByName(studentNames, "Sahil");
        System.out.println("\n After removing one student :-");
        displayStudentNames(studentNames);
        sortStudentNames(studentNames);
        System.out.println("\n After sorting arraylist :-");
        displayStudentNames(studentNames);
        System.out.println();
        displayStudentNamesUsingIterator(studentNames);
    }
}
