package com.duder.app.models;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NewQuestion {
	@Size(min=3, message="Question field is required")
	private String question;
	private String tags;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String[] splitTags() {
		return this.tags.split("\\s*,\\s*");
	}
}
