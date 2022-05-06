package com.iteso.motor;

public class Equipment {
	private Weapon weaponR = null, weaponL = null;
	private Armor armorH = null, armorB = null, armorS = null;
	private int weaponCapacity = 0;
	
	public Equipment() {
		
	}
	
	public Equipment(Weapon weaponR, Weapon weaponL, Armor armorH, Armor armorB) {
		this.setWeaponL(weaponL);
		this.setWeaponR(weaponR);
		this.setArmorH(armorH);
		this.setArmorB(armorB);
	}
	
	private boolean checkCapacity(Weapon weapon) {
		if(this.weaponCapacity + weapon.getCapacity() < 3)
			return true;
		
		return false;
	}
	
	public Weapon getWeaponR() {
		return this.weaponR;
	}
	
	public void setWeaponR(Weapon weaponR) {
		if(this.checkCapacity(weaponR)) {
			this.weaponR = weaponR;
			this.weaponCapacity += weaponR.getCapacity();
			
//			if(this.weaponR.getType().getName().equals("shield")) {
//				if(this.armorS == null)
//					this.armorS = Armors.SHIELD.getArmor();
//				else {
//					this.armorS.setDefense(this.armorS.getDefense() * 2);
//					this.armorS.setWeight(this.armorS.getWeight() * 2);
//				}
//			}
		}
		else
			System.out.println("Weapon selected exceed max capacity");
	}
	
	public Weapon getWeaponL() {
		return this.weaponL;
	}
	
	public void setWeaponL(Weapon weaponL) {
		if(this.checkCapacity(weaponL)) {
			this.weaponL = weaponL;
			this.weaponCapacity += weaponL.getCapacity();
			
//			if(this.weaponL.getName().equals("shield")) {
//				if(this.armorS == null)
//					this.armorS = Armors.SHIELD.getArmor();
//				else {
//					this.armorS.setDefense(this.armorS.getDefense() * 2);
//					this.armorS.setWeight(this.armorS.getWeight() * 2);
//				}
//			}
		}
		else
			System.out.println("Weapon selected exceed max capacity");
	}
	
	public Armor getArmorH() {
		return this.armorH;
	}
	
	public void setArmorH(Armor armorH) {
		if(this.armorH == null && armorH.isHelmet())
			this.armorH = armorH;
	}
	
	public Armor getArmorB() {
		return this.armorB;
	}
	
	public void setArmorB(Armor armorB) {
		if(this.armorB == null && armorB.isHelmet() == false)
			this.armorB = armorB;
	}
	
	public Armor getArmorS() {
		return this.armorS;
	}
	
	public int getWeaponCapacity() {
		return this.weaponCapacity;
	}
	
	@Override
	public String toString() {
		return String.format("Weapon capacity: %d\n\nLeft Weapon:\n%s\n\nRight  Weapon:\n%s\n\nHelmet:\n%s\n\nBreastplate:\n%s", 
				              this.getWeaponCapacity(), this.getWeaponL() == null? "null" : this.getWeaponL().toString(), 
				              this.getWeaponR() == null? "null" : this.getWeaponR().toString(), 
				              this.getArmorH() == null? "null" : this.getArmorH().toString(), 
				              this.getArmorB() == null? "null" : this.getArmorB().toString());
	}

}
