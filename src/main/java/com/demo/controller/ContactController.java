package com.demo.controller;

import com.demo.service.contact.ContactService;
import com.demo.web.VO.ContactVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nghia on 04/08/2017.
 */
@Controller
@RequestMapping("/contact")
public class ContactController {

  @Autowired
  private ContactService contactService;


  @RequestMapping(value = "view", method = RequestMethod.GET)
  public String displayContactViewPag() {
    return "contact/contact_view";
  }


  @RequestMapping(value = "form", method = RequestMethod.GET)
  public String displayContactForm(Model model) {
    model.addAttribute("contact", new ContactVO("nghia", "vu duc"));
    return "contact/contact_form";
  }

  @RequestMapping(value = "all", method = RequestMethod.GET)
  public String displayAllContact(Model model) {
    model.addAttribute("contactList", contactService.findAllContacts());
    return "contact/contact_list";
  }


  @RequestMapping(value = "form", method = RequestMethod.POST)
  public String processContactForm(final ContactVO contactVO) {
    contactService.addNewContact(contactVO);
    return "redirect:/contact/all";
  }

  @RequestMapping(value = "angular2", method = RequestMethod.POST)
  public String displayClientPage(final ContactVO contactVO) {
    contactService.addNewContact(contactVO);
    return "static/client/index";
  }
}
