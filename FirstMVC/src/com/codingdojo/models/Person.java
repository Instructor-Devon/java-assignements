package com.codingdojo.models;

public class Person {
	private String name;
	private int age;
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String greeting() {
		return "Hello, my name is " + this.name + ".  I am " + this.age + " years old.";
	}
}
