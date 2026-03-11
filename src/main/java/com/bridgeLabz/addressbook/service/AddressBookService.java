package com.bridgeLabz.addressbook.service;
import java.util.*;
import com.bridgeLabz.addressbook.model.Contact;

public interface AddressBookService {
    String addContacts(Contact contact);
    List<Contact> getAllContacts();  
}
