package com.cfloresh.employees;

public class Client extends Person {
    private int clientId;

    public Client(String name, String lastName, String nid, String address, int clientId) {
        super(name, lastName, nid, address);
        this.clientId = clientId;
    }

    public int getClientId() {
        return clientId;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nclientId: " + this.clientId;
    }
}
