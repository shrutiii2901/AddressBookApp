package com.bridgeLabz.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgeLabz.addressbook.model.Contact;
import com.bridgeLabz.addressbook.service.AddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService service;

    @PostMapping("/add")
    public String addContact(@RequestBody Contact contact) {
        return service.addContacts(contact);
    }

    @PutMapping("/edit/{name}")
    public String editContact(@PathVariable String name,
            @RequestBody Contact contact) {

        return service.editContact(name, contact);
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return service.getAllContacts();
    }
}
