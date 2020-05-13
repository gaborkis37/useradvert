package com.rabit.useraadvert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rabit.useraadvert.service.UserService;

@Controller
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/users/userlist")
	public String userList(Model model) {
		model.addAttribute("userList", userService.findAll());
		return "user/userlist";
	}

}
