package com.iteso.motor;

public class Role {
	private int powR = 0, powL = 0, hp, x, y, speed, topDefense = 0, midDefense = 0, totalWeight = 0, baseSpeed;
	private Equipment e;
	
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
	
	@Override
	public String toString() {
		return String.format("Left Pow: %d\tRight Pow: %d\nHP: %d\tPosition: (%d, %d)\tBaseSpeed:%d \tSpeed: %d\nWeight: %d\tTop defense: %d\t    Mid defense: %d\nEquipment: \n%s", 
				             this.getPowL(), this.getPowR(), this.getHp(), this.getX(), this.getY(), this.getBaseSpeed(),this.getSpeed(), this.getTotalWeight(), 
				             this.getTopDefense(), this.getMidDefense(), this.getE());
	}

}
