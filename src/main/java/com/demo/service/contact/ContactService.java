package com.demo.service.contact;

import com.demo.data_access.domain.Contact;
import com.demo.web.VO.ContactVO;

import java.util.List;

/**
 * Created by nghia on 04/08/2017.
 */
public interface ContactService {
  List<Contact> findContactByFirstName(String firstName);
  List<Contact> findAllContacts();

    void addNewContact(ContactVO contactVO);
}
