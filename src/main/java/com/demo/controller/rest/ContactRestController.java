package com.demo.controller.rest;

import com.demo.data_access.domain.Contact;
import com.demo.service.contact.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nghia on 04/08/2017.
 */
@RestController
@RequestMapping(name = "/api/contact")
public class ContactRestController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Contact> getAllContacts() {
        List<Contact> contactList = contactService.findAllContacts();
        return contactList;
    }
}
