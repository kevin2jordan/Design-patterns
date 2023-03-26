package DesignPatterns.Structural.Composite;

public class Runner {

    public static void main(String[] args) {
        Employee manager = new Employee("Rahul", "r970ahul", "888888", "Manager","IT");
        Employee developer1 = new Employee("XYZ","XYZ","7777","DEV","IT");
        manager.add(developer1);

        System.out.println(manager.toString());
    }
}
