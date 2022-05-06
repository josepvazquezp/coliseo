package com.iteso.motor;

public class Hitbox {
	
	public static boolean hit(Role rol, int long1, int height1, Weapon weapon, int long2, int height2) {
		double minXRole = rol.getX() - long1 / 2.0;
		double maxXRole = rol.getX() + long1 / 2.0;
		double minYRole = rol.getY() - height1 / 2.0;
		double maxYRole = rol.getY() + height1 / 2.0;
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
