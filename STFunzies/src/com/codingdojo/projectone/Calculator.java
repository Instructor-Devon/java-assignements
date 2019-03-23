package com.codingdojo.projectone;

public class Calculator {
	private String operator = "+";
	private double operandOne = 0;
	private double operandTwo = 0;
	public void setOperandOne(double val) {
		this.operandOne = val;
	}
	public void setOperandTwo(double val) {
		this.operandTwo = val;
	}
	public void setOperation(String operator) {
		this.operator = operator;
	}
	public double performOperations() {
		switch(this.operator) {
		case "+":
			return this.operandOne + this.operandTwo;
		case "-":
			return this.operandOne - this.operandTwo;
		case "*":
			return this.operandOne * this.operandTwo;
		default:
			return this.operandOne / this.operandTwo;
			
		}
	}
	public void getResults() {
		System.out.println(String.format("The result is: %s", this.performOperations()));
	}
	
}
