package com.demo.PhoneBook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.PhoneBook.Entitie.PhoneBook;
import com.demo.PhoneBook.Repositorys.PhoneBookRepo;
@Service
public class PhoneBookService {

	@Autowired
	PhoneBookRepo obj;

	public PhoneBook insertdata(PhoneBook obj1) {
		return obj.save(obj1);

	}
	public void deleteNumber(int id) {
		
		 obj.deleteById(id);
	}




}
