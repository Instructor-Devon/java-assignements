package com.codingdojo.firstproject;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("")
	public String Index(Model model) {
		
		return "index.jsp";
	}
	@RequestMapping("/date") 
	public String Date(Model model) {
		SimpleDateFormat sm = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY");
		model.addAttribute("date", sm.format(new java.util.Date()));
		return "date.jsp";
	}
	
	@RequestMapping("/time") 
	public String Time(Model model) {
		SimpleDateFormat sm = new SimpleDateFormat("h:mm a");
		model.addAttribute("time", sm.format(new java.util.Date()));
		return "time.jsp";
	}
	
	@RequestMapping("/r/{subreddit}")
	public String Random(@PathVariable("subreddit") String subreddit) {
		return subreddit;
	}
}
