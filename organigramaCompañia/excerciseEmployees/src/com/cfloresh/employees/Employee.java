package com.cfloresh.employees;

public class Employee extends Person {

    private double salary;
    private int employeeId;

    public Employee(String name, String lastName, String nid, String address, double salary, int employeeId) {
        super(name, lastName, nid, address);
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public Employee(double salary, int employeeId) {
        this("noProvided", "noProvided", "noProvided", "noProvided", salary, employeeId);
    }

    /* Methods */
    public void salaryRise(int percentage) {
        this.salary *= (1 + percentage/(double)100);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nsalary: " + this.salary
                + "\nemployeeId: " + this.employeeId;
    }
}
