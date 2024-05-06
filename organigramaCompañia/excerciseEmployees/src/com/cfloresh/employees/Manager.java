package com.cfloresh.employees;

public class Manager extends Employee {
    private double budget;

    /* Constructor */
    public Manager(String name, String lastName, String nid, String address, double salary, int employeeId, double budget) {
        super(name, lastName, nid, address, salary, employeeId);
        this.budget = budget;
    }

    /* Getter */
    public double getBudget() {
        return budget;
    }

    /* Setter */
    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nbudget: " + this.budget;
    }
}
