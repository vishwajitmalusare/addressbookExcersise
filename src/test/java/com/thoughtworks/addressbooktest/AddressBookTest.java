package com.thoughtworks.addressbooktest;


import com.thoughtworks.addressbook.Address;
import com.thoughtworks.addressbook.AddressBook;
import com.thoughtworks.addressbook.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest {

    @Test
    void givenPersonWhenAddPersonThenShouldAddPersonInAddressBook() {

        Person person = new Person("Dipak","9864574689",1,new Address("BTM Layout","Bengluru","Karnatka","India","560072"));

        AddressBook addressBook = new AddressBook();

        assertEquals(1,addressBook.add(person));
    }

    }
