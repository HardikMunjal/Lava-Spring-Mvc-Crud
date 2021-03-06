package com.draka.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.draka.model.Contact;

/**
 * Defines DAO operations for the contact model.
 * @author www.codejava.net
 *
 */

public interface ContactService {
	
	public void saveOrUpdate(Contact contact);
	
	public void delete(int contactId);
	
	public Contact get(int contactId);
	
	public List<Contact> list();
}