package com.pets.models;

public abstract class Animal implements Pet{
	protected String name;
	protected String breed;
	protected double weight;
	public String getBreed() {
		return this.breed;
	}
	protected Animal(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	public abstract String sayGreeting();
}
