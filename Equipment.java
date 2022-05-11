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
	 * @param weaponR Arma derecha del objeto del equipo
	 * @param weaponL Arma izquierda del objeto del equipo
	 * @param armorH Armadura casco del objeto del equipo
	 * @param armorB 
	 * @param armorS
	 */
	public Equipment(Weapon weaponR, Weapon weaponL, Armor armorH, Armor armorB, Armor armorS) {
		this.setWeaponL(weaponL);
		this.setWeaponR(weaponR);
		this.setArmorH(armorH);
		this.setArmorB(armorB);
		this.setArmorS(armorS);
	}
	/**
	 * Método para regresar si hay capacidad de arma del objeto
	 * @return Regresa si hay capacidad de arma del objeto
	 */
	private boolean checkCapacity(Weapon weapon) {
		if(this.weaponCapacity + weapon.getCapacity() < 3)
			return true;
		
		return false;
	}
	/**
	 * Método para regresar arma derecha del objeto
	 *@return Regresa arma derecha del objeto
	 */
	public Weapon getWeaponR() {
		return this.weaponR;
	}
	/**
	 * Establece el arma derecha o si se excedio el limite del objeto
	 * @param weaponR Arma derecha que se le asignara al objeto
	 */
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
	/**
	 * Método para regresar arma izquierda del objeto
	 * @return Regresa arma izquierda del objeto
	 */
	public Weapon getWeaponL() {
		return this.weaponL;
	}
	/**
	 * Establece el arma izquierda o si se excedio el limite del objeto
	 * @param weaponL Arma izquierda que se le asignara al objeto
	 */
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
	/**
	 * Método para regresar Armadura casco del objeto
	 * @return Regresa Armadura casco del objeto
	 */
	public Armor getArmorH() {
		return this.armorH;
	}
	/**
	 * Establece la armadura casco del objeto
	 * @param armorH Armadura casco que se le asignara al objeto
	 */
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
	/**
	 * Método para regresar la capacidad de armas del objeto
	 * @return Regresa la capacidad de armas del objeto
	 */
	public int getWeaponCapacity() {
		return this.weaponCapacity;
	}
	/** 
	 * Método para regresar cadena de texto de los atributos del objeto
	 * @return Regresa cadena de texto de los atributos del objeto
	 */
	@Override
	public String toString() {
		return String.format("Weapon capacity: %d\n\nLeft Weapon:\n%s\n\nRight  Weapon:\n%s\n\nHelmet:\n%s\n\nBreastplate:\n%s", 
				              this.getWeaponCapacity(), this.getWeaponL() == null? "null" : this.getWeaponL().toString(), 
				              this.getWeaponR() == null? "null" : this.getWeaponR().toString(), 
				              this.getArmorH() == null? "null" : this.getArmorH().toString(), 
				              this.getArmorB() == null? "null" : this.getArmorB().toString(),
				              this.getArmorS() == null? "null" : this.getArmorS().toString());
	}
	/** 
	 * Método para regresar si los objetos son iguales e igualarlos
	 * @return Regresa si los objetos son iguales
	 * @return Regresa igualdad de los objetos
	 */
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
	/** 
	 * Método para regresar nuevo objeto con atributos
	 * @return Regresa nuevo objeto con atributos
	 */
	public Equipment clone() {
		return new Equipment(this.getWeaponR() == null?  null : this.getWeaponR(), 
							 this.getWeaponL() == null? null : this.getWeaponL(), 
							 this.getArmorH() == null? null : this.getArmorH(), 
							 this.getArmorB() == null? null : this.getArmorB(),
							 this.getArmorS() == null? null : this.getArmorS());
	}

}
