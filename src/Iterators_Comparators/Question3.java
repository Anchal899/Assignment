package Iterators_Comparators;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 75000),
                new Employee("Charlie", "HR", 60000),
                new Employee("Dave", "IT", 65000),
                new Employee("Eve", "Finance", 70000)
        );

        Comparator<Employee> comparator = Comparator
                .comparing(Employee::getDepartment)
                .thenComparing(Comparator.comparingDouble(Employee::getSalary).reversed());

        employees.sort(comparator);

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " | " + department + " | $" + salary;
    }
}

