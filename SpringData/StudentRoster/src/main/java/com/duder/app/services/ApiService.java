package com.duder.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duder.app.models.Contact;
import com.duder.app.models.Student;
import com.duder.app.repositories.ContactRepository;
import com.duder.app.repositories.StudentRepository;

@Service
public class ApiService {
	private StudentRepository studentRepo;
	private ContactRepository contactRepo;
	public ApiService(StudentRepository sRepo, ContactRepository cRepo) {
		this.studentRepo = sRepo;
		this.contactRepo = cRepo;
	}
	public List<Student> getStudents() {
		return studentRepo.findAll();
	}
	public void createContact(Contact contact) {
		Student existing = contact.getStudent();
		if(existing == null)
			contactRepo.save(contact);
//		else {
//			
//		}
//			// just update the contact
//			contactRepo.save(contact);
	}
	public void createStudent(Student student) {
		studentRepo.save(student);
	}
}
