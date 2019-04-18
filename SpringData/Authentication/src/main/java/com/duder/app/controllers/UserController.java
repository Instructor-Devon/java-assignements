package com.duder.app.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.duder.app.models.User;
import com.duder.app.services.UserService;
import com.duder.app.validators.UserValidator;

@Controller
public class UserController {
	private final UserService userService;
	private final UserValidator userValidator;
    
    public UserController(UserService userService, UserValidator validator) {
        this.userService = userService;
        this.userValidator = validator;
    }
    
    @RequestMapping("/")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    	this.userValidator.validate(user, result);
    	
    	if(result.hasErrors())
    		return "registrationPage.jsp";
    	// else, save the user in the database, save the user id in session, and redirect them to the /home route
    	User newUser = this.userService.registerUser(user);
    	session.setAttribute("userId", newUser.getId());
    	return "redirect:/home";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, 
    		@RequestParam("password") String password, 
    		Model model, HttpSession session, RedirectAttributes redirectAttributes) {
        // if the user is authenticated, save their user id in session
    	if(this.userService.authenticateUser(email, password)) {
    		User user = this.userService.findByEmail(email);
    		session.setAttribute("userId", user.getId());
    		return "redirect:/home";
    	}
    	
    	redirectAttributes.addFlashAttribute("error", "Invalid Email/Password");
    	return "redirect:/login";
        // else, add error messages and return the login page
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
    	Object userId = session.getAttribute("userId");
    	if(userId == null)
    		return "redirect:/login";
    	User user = this.userService.findById((Long)userId);
    	model.addAttribute("user", user);
    	// get user from session, save them in the model and return the home page
    	return "homePage.jsp";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
    	session.invalidate();
    	// redirect to login page
    	return "redirect:/login";
    }
}
