package com.thoughtworks.addressbook;

public class Person {
    private String id;
    private String name;
    private String phoneNumber;
    Address address;

    public Person(String name, String phoneNumber, String id, Address address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
