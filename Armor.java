package com.iteso.motor;

public class Armor extends EnduranceObject {
	private int defense, weight;
	private boolean helmet = false;
	private String name;
	private Material type;
	
	public Armor() {
		
	}
	
	public Armor(int defense, int weight, boolean helmet, String name, Material type) {
		this.setDefense(defense);
		this.setWeight(weight);
		this.setHelmet(helmet);
		this.setName(name);
		this.setType(type);
	}
	
	public void decrease() {
		if(this.getDefense() > 0)
			this.setDefense(this.getDefense() - this.type.getEndurance());
		else if(this.getDefense() < 0)
			this.setDefense(0);;
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

	public Material getType() {
		return this.type;
	}

	public void setType(Material type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return String.format("Armor: %s \tType: [%s]\nDefense: %d \tWeight: %d \tHelmet: %b", 
				             this.getName(), this.getType().toString(), this.getDefense(), 
				             this.getWeight(), this.isHelmet());
	}
	
}
