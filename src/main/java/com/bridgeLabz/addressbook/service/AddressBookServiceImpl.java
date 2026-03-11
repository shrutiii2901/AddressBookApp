package com.bridgeLabz.addressbook.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.bridgeLabz.addressbook.model.Contact;

@Service
public class AddressBookServiceImpl implements AddressBookService {

    private List<Contact> list = new ArrayList<>();

    @Override
    public String addContacts(Contact contact) {
        list.add(contact);
        return "Contact added successfully";
    }

    @Override
    public List<Contact> getAllContacts() {
        return list;
    }
}
