package com.duder.app.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.duder.app.models.NewQuestion;
import com.duder.app.models.Question;
import com.duder.app.services.AppService;

@Controller
public class QuestionController {
	private final AppService service;
	public QuestionController(AppService service) {
		this.service = service;
	}
	@GetMapping("/")
	public String Index(Model model) {
		model.addAttribute("questions", this.service.getQuestions());
		return "index.jsp";
	}
	@GetMapping("/new")
	public String New(@ModelAttribute("newQuest") NewQuestion newQuest) {
		return "new.jsp";
	}
	@PostMapping("/")
	public String Create(@Valid @ModelAttribute("newQuest") NewQuestion newQuest, 
		BindingResult result) {
		if(result.hasErrors())
			return "new.jsp";
		this.service.createQuestion(newQuest);
		return "redirect:/";
	}
}	
