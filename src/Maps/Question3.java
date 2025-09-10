package Maps;

import java.util.*;

public class Question3 {
    String name;
    double gpa;

    Question3(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + " : " + gpa;
    }

    public static void main(String[] args) {
        ArrayList<Question3> students = new ArrayList<>();
        students.add(new Question3("anchal", 10));
        students.add(new Question3("aditi", 9.2));
        students.add(new Question3("himani", 8.7));
        students.add(new Question3("himanshi", 9.4));
        students.add(new Question3("isha", 7.9));


        Map<Double, String> marks = new TreeMap<>((salary1,salary2)->Double.compare(salary2, salary1));

        for (Question3 student : students) {
            marks.put(student.gpa, student.name);
        }

        for (Map.Entry<Double, String> entry : marks.entrySet()) {
            System.out.println(entry.getValue() + " : " + entry.getKey());
        }
    }
}