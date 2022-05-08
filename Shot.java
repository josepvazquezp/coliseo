package com.iteso.motor;

import java.lang.Math;

public class Shot {
	private double v0x = 10 * Math.cos(30.0), v0y = 10 * Math.sin(30.0);
	public final double GRAVEDAD = 9.81;
	int posy = (int) v0y , posx = (int) v0x;
	
	public void upDatePosition(Weapon w, boolean hit) throws InterruptedException{
		while(!hit) {
			w.setX(w.getX() + (int) (posx * 0.5));
			w.setY(w.getY() - (int) ((Math.pow(v0y, 0.5)) - (0.5 * GRAVEDAD * Math.pow(0.5, 2.0))));
		}
	}
	
}
