package com.codingdojo.projectone;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("I am throwing something!!");
		this.energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("I am eating something!!");
		this.energyLevel += 10;
	}
	public void climb() {
		System.out.println("I am climbing something!!");
		this.energyLevel -= 10;
	}
}
