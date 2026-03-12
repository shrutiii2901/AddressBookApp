package com.bridgeLabz.addressbook.service;

import java.util.List;

import com.bridgeLabz.addressbook.model.Contact;

public interface AddressBookService {

    String addMultipleContacts(List<Contact> contacts);

    List<Contact> getAllContacts();
}