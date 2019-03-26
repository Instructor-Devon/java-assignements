package com.duder.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.duder.app.models.License;
import com.duder.app.models.Person;
import com.duder.app.services.DMVService;

@Controller
public class HomeController {
	private final DMVService service;
	public HomeController(DMVService serv) {
		this.service = serv;
	}
	@RequestMapping("/")
	public String Index(Model model) {
		List<Person> people = service.getPeople();
		model.addAttribute("persons", people);
		return "index.jsp";
	}
	@RequestMapping("/{id}")
	public String ShowPerson(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", service.getPerson(id));
		return "show.jsp";
	}
	@RequestMapping("/new")
	public String NewPerson(@ModelAttribute("person") Person person) {
		return "new.jsp";
	}
	@RequestMapping("/licenses/new")
	public String NewLicense(@ModelAttribute("license") License lic, Model model) {
		model.addAttribute("persons", service.getPeople());
		return "/licenses/new.jsp";
	}
	@RequestMapping(value = "/licenses", method=RequestMethod.POST)
	public String CreateLicense(@Valid @ModelAttribute("license") License lic, BindingResult result) {
		if(result.hasErrors())
			return "/licenses/new.jsp";
		service.createLicense(lic);
		return "redirect:/";
	}
}
