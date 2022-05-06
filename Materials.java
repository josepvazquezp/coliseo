package proyecto;

import com.iteso.motor.Material;

public enum Materials {
	GOLD("gold", 75),
	IRON("iron", 50),
	COPPER("copper", 25),
	FLESH("flesh", 0);
	
	private Material material = new Material();
	
	private Materials(String name, int endurance) {
		material.setMaterial(name, endurance);;
	}
	
	public Material getMaterial() {
		return this.material;
	}
}
