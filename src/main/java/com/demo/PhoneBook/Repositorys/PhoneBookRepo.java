package com.demo.PhoneBook.Repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.PhoneBook.Entitie.PhoneBook;
@Repository
public interface PhoneBookRepo  extends CrudRepository<PhoneBook,Integer>{

}
