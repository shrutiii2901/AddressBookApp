package com.bridgeLabz.addressbook.service;

import java.util.List;

import com.bridgeLabz.addressbook.model.Contact;

public interface AddressBookService {

    String addContacts(Contact contact);

    String editContact(String name, Contact updatedContact);

    String deleteContact(String name);

    List<Contact> getAllContacts();
}