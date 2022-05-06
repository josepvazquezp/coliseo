package com.iteso.motor;

public class Role {
	private int powR = 0, powL = 0, hp, x, y, speed, topDefense = 0, midDefense = 0, totalWeight = 0, baseSpeed;
	private Equipment e;
	
	public int getPowR() {
		return this.powR;
	}
	
	public void setPowR(int powR) {
		this.powR = powR;
	}
	
	public int getPowL() {
		return this.powL;
	}
	
	public void setPowL(int powL) {
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
	
	public void setSpeed() {
		this.speed = this.getBaseSpeed() - this.getTotalWeight();
	}
	
	public int getTopDefense() {
		return this.topDefense;
	}
	
	public void setTopDefense(int topDefense) {
		this.topDefense = topDefense;
	}
	
	public int getMidDefense() {
		return this.midDefense;
	}
	
	public void setMidDefense(int midDefense) {
		this.midDefense = midDefense;
	}
	
	public Equipment getE() {
		return this.e;
	}
	
	public void setE(Equipment e) {
		this.e = e;
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

	private void setTotalWeight(Equipment equipment) {
		if(equipment.getWeaponL() != null)
			this.totalWeight += equipment.getWeaponL().getWeight();
		
		if(equipment.getWeaponR() != null)
			this.totalWeight += equipment.getWeaponR().getWeight();
		
		if(equipment.getArmorH() != null)
			this.totalWeight += equipment.getArmorH().getWeight();
		
		if(equipment.getArmorB() != null)
			this.totalWeight += equipment.getArmorB().getWeight();
		
		if(equipment.getArmorS() != null)
			this.totalWeight += equipment.getArmorS().getWeight();
	}

	public void updateAtributes(int hp, int x, int y, Equipment equipment) {
		this.setPowL(equipment.getWeaponL().getPow());
		this.setPowR(equipment.getWeaponR().getPow());
		this.setHp(hp);
		this.setX(x);
		this.setY(y);
		this.setTotalWeight(equipment);
		this.setSpeed();
		this.setTopDefense(topDefense);
		this.setMidDefense(midDefense);
	}
	
	public void move(int toSum, Direction direction) {
		if(direction == Direction.UP)
			this.y += toSum;
		else if(direction == Direction.DOWN)
			this.y -= toSum;
		else if(direction == Direction.RIGHT)
			this.x += toSum;
		else if(direction == Direction.LEFT)
			this.x -= toSum;
	}

}
