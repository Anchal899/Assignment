package Iterators_Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question2 implements Comparable<Question2>{
    String name;
    String id;
    double gpa;

    Question2(String name, String id, double gpa){
        this.name=name;
        this.id=id;
        this.gpa=gpa;

    }
    @Override
    public int compareTo(Question2 student){
        return this.id.compareTo(student.id);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", GPA: " + gpa;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Question2> students=new ArrayList<>();

        students.add(new Question2("Alice", "S003", 3.8));
        students.add(new Question2("Bob", "S001", 3.5));
        students.add(new Question2("Charlie", "S005", 3.9));
        students.add(new Question2("David", "S002", 3.6));
        students.add(new Question2("Eve", "S004", 3.7));

        Collections.sort(students);  //method of comparable interface, calls the compare to method internally
        System.out.println("Sorted Students by ID:");
        for (Question2 student : students) {
            System.out.println(student);
        }


    }
}
//1. Create a Student class with attributes like name, ID, and GPA.
// Implement the Comparable interface to sort students by their ID in ascending order.
