package com.example.website.domain;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.website.repository.StudentUserDAO;

@Component
public class StudentUser implements User {
	@Autowired
	StudentUserDAO studentUserDAO;
	
	String name;
	String gender;
	String location;
	String collage;
	int Id;
	

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	@Override
	public boolean createUser(String name, String gender, String location, String collage) {
		// TODO Auto-generated method stub
		 this.name = name;
		 this.collage = collage;
		 this.gender = gender;
		 this.location = location;
		return true;
	}

	@Override
	public Integer saveUser() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
		return studentUserDAO.save(this);
	}

}
