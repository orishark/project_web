package com.myspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.dto.User;

@Controller
@RequestMapping("/")
public class UserController {

	private List<User> users = new ArrayList<User>();
	
	@RequestMapping("sign_up.do")
	public String sign_up() {
		return "sign_up";
	}
	
	@RequestMapping("create")
	public String create(User user) {
		System.out.println("User: " + user);
		users.add(user);
		return "redirect:/";
	}
	
	@RequestMapping("user_list.do")
	public ModelAndView uset_list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", users);
		mav.setViewName("user_list");
		return mav;
	}
}
