package com.iteso.motor;

public class NegativeNumberFound extends RuntimeException {
	private double NegativeNumberFound;
	
	public NegativeNumberFound(double n) {
		super("NegativeNumberFoundEsxception");
		this.NegativeNumberFound = n;
	}
	
	public String toString() {
		return getMessage() + "\nNegative number found: "+ this.NegativeNumberFound;
	}
}
