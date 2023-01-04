package com.admin.springcrud.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject {

//These are entity class thatswhy we are marked it as @Entity
	
	@Id
	private String id;
	private String Authorname;
	private String Bookname;
	
	
	public Subject() {
		
	}
	public Subject(String id, String authorname, String bookname) {
		super();
		this.id = id;
		Authorname = authorname;
		Bookname = bookname;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getAuthorname() {
		return Authorname;
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}
	
	
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	
	
	
	
}
