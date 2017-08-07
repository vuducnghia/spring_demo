package com.demo.data_access.repository;

import com.demo.data_access.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nghia on 04/08/2017.
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Serializable> {
  //@Query("select * from contact where firstName = ....")
  List<Contact> findByFirstName(String firstName);

  List<Contact> findAll();
}
