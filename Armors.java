package proyecto;

import com.iteso.motor.Armor;
import com.iteso.motor.Material;

public enum Armors {
	GOLD_HELMET(150, 50, true, "gold helmet", Materials.GOLD.getMaterial()), 
	IRON_HELMET(100, 30, true, "iron helmet", Materials.IRON.getMaterial()),  
	COPPER_HELMET(50, 20, true, "copper helmet", Materials.COPPER.getMaterial()), 
	GOLD_BREASTPLATE(300, 100, false, "gold breastplate", Materials.GOLD.getMaterial()), 
	IRON_BREASTPLATE(200, 80, false, "gold breastplate", Materials.IRON.getMaterial()), 
	COPPER_BREASTPLATE(100, 60, false, "gold breastplate", Materials.COPPER.getMaterial()),
	IRON_SHIELD(100, 20, false, "shield", Materials.IRON.getMaterial());
	
	private Armor armor = new Armor();
	
	private Armors(int defense, int weight, boolean helmet, String name, Material type) {
		armor.setDefense(defense);
		armor.setWeight(weight);
		armor.setHelmet(helmet);
		armor.setName(name);
		armor.setType(type);
	}
	
	public Armor getArmor() {
		return this.armor;
	}
}
