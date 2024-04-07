package com.example.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.website.domain.User;


@Component
public class StudentUserService implements UserService {

	@Autowired
	User studentUser;
	
	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		
		
		return studentUser;
	}

	@Override
	public int signUp(String name, String gender, String location, String collage) {
		// TODO Auto-generated method stub
	boolean	isStudentUser =studentUser.createUser(name, gender, location, collage);
	if(isStudentUser) {
		return studentUser.saveUser();
	}
	else {
		return -1;
	}
	
		//return isStudentUser;
	}

}
