package com.demo.PhoneBook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.PhoneBook.Entitie.PhoneBook;
import com.demo.PhoneBook.services.PhoneBookService;




@RestController
@SpringBootConfiguration
@ComponentScan("com.demo.PhoneBook.Service") 
public class PhoneBookController {
	
	
	@Autowired
private	PhoneBookService objdata;
	
	
	@GetMapping("/")
	
	public String data()
	{
		System.out.println("control is here");
		return "kaustubh";
	}
	
	@GetMapping("/data")
	public PhoneBook insertProduct()//@RequestBody Product product) {
	{	System.out.println("in PostMapping");
	PhoneBook obj1= new PhoneBook("kaustubh","8087725395");
		return objdata.insertdata(obj1);

	}

}
