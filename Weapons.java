package com.iteso.motor;

public enum Weapons{
	MACE(60, 50, 1, 2, 0, 0, false),
	LONGAXE(50, 40, 1, 2, 0, 0, false),
	AXE(20, 10, 1, 1, 0, 0, true),
	SWORD(25, 10, 1, 1, 0, 0, false),
	KUNAI(10, 5, 1, 1, 0, 0, true),
	SHIELD(15, 20, 1, 1, 0, 0, true);
	
	private Weapon w;

	Weapons(int pow, int weight, int distance, int capacity, int x, int y, boolean flyable) {
		w.setPow(pow);
		w.setWeight(weight);
		w.setDistance(distance);
		w.setCapacity(capacity);
		w.setX(x);
		w.setY(y);
		w.setFlyable(flyable);
	}
	
	
}