package com.iteso.motor;

public enum Material {
	GOLD(75),
	IRON(50),
	COPPER(25);
	
	public int endurance = 0;
	
	private Material(int endurance) {
		this.endurance = endurance;
	}
	
	public int getEndurance() {
		return this.endurance;
	}
}
