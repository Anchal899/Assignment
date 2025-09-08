import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question16 implements Comparable<Question16>{
    String name;
    String id;
    double gpa;

    Question16(String name,String id,double gpa){
        this.name=name;
        this.id=id;
        this.gpa=gpa;

    }
    @Override
    public int compareTo(Question16 student){
        return this.id.compareTo(student.id);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", GPA: " + gpa;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Question16> students=new ArrayList<>();

        students.add(new Question16("Alice", "S003", 3.8));
        students.add(new Question16("Bob", "S001", 3.5));
        students.add(new Question16("Charlie", "S005", 3.9));
        students.add(new Question16("David", "S002", 3.6));
        students.add(new Question16("Eve", "S004", 3.7));

        Collections.sort(students);  //method of comparable interface, calls the compare to method internally
        System.out.println("Sorted Students by ID:");
        for (Question16 student : students) {
            System.out.println(student);
        }


    }
}
//1. Create a Student class with attributes like name, ID, and GPA.
// Implement the Comparable interface to sort students by their ID in ascending order.
