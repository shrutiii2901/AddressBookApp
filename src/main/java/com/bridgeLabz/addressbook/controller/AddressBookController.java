package com.bridgeLabz.addressbook.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.bridgeLabz.addressbook.service.AddressBookService;
import com.bridgeLabz.addressbook.service.AddressBookServiceImpl;
import com.bridgeLabz.addressbook.model.Contact;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    AddressBookService service = new AddressBookServiceImpl();

    @PostMapping("/add")
    public String addContact(@RequestBody Contact contact) {
        return service.addContacts(contact);
    }
    @GetMapping("/all")
    public List<Contact> getAllContacts() {
        return service.getAllContacts();
    }
}