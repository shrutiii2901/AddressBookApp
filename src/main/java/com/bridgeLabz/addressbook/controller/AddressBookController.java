package com.bridgeLabz.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

   
    @PostMapping("/addMultiple")
    public String addMultipleContacts(@RequestBody List<Contact> contacts) {
        return service.addMultipleContacts(contacts);
    }

    
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return service.getAllContacts();
    }
}