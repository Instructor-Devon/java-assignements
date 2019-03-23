package com.pets.models;

public class Cat extends Animal {
	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	public String sayGreeting() {
		return "Meowww, my name is " +  this.name + " i am a " + this.breed + " and I weigh " + String.format("%s", this.weight) + ".";
	}
}
