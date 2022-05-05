package com.iteso.motor;

public class Weapon {
	private int pow, weight, x, y, capacity, distance, resistance;
	private boolean flyable;
	private Material type;
	String name;
	
	
	public int getPow() {
		return pow;
	}
	public void setPow(int pow) {
		this.pow = pow;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public boolean isFlyable() {
		return flyable;
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
	public int getResistance() {
		return this.resistance;
	}
	public void setResistance(int resistance) {
		this.resistance = resistance;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
