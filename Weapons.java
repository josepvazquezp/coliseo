package com.iteso.motor;

public enum Weapons{
	COPPER_MACE(50, 40, 1, 2, 0, 0, 100, false,"Copper Mace" ,Material.COPPER),
	IRON_MACE(55, 45, 1, 2, 0, 0, 150,false,"Iron Mace",Material.IRON),
	GOLD_MACE(60, 50, 1, 2, 0, 0, 200,false,"Gold Mace",Material.GOLD),
	
	COPPER_LONGAXE(40, 30, 1, 2, 0, 0, 100,false,"Copper Longaxe",Material.COPPER),
	IRON_LONGAXE(45, 35, 1, 2, 0, 0, 150,false,"Iron Longaxe", Material.IRON),
	GOLD_LONGAXE(50, 40, 1, 2, 0, 0, 200,false,"Gold Longaxe", Material.GOLD),
	
	COPPER_AXE(10, 7, 1, 1, 0, 0, 100,true,"Copper Axe", Material.COPPER),
	IRON_AXE(15, 9, 1, 1, 0, 0, 150,true,"Iron Axe", Material.IRON),
	GOLD_AXE(20, 12, 1, 1, 0, 0, 200,true,"Gold Axe" ,Material.GOLD),
	
	COPPER_SWORD(15, 10, 1, 1, 0, 0, 100,false,"Copper Sword", Material.COPPER),
	IRON_SWORD(20, 12, 1, 1, 0, 0, 150,false,"Iron Sword" ,Material.IRON),
	GOLD_SWORD(25, 15, 1, 1, 0, 0, 200,false,"Gold Sword" ,Material.GOLD),
	
	COPPER_KUNAI(5, 2, 1, 1, 0, 0, 100,true,"Copper Kunai",Material.COPPER),
	IRON_KUNAI(10, 5, 1, 1, 0, 0, 150,true, "Iron Kunai",Material.IRON),
	GOLD_KUNAI(13, 7, 1, 1, 0, 0, 200,true,"Gold Kunai" ,Material.GOLD),
	
	IRON_SHIELD(15, 20, 1, 1, 0, 0, 150,true,"Iron Shield", Material.IRON),
	
	FIST(10, 0, 1, 1, 0, 0, 100, false,"Fist",Material.FLESH);
	
	private Weapon w;

	Weapons(int pow, int weight, int distance, int capacity, int x, int y, int resistance, boolean flyable,String name, Material material) {
		w.setPow(pow);
		w.setWeight(weight);
		w.setDistance(distance);
		w.setCapacity(capacity);
		w.setX(x);
		w.setY(y);
		w.setFlyable(flyable);
		w.setType(material);
		w.setResistance(resistance);
	}
	
	public Weapon getWeapon() {
		return this.w;
	}
	
	
}