package com.demo.service.contact;

import com.demo.data_access.domain.Contact;
import com.demo.data_access.repository.ContactRepository;
import com.demo.web.VO.ContactVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nghia on 04/08/2017.
 */
@Service
public class ContactServiceImpl implements ContactService {

  @Autowired
  private ContactRepository contactRepository;

  @Override
  public List<Contact> findContactByFirstName(String firstName) {
    List<Contact> contactList = contactRepository.findByFirstName(firstName);
    return contactList;
  }

  @Override
  public List<Contact> findAllContacts() {
    return contactRepository.findAll();
  }

    @Override
    public void addNewContact(ContactVO contactVO) {
        Contact contact = contactVO.convertToContact();
        contactRepository.saveAndFlush(contact);
    }
}
