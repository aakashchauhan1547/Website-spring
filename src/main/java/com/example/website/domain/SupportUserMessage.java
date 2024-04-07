package com.example.website.domain;

import org.springframework.stereotype.Component;

@Component
public class SupportUserMessage implements UserMessage {

	String Message;
	@Override
	public void setUserId(int userId) {
		// TODO Auto-generated method stub
		this.Message = "hi Welcome to support! " + String.valueOf(userId);
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
}
