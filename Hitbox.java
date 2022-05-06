package com.iteso.motor;

public class Hitbox {
	
	private Role character;
	private Weapon weapon;
	
	public boolean hit(int long1, int height1, int long2, int height2) {
		double minXRole = character.getX() - long1 / 2.0;
		double maxXRole = character.getX() + long1 / 2.0;
		double minYRole = character.getY() - height1 / 2.0;
		double maxYRole = character.getY() + height1 / 2.0;
		double minXWeapon = weapon.getX() - long2 / 2.0;
		double maxXWeapon = weapon.getX() - long2 / 2.0;
		double minYWeapon = weapon.getY() - height2 / 2.0;
		double maxYWeapon = weapon.getY() - height2 / 2.0;
		
		if(((minXWeapon >= minXRole && minXWeapon <= maxXRole) | (maxXWeapon >= minXRole && maxXWeapon <= maxXRole)) && 
		   ((minYWeapon >= minYRole && minYWeapon <= maxYRole) | (maxYWeapon >= minYRole && maxYWeapon <= maxYRole)))
			return true;
		
		
		return false;
	}
}
