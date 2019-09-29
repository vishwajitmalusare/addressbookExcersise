package com.thoughtworks.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    public int add(Person person) {
        List people = new ArrayList();
        people.add(person);
        int size = people.size();
        return size;
    }
}

