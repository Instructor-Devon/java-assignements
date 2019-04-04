package com.duder.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.duder.app.models.NewQuestion;
import com.duder.app.models.Question;
import com.duder.app.repositories.QuestionRepository;

@Service
public class AppService {
	private QuestionRepository qRepo;
	public AppService(QuestionRepository qRepo) {
		this.qRepo = qRepo;
	}
	public List<Question> getQuestions() {
		return this.qRepo.findAll();
	}
	public void createQuestion(NewQuestion question) {
		// TODO: make a real question here
	}
}
