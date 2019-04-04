package com.duder.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {
	@GetMapping("/")
	public String Index() {
		return "index.jsp";
	}
}	
