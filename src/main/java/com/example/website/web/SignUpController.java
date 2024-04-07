package com.example.website.web;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.website.domain.StudentUser;
import com.example.website.domain.User;
import com.example.website.service.UserService;

@Controller
public class SignUpController {
	@Autowired
	UserService userService;
	@RequestMapping("/signUp")
	public String getSignUpPAge(Model uiModel) {
		User user = userService.getUser();
		uiModel.addAttribute("user" , user);
		return "signUp";
		
	}
	@RequestMapping("/registerUser")
	public String createUser(@ModelAttribute(value = "userId") StudentUser studentUser) {
	 int userId = userService.signUp(studentUser.getName(), studentUser.getGender() , studentUser.getLocation(),studentUser.getCollage());
		if(userId != -1) {	
			ModelAndView modelAndView = new ModelAndView("redirect:welcome?id=" + userId);
			return modelAndView.getViewName();
		}
		return "signup";
	}
	@RequestMapping("/welcome")
	public String showWelcomePage(@RequestParam ("id") String userId , ModelAndView map){
		map.addObject("userId", userId);
		return "welcome";
	}
	
	@RequestMapping("instructors")
	public String showInstructor(ModelMap mapx) {
		HashMap<String,Object> instructor = new HashMap<String,Object>();
		instructor.put("Name", "Aakash");
		instructor.put("age",25);
		instructor.put("id", 12345);
		ArrayList<HashMap<String,Object>> listOfInstructor = new ArrayList<HashMap<String,Object>>();
		listOfInstructor.add(instructor);
		map.addAttribute("instructors", listOfInstructor);
		return instructors;
	}
	
}
