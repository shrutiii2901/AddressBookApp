package com.bridgeLabz.addressbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgeLabz.addressbook.model.Contact;

@Service
public class AddressBookServiceImpl implements AddressBookService {

    private List<Contact> contactList = new ArrayList<>();

    @Override
    public String addMultipleContacts(List<Contact> contacts) {

        contactList.addAll(contacts);

        return "Multiple contacts added successfully";
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactList;
    }
}