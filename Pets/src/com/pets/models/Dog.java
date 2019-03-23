package com.pets.models;

public class Dog extends Animal {

	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	public String sayGreeting() {
		return "BARK, my name is " +  this.name + " i am a " + this.breed + " and I weigh " + String.format("%s", this.weight) + ".";
	}

}
