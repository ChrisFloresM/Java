package com.cfloresh.employees;

public class Person {

    private String name;
    private String lastName;
    private String nid;
    private String address;

    /* Constructor */

    public Person() {}

    public Person(String name, String lastName, String nid, String address) {
        this.name = name;
        this.lastName = lastName;
        this.nid = nid;
        this.address = address;
    }

    /* Getters */
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNid() {
        return nid;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "name: " + this.name
                + "\nlastName: " + this.lastName
                + "\nnid: " + this.nid
                + "\naddres: " + this.address;
    }
}
