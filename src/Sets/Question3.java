package Sets;

import java.util.ArrayList;
import java.util.*;

public class Question3 {
    String name;
    double salary;
    Question3(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return name + " : " + salary;
    }

    public static void main(String[] args) {
        ArrayList<Question3> employees=new ArrayList<>();
        employees.add(new Question3("anchal",200000));
        employees.add(new Question3("aditi",100000));
        employees.add(new Question3("himani",20000));
        employees.add(new Question3("himanshi",30000));
        employees.add(new Question3("isha",90000));


        Set<Question3> set=new TreeSet<>((employee1, employee2) -> {
            double diff=employee2.salary- employee1.salary;
            int value=(int)diff;
            return value;
        });

        set.addAll(employees);
        System.out.println(set);
    }
}
