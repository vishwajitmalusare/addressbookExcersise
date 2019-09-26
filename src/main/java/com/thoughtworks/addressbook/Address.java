package com.thoughtworks.addressbook;

public class Address {
    private String area;

    private String city;
    private String state;
    private String country;
    private String zipCode;

    public Address(String area, String city, String state, String country, String zipCode) {
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

}
