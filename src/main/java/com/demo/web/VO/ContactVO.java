package com.demo.web.VO;

import com.demo.data_access.domain.Contact;

/**
 * Created by nghia on 04/08/2017.
 */
public class ContactVO {
  private String firstName;
  private String lastName;
  private String username;

  public ContactVO() {}

  public ContactVO(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Contact convertToContact() {
    Contact contact = new Contact();
    contact.setFirstName(this.getFirstName());
    contact.setLastName(this.getLastName());
    return contact;
  }
}
