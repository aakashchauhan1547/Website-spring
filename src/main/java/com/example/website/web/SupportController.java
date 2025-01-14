package com.example.website.web;

import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.website.domain.UserMessage;
import com.example.website.service.UserMessageService;

@Controller
public class SupportController {
	
	@Autowired
	UserMessageService userMessageService;
	@RequestMapping("/support")
	public String getSupportPage(@RequestParam("id") String id, ModelMap map) {
//		String finalUserMessageString = userMessageService.createMessage(Integer.parseInt(id));
//		uiModel.addAttribute(finalUserMessageString , "message");
		map.addAttribute("message" , "Welcome to support page " + id);
		return "support";
		
	}
}
