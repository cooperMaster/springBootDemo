package com.example.controller;

import java.util.List;
import java.util.Map;

import com.example.dao.ContactDao;
import com.example.dto.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/contacts/")
public class ContactController {

	private ContactDao contactDao;

	@Autowired
	public ContactController(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	@RequestMapping(method=RequestMethod.GET)
	public String home(Map<String,Object> model) {
		List<Contact> contacts = contactDao.findAll();
		model.put("contacts", contacts);
		return "home";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String submit(Contact contact) {
		contactDao.save(contact);
		return "redirect:/contacts/";
	}
}