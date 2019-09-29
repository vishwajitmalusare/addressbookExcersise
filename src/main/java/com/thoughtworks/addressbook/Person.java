package com.thoughtworks.addressbook;

public class Person {
    private int id;
    private String name;
    private String phoneNumber;
    Address address;

    public Person(String name, String phoneNumber, int id, Address address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
