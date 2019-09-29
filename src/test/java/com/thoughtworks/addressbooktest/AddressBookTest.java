package com.thoughtworks.addressbooktest;


import com.thoughtworks.addressbook.AddressBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookTest {
    @Test
    void givenNoPersonWhenNoPersonAddIntoAddressBookThenNotAddInAddressBook() {

        AddressBook addressBook = new AddressBook();

        assertEquals(true,addressBook.add());
    }
}
