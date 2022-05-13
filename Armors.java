package proyecto;

import com.iteso.motor.Armor;
import com.iteso.motor.Material;

public enum Armors {
	GOLD_HELMET(150, 50, true, "gold helmet", Materials.GOLD.getMaterial(), 50, 25), 
	IRON_HELMET(100, 30, true, "iron helmet", Materials.IRON.getMaterial(), 50, 25),  
	COPPER_HELMET(50, 20, true, "copper helmet", Materials.COPPER.getMaterial(), 50, 25), 
	
	GOLD_BREASTPLATE(300, 100, false, "gold breastplate", Materials.GOLD.getMaterial(), 100, 50), 
	IRON_BREASTPLATE(200, 80, false, "gold breastplate", Materials.IRON.getMaterial(), 100, 50), 
	COPPER_BREASTPLATE(100, 60, false, "gold breastplate", Materials.COPPER.getMaterial(), 100, 50),

	IRON_SHIELD(100, 20, false, "shield", Materials.IRON.getMaterial(), 100, 100);
	
	private Armor armor = new Armor();
	
	private Armors(int defense, int weight, boolean helmet, String name, Material type, int l, int h) {
		armor.setDefense(defense);
		armor.setWeight(weight);
		armor.setHelmet(helmet);
		armor.setName(name);
		armor.setType(type);
		armor.setLong(l);
		armor.setHeight(h);
	}
	
	public Armor getArmor() {
		return this.armor;
	}
}
