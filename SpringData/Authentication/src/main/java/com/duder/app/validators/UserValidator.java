package com.duder.app.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.duder.app.models.User;
import com.duder.app.services.UserService;

@Component
public class UserValidator implements Validator {
	private final UserService service;
	public UserValidator(UserService service) {
		this.service = service;
	}
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	@Override
	public void validate(Object target, Errors errors) {
		User user  = (User)target;
		// check password confirm
		if(!user.getPasswordConfirmation().equals(user.getPassword()))
			errors.rejectValue("passwordConfirmation", "Match", "Passwords do not match");
		// check unique
		if(this.service.findByEmail(user.getEmail()) != null)
			errors.rejectValue("email", "NotUnique", "Email already in use");
	}
	
	
}
