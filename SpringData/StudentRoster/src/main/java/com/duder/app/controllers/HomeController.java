package com.duder.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.duder.app.models.Contact;
import com.duder.app.models.Student;
import com.duder.app.services.ApiService;

@Controller
public class HomeController {
	private ApiService apiService;
	public HomeController(ApiService service) { 
		this.apiService = service;
	}
	@RequestMapping("/")
	public String Index(Model model) {
		model.addAttribute("students", apiService.getStudents());
		return "/students/index.jsp";
	}
	@RequestMapping("/contacts/new")
	public String newContact(@ModelAttribute("contact") Contact contact, Model model) {
		List<Student> studs = apiService.getStudents();
		model.addAttribute("students", studs);
		return "/contacts/new.jsp";
	}
	@RequestMapping(value="/contacts", method=RequestMethod.POST)
	public String createContact(@Valid @ModelAttribute("contact") Contact contact, BindingResult result) {
		if(result.hasErrors())
			return "/contacts/new.jsp";
		apiService.createContact(contact);
		return "redirect:/";
	}
}
