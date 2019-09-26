package com.thoughtworks.addressbooktest;


import com.thoughtworks.addressbook.Address;
import com.thoughtworks.addressbook.AddressBook;
import com.thoughtworks.addressbook.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {
    @Test
    void givenPerson_whenAddIntoAddressBook_thenAddesInAddressBook() {

        Person person = new Person("Aakash","8314567054","1",new Address("BTM Layout","Banglore","Karnatka","India","560072"));

        AddressBook addressBook = new AddressBook();

        Assertions.assertEquals(true,addressBook.add(person));
    }
}
