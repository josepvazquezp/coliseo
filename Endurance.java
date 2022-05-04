package com.iteso.motor;

public class Endurance {
	private Object obj;

	public void decrease() {
		if(obj instanceof Weapon) {
			Weapon temp = (Weapon) obj;
			
		}
		else if(obj instanceof Armor) {
			Armor temp = (Armor) obj;
			
			if(temp.getDefense() > 0)
				temp.setDefense(temp.getDefense() - temp.getType().endurance);
		}
	}

}
