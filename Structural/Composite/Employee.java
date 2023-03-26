package DesignPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String name;
    String email;
    String phoneNumber;
    String designation;

    public Employee(String name, String email, String phoneNumber, String designation, String department) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.designation = designation;
        this.department = department;
        this.subordinates = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                ", subordinates=" + subordinates +
                '}';
    }

    String department;
    List<Employee> subordinates;

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }


}
