package com.iteso.motor;

public class Armor extends EnduranceObject {
	private int defense, weight, endurance;
	private boolean helmet = false;
	private String name, category;
	private Material type;
	
	public void decrease() {
		if(this.getDefense() > 0)
			this.setDefense(this.getDefense() - this.type.getEndurance());
		else if(this.getEndurance() < 0)
			this.setEndurance(0);
	}

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
	
	public int getEndurance() {
		return this.endurance;
	}

	public void setEndurance(int endurance) {
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
