package com.demo.PhoneBook.Entitie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PhoneBook")
public class PhoneBook {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int phoneid;
	public int getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}
	private String Name;
	private String phoneNumber;
	public PhoneBook()
	{
		super();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public PhoneBook( String name, String phoneNumber) {
		super();
		Name = name;
		this.phoneNumber = phoneNumber;
	}
	
}
