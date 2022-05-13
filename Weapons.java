package proyecto;

import com.iteso.motor.Material;
import com.iteso.motor.Weapon;

public enum Weapons{
	COPPER_MACE(50, 40, 1, 2, 0, 0, 100, false,"Copper Mace" , Materials.COPPER.getMaterial(), 100, 75),
	IRON_MACE(55, 45, 1, 2, 0, 0, 150,false,"Iron Mace", Materials.IRON.getMaterial(), 100, 75),
	GOLD_MACE(60, 50, 1, 2, 0, 0, 200,false,"Gold Mace", Materials.GOLD.getMaterial(), 100, 75),
	
	COPPER_LONGAXE(40, 30, 1, 2, 0, 0, 100,false,"Copper Longaxe", Materials.COPPER.getMaterial(), 90, 70),
	IRON_LONGAXE(45, 35, 1, 2, 0, 0, 150,false,"Iron Longaxe", Materials.IRON.getMaterial(), 90, 70),
	GOLD_LONGAXE(50, 40, 1, 2, 0, 0, 200,false,"Gold Longaxe", Materials.GOLD.getMaterial(), 90, 70),
	
	COPPER_AXE(10, 7, 1, 1, 0, 0, 100,true,"Copper Axe", Materials.COPPER.getMaterial(), 35, 20),
	IRON_AXE(15, 9, 1, 1, 0, 0, 150,true,"Iron Axe", Materials.IRON.getMaterial(), 35, 20),
	GOLD_AXE(20, 12, 1, 1, 0, 0, 200,true,"Gold Axe", Materials.GOLD.getMaterial(), 35, 20),
	
	COPPER_SWORD(15, 10, 1, 1, 0, 0, 100,false,"Copper Sword", Materials.COPPER.getMaterial(), 50, 45),
	IRON_SWORD(20, 12, 1, 1, 0, 0, 150,false,"Iron Sword", Materials.IRON.getMaterial(), 50, 45),
	GOLD_SWORD(25, 15, 1, 1, 0, 0, 200,false,"Gold Sword", Materials.GOLD.getMaterial(), 50, 45),
	
	COPPER_KUNAI(5, 2, 1, 1, 0, 0, 100,true,"Copper Kunai", Materials.COPPER.getMaterial(), 20, 10),
	IRON_KUNAI(10, 5, 1, 1, 0, 0, 150,true, "Iron Kunai", Materials.IRON.getMaterial(), 20, 10),
	GOLD_KUNAI(13, 7, 1, 1, 0, 0, 200,true,"Gold Kunai", Materials.GOLD.getMaterial(), 20, 10),
	
	IRON_SHIELD(15, 20, 1, 1, 0, 0, 150,true,"Iron Shield", Materials.IRON.getMaterial(), 100, 100),
	
	FIST(10, 0, 1, 1, 0, 0, 100, false,"Fist", Materials.FLESH.getMaterial(), 10, 10);
	
	private Weapon w = new Weapon();

	Weapons(int pow, int weight, int distance, int capacity, int x, int y, int endurance, boolean flyable,String name, Material material, int l, int h) {
		w.setPow(pow);
		w.setWeight(weight);
		w.setDistance(distance);
		w.setCapacity(capacity);
		w.setX(x);
		w.setY(y);
		w.setFlyable(flyable);
		w.setName(name);
		w.setType(material);
		w.setEndurance(endurance);
		w.setLong(l);
		w.setHeight(h);
	}
	
	public Weapon getWeapon() {
		return this.w;
	}
	
	
}
