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
    public String editContact(String name, Contact updatedContact) {

        for (Contact contact : list) {

            if (contact.getFirstName().equalsIgnoreCase(name)) {

                contact.setLastName(updatedContact.getLastName());
                contact.setAddress(updatedContact.getAddress());
                contact.setCity(updatedContact.getCity());
                contact.setState(updatedContact.getState());
                contact.setZip(updatedContact.getZip());
                contact.setPhoneNumber(updatedContact.getPhoneNumber());
                contact.setEmail(updatedContact.getEmail());

                return "Contact updated successfully";
            }
        }

        return "Contact not found";
    }

    @Override
    public List<Contact> getAllContacts() {
        return list;
    }
}
