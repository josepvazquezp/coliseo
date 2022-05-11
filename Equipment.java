package com.iteso.motor;
/**
 * Clase Equipment de la aplicación
 * @author José Pablo Vázquez Partida, Octavio Valdez Fonseca, José Eduardo Pérez Valenzuela
 * @version 1.0
 */
public class Equipment {
	private Weapon weaponR = null, weaponL = null;
	private Armor armorH = null, armorB = null, armorS = null;
	private int weaponCapacity = 0;
	/** 
	 * Método constructor por defecto
	 */
	public Equipment() {
		
	}
	/**
	 * Método constructor parametrizado
	 * @param weaponR
	public Equipment(Weapon weaponR, Weapon weaponL, Armor armorH, Armor armorB, Armor armorS) {
		this.setWeaponL(weaponL);
		this.setWeaponR(weaponR);
		this.setArmorH(armorH);
		this.setArmorB(armorB);
		this.setArmorS(armorS);
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
		if(weaponR != null) {
			if(this.checkCapacity(weaponR)) {
				this.weaponR = weaponR;
				this.weaponCapacity += weaponR.getCapacity();
			}
			else 
				System.out.println("Weapon selected exceed max capacity");
		}
	}
	
	public Weapon getWeaponL() {
		return this.weaponL;
	}
	
	public void setWeaponL(Weapon weaponL) {
		if(weaponL != null) {
			if(this.checkCapacity(weaponL)) {
				this.weaponL = weaponL;
				this.weaponCapacity += weaponL.getCapacity();
			}
			else
				System.out.println("Weapon selected exceed max capacity");
		}
	}
	
	public Armor getArmorH() {
		return this.armorH;
	}
	
	public void setArmorH(Armor armorH) {
		if(armorH != null && this.armorH == null && armorH.isHelmet())
			this.armorH = armorH;
	}
	
	public Armor getArmorB() {
		return this.armorB;
	}
	
	public void setArmorB(Armor armorB) {
		if(armorB != null && this.armorB == null && armorB.isHelmet() == false)
			this.armorB = armorB;
	}
	
	public Armor getArmorS() {
		return this.armorS;
	}
	
	public void setArmorS(Armor armorS) {
		this.armorS = armorS;
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
				              this.getArmorB() == null? "null" : this.getArmorB().toString(),
				              this.getArmorS() == null? "null" : this.getArmorS().toString());
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Equipment))
			return false;
		
		Equipment e = (Equipment) o;
		
		if(this.getWeaponL() == null && this.getWeaponR() != null &&
		   this.getArmorH() != null && this.getArmorB() != null) {
			return this.getWeaponR().equals(e.getWeaponR()) &&
				   this.getArmorH().equals(e.getArmorH()) && this.getArmorB().equals(e.getArmorB());
		}
		else if(this.getWeaponL() != null && this.getWeaponR() == null &&
				this.getArmorH() != null && this.getArmorB() != null) {
			return this.getWeaponL().equals(e.getWeaponL()) &&
				   this.getArmorH().equals(e.getArmorH()) && this.getArmorB().equals(e.getArmorB());
		}
		else if(this.getWeaponL() != null && this.getWeaponR() != null &&
				this.getArmorH() == null && this.getArmorB() != null) {
			return this.getWeaponR().equals(e.getWeaponR()) && this.getWeaponL().equals(e.getWeaponL()) &&
				   this.getArmorB().equals(e.getArmorB());
		}
		else if(this.getWeaponL() != null && this.getWeaponR() != null &&
				this.getArmorH() != null && this.getArmorB() == null) {
			return this.getWeaponR().equals(e.getWeaponR()) && this.getWeaponL().equals(e.getWeaponL()) &&
				   this.getArmorH().equals(e.getArmorH());
		}
		else if(this.getWeaponL() != null && this.getWeaponR() == null &&
				this.getArmorH() == null && this.getArmorB() == null) {
			return this.getWeaponL().equals(e.getWeaponL());
		}
		else if(this.getWeaponL() == null && this.getWeaponR() != null &&
				this.getArmorH() == null && this.getArmorB() == null) {
			return this.getWeaponR().equals(e.getWeaponR());
		}
		else if(this.getWeaponL() != null && this.getWeaponR() == null &&
				this.getArmorH() != null && this.getArmorB() == null) {
			return this.getWeaponL().equals(e.getWeaponL()) &&
				   this.getArmorH().equals(e.getArmorH());
		}
		else if(this.getWeaponL() != null && this.getWeaponR() == null &&
				this.getArmorH() == null && this.getArmorB() != null) {
			return this.getWeaponL().equals(e.getWeaponL()) &&
				   this.getArmorB().equals(e.getArmorB());
		}
		else if(this.getWeaponL() == null && this.getWeaponR() != null &&
				this.getArmorH() != null && this.getArmorB() == null) {
			return this.getWeaponR().equals(e.getWeaponR()) &&
				   this.getArmorH().equals(e.getArmorH());
		}
		else if(this.getWeaponL() == null && this.getWeaponR() != null &&
				this.getArmorH() == null && this.getArmorB() != null) {
			return this.getWeaponR().equals(e.getWeaponR()) &&
				   this.getArmorB().equals(e.getArmorB());
		}
		else if(this.getWeaponL() == null && this.getWeaponR() == null &&
				this.getArmorH() == null && this.getArmorB() != null) {
			return this.getArmorB().equals(e.getArmorB());	
		}
		else if(this.getWeaponL() == null && this.getWeaponR() == null &&
				this.getArmorH() != null && this.getArmorB() == null) {
			return this.getArmorH().equals(e.getArmorH());	
		}
		else if(this.getWeaponL() == null && this.getWeaponR() == null &&
				this.getArmorH() == null && this.getArmorB() == null) {
			System.out.println("Empty equipment");
			return false;	
		}
			
		return this.getWeaponR().equals(e.getWeaponR()) && this.getWeaponL().equals(e.getWeaponL()) &&
			   this.getArmorH().equals(e.getArmorH()) && this.getArmorB().equals(e.getArmorB());
	}
	
	public Equipment clone() {
		return new Equipment(this.getWeaponR() == null?  null : this.getWeaponR(), 
							 this.getWeaponL() == null? null : this.getWeaponL(), 
							 this.getArmorH() == null? null : this.getArmorH(), 
							 this.getArmorB() == null? null : this.getArmorB(),
							 this.getArmorS() == null? null : this.getArmorS());
	}

}
