package com.iteso.motor;

public class Armor {
	private int defense, weight;
	private Endurance endurance;
	private boolean helmet = false;
	private String name, category;
	private Material type;

	public int getDefense() {
		return this.defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Endurance getEndurance() {
		return this.endurance;
	}

	public void setEndurance(Endurance endurance) {
		this.endurance = endurance;
	}

	public boolean isHelmet() {
		return this.helmet;
	}

	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Material getType() {
		return this.type;
	}

	public void setType(Material type) {
		this.type = type;
	}
	
	
}
