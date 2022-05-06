package com.iteso.motor;

public class Weapon extends EnduranceObject{
	private int pow, weight, x, y, capacity, distance, endurance;
	private boolean flyable;
	private Material type;
	String name;
	
	public Weapon() {
		
	}
	
	public Weapon(int pow, int weight, int x, int y, int capacity, int distance, int endurance, boolean flyable, Material type, String name) {
		this.setPow(pow);
		this.setWeight(weight);
		this.setX(x);
		this.setY(y);
		this.setCapacity(capacity);
		this.setDistance(distance);
		this.setEndurance(endurance);
		this.setFlyable(flyable);
		this.setType(type);
		this.setName(name);
	}
	
	public void decrease() {
		if(this.getEndurance() > 0)
			this.setEndurance(this.getEndurance() - this.type.getEndurance());
		else if(this.getEndurance() < 0)
			this.setEndurance(0);
	}
	
	public int getPow() {
		return this.pow;
	}
	
	public void setPow(int pow) {
		this.pow = pow;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getDistance() {
		return this.distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public boolean isFlyable() {
		return this.flyable;
	}
	
	public void setFlyable(boolean flyable) {
		this.flyable = flyable;
	}
	
	public Material getType() {
		return this.type;
	}
	
	public void setType(Material type) {
		this.type = type;
	}
	
	public int getEndurance() {
		return this.endurance;
	}
	
	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("Weapon: %s \tType: [%s]\tFlyable: %b\nPow: %d \tWeight: %d \tDistance: %d\nEndurance: %d \tCapacity: %d", 
				             this.getName(), this.getType().toString(), this.isFlyable(), this.getPow(), this.getWeight(),
				             this.getDistance(), this.getEndurance(), this.getCapacity());
	}
}