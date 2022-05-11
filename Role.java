package com.iteso.motor;

public class Role {
	private int powR = 0, powL = 0, hp, x, y, speed, topDefense = 0, midDefense = 0, totalWeight = 0, baseSpeed;
	private Equipment e;
	public final double GRAVITY = 9.81;
	
	public Role() {
		
	}
	
	public Role(int hp, int x, int y, int baseSpeed, Equipment e) {
		this.setHp(hp);
		this.setX(x);
		this.setY(y);
		this.setBaseSpeed(baseSpeed);
		this.setE(e);
	}
	
	public int getPowR() {
		return this.powR;
	}
	
	private void setPowR(int powR) {
		this.powR = powR;
	}
	
	public int getPowL() {
		return this.powL;
	}
	
	private void setPowL(int powL) {
		this.powL = powL;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	private int getSpeed() {
		return this.speed;
	}
	
	private void setSpeed() {
		this.speed = this.getBaseSpeed() - this.getTotalWeight();
	}
	
	public int getTopDefense() {
		return this.topDefense;
	}
	
	private void setTopDefense(int topDefense) {
		this.topDefense = topDefense;
	}
	
	public int getMidDefense() {
		return this.midDefense;
	}
	
	private void setMidDefense(int midDefense) {
		this.midDefense = midDefense;
	}
	
	public Equipment getE() {
		return this.e;
	}
	
	public void setE(Equipment equipment) {
		this.e = equipment;				
		this.setTotalWeight_Pows_Defenses(equipment);
	}
	
	public int getTotalWeight() {
		return this.totalWeight;
	}

	public int getBaseSpeed() {
		return this.baseSpeed;
	}

	public void setBaseSpeed(int baseSpeed) {
		this.baseSpeed = baseSpeed;
	}

	private void setTotalWeight_Pows_Defenses(Equipment equipment) {
		this.totalWeight = 0;
		
		if(equipment.getWeaponL() != null) {
			this.totalWeight += equipment.getWeaponL().getWeight();
			this.setPowL(equipment.getWeaponL().getPow());
		}
		
		if(equipment.getWeaponR() != null) {
			this.totalWeight += equipment.getWeaponR().getWeight();
			this.setPowR(equipment.getWeaponR().getPow());
		}
		
		if(equipment.getArmorH() != null) {
			this.totalWeight += equipment.getArmorH().getWeight();
			this.setTopDefense(equipment.getArmorH().getDefense());
		}
		
		if(equipment.getArmorB() != null) {
			this.totalWeight += equipment.getArmorB().getWeight();
			this.setMidDefense(equipment.getArmorB().getDefense());
		}
		
		if(equipment.getArmorS() != null) {
			this.totalWeight += equipment.getArmorS().getWeight();
			this.setMidDefense(this.midDefense + equipment.getArmorS().getDefense());
		}
		
		this.setSpeed();
	}

	public void updateAtributes(int hp, int x, int y, Equipment equipment) {
		this.setHp(hp);
		this.setX(x);
		this.setY(y);
		this.setTotalWeight_Pows_Defenses(equipment);
	}
	
	public void move(int toSum, Direction direction) {
		if(direction == Direction.UP)
			this.y -= toSum;
		else if(direction == Direction.DOWN)
			this.y += toSum;
		else if(direction == Direction.RIGHT)
			this.x += toSum;
		else if(direction == Direction.LEFT)
			this.x -= toSum;
		
		if(this.getX() < 0 | this.getY() < 0) {
			System.out.println("Role out of bounds");
		}
	}
	
	public boolean hit(int long1, int height1, Weapon weapon, int long2, int height2) {
		double minXRole = this.getX() - long1 / 2.0;
		double maxXRole = this.getX() + long1 / 2.0;
		double minYRole = this.getY() - height1 / 2.0;
		double maxYRole = this.getY() + height1 / 2.0;
		double minXWeapon = weapon.getX() - long2 / 2.0;
		double maxXWeapon = weapon.getX() + long2 / 2.0;
		double minYWeapon = weapon.getY() - height2 / 2.0;
		double maxYWeapon = weapon.getY() + height2 / 2.0;
		
		if(((minXWeapon >= minXRole && minXWeapon <= maxXRole) || (maxXWeapon >= minXRole && maxXWeapon <= maxXRole)) && 
		   ((minYWeapon >= minYRole && minYWeapon <= maxYRole) || (maxYWeapon >= minYRole && maxYWeapon <= maxYRole)))
			return true;
		
		return false;
	}
	
	public boolean shot(double angle, int v0, Weapon w, Role r, int longR, int heightR, int longW, int heightW, Direction direction) {
		angle *= Math.PI / 180;
		int x = 0, baseX = w.getX(), baseY = w.getY();
		double y = 1;
		double maxX = v0 * v0 * Math.sin(2 * angle) / GRAVITY;
		System.out.println(maxX);
		boolean hit = false;
		
		while(y >= 0 && hit == false) {
			x += maxX / 100;
			y = Math.tan(angle) * x - (GRAVITY * x * x) / (2 * v0 * v0 * Math.pow(Math.cos(angle), 2));
			System.out.printf("%d, %f\n", x, y);
			if(y > 0) {
				if(direction == Direction.RIGHT) {
					w.setX((int) (baseX + x));
					w.setY((int) (baseY - y));
				}
				else if(direction == Direction.LEFT) {
					w.setX((int) (baseX - x));
					w.setY((int) (baseY - y));
				}
			}
			else
				break;
			System.out.printf("%d, %d\n", w.getX(), w.getY());
			if(r.hit(longR, heightR, w, longW, heightW))
				hit = true;
//			x += maxX / 100;
		}
			
		return hit;
		
	}
	
//	public void shoot(int v0, int angle) {
//		double v0x = v0 * Math.cos(angle);
//		double v0y = v0 * Math.sin(angle);
//		double time = 0;
//		int x, y = 100000;
//		int x0 = 0;
//		int y0 = 0;
//		
//		while(y > 0) {
//			time++;
//			x = (int) (x0 + v0x * time);
//			y = (int) (y0 + v0y * time + 1 / 2 * GRAVITY * time * time);
//			System.out.printf("%d, %d\n", x, y);
//		}
//	}
	
//	public void shot(int angle, int v0) {
//		int time = 1;
//		double x = v0 * Math.cos(angle) * time;
//		double y = 10000000;
//		x = v0 * Math.cos(angle) * time;
//		y = v0 * Math.sin(angle) * time - 1 / 2 * GRAVITY * time * time;
//		System.out.printf("%f, %f\n", x, y);
//		while(y > 0) {
//			time++;
//			x = v0 * Math.cos(angle) * time;
//			y = v0 * Math.sin(angle) * time - 1 / 2 * GRAVITY * time * time;
//			System.out.printf("%f, %f\n", x, y);
//		}
//	}
	
//	public void shot(Weapon w, Role r, int v0, int angle) {
//		double ymax = (v0 * v0 * Math.sin(angle) * Math.sin(angle)) / (2 * GRAVITY) ; 
//		System.out.println(ymax);
//		int x = 0, y = 100000;
//
//		while(y > 0) {
//		 x += v0;
//		 y = (int) (Math.tan(angle) * x - GRAVITY / (2 * Math.pow(v0, 2) * Math.pow(Math.cos(angle), 2)) * x * x);
//		 System.out.printf("%d, %d\n", x, y);
//		}
//	}
	
//	public void shot(Weapon w, Role r, int x, int y, double angle, int longR, int heightR, int longW, int heightW) { //throws InterruptedException{
//		if(x < 0)				// generar sino un exception para todo esto
//			x = 0;
//		if(y < 0)
//			y = 0;
//		if(angle < 0)
//			angle *= Math.PI / 180;
//		if(longR < 0)
//			longR = 0;
//		if(heightR < 0)
//			heightR = 0;
//		if(longW < 0)
//			longW = 0;
//		if(heightW < 0)
//			heightW = 0;
//		
//		angle = angle * Math.PI / 180;
//		
//		double v0x = 10 * Math.cos(angle);
//		double v0y = 10 * Math.sin(angle);
////		(int) v0x)
//		
//		while(r.hit(longR, heightR, w, longW, heightW) == false || (w.getX() < x && w.getY() > y)) {
//			w.setX(w.getX() + (int) (((int) v0x) * 0.5));
//			w.setY(w.getY() - (int) ((Math.pow(v0y, 0.5)) - (0.5 * GRAVITY * Math.pow(0.5, 2.0))));
//			System.out.printf("%d, %d\n", w.getX(), w.getY());
//		}
//	}
	
	@Override
	public String toString() {
		return String.format("Left Pow: %d\tRight Pow: %d\nHP: %d\tPosition: (%d, %d)\tBaseSpeed:%d \tSpeed: %d\nWeight: %d\tTop defense: %d\t    Mid defense: %d\nEquipment: \n%s", 
				             this.getPowL(), this.getPowR(), this.getHp(), this.getX(), this.getY(), this.getBaseSpeed(),
				             this.getSpeed(), this.getTotalWeight(), 
				             this.getTopDefense(), this.getMidDefense(), this.getE());
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Role))
			return false;
		
		Role r = (Role) o;
		return this.getHp() == r.getHp() && this.getX() == r.getX() && this.getY() == r.getY() && 
			   this.getBaseSpeed() == r.getBaseSpeed() && this.getE().equals(r.getE());
	}
	
	public Role clone() {
		return new Role(this.getHp(), this.getX(), this.getY(), this.getBaseSpeed(), this.getE());
	}

}
