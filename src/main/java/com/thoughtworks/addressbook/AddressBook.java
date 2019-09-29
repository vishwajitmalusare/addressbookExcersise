package com.thoughtworks.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List people = new ArrayList();
    public boolean add() {
        return people.isEmpty();
    }
}
