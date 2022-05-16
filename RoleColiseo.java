package proyecto;

import com.iteso.motor.Direction;
import com.iteso.motor.Equipment;
import com.iteso.motor.NegativeNumberFound;
import com.iteso.motor.Role;
import com.iteso.motor.Weapon;

public class RoleColiseo extends Role {
	
	public static final int DIF_TO_HEAD, L_HEAD, H_HEAD, V0;
	private Role head;
	
	static {			// por acordar según las dimensiones necesarias
		DIF_TO_HEAD = 10;
		L_HEAD = 35;
		H_HEAD = 10;
		V0 = 100;
	}
	
	public RoleColiseo() {
		super();
		
		head = new Role();
		head.setLong(L_HEAD);
		head.setHeight(H_HEAD);
		
		Equipment e = new Equipment();
		e.setWeaponL(Weapons.FIST.getWeapon());
		e.setWeaponR(Weapons.FIST.getWeapon());
		super.setE(e);
	}
	
	public void updateHeadPosition() {
		head.setX(super.getX());
		head.setY(super.getY() + DIF_TO_HEAD);
	}
	
	@Override
	public void setX(int x) {
		super.setX(x);
		this.updateHeadPosition();
	}
	
	@Override
	public void setY(int y) {
		super.setY(y);
		this.updateHeadPosition();
	}
	
	public Role getHead() {
		return this.head;
	}
	
	public void updatePosition() {
		if(super.getE().getWeaponL() != null) {
			super.getE().getWeaponL().setX(super.getX());
			super.getE().getWeaponL().setY(super.getY());
		}
		
		if(super.getE().getWeaponR() != null) {
			super.getE().getWeaponR().setX(super.getX());
			super.getE().getWeaponR().setY(super.getY());
		}
	}
	
	@Override
	public void move(int toSumX, int toSumY, Direction direction) throws NegativeNumberFound {
		if(this.getX() == ArenaMap.S1X && (direction == Direction.LEFT || direction == Direction.DOWN_LEFT || direction == Direction.UP_LEFT) || 
		   this.getX() == ArenaMap.S13X && (direction == Direction.RIGHT || direction == Direction.DOWN_RIGHT || direction == Direction.UP_RIGHT)) {
			toSumX = 0;
			toSumY = 0;
		}
			
		super.move(toSumX, toSumY, direction);
		this.updatePosition();
	}
	
	private int damage(RoleColiseo r, Direction dWeapon, boolean top) {
		if(dWeapon == Direction.LEFT) {
			if(super.getE().getWeaponL() == null)
				return Weapons.FIST.getWeapon().getPow();			
			else if((top && r.getTopDefense() == 0) || (top == false && r.getMidDefense() == 0))
				return super.getPowL();
			else if(top)
				return super.getPowL() * super.getE().getWeaponL().getType().getEndurance() / 
					   (r.getTopDefense() + r.getE().getArmorH().getType().getEndurance());
			
			return super.getPowL() * super.getE().getWeaponL().getType().getEndurance() / 
				  (r.getMidDefense() + r.getE().getArmorB().getType().getEndurance());
		}
		else if(dWeapon == Direction.RIGHT) {
			if(super.getE().getWeaponR() == null)
				return Weapons.FIST.getWeapon().getPow();
			else if((top && r.getTopDefense() == 0) || (top == false && r.getMidDefense() == 0))
				return super.getPowR();
			else if(top)
				return super.getPowR() * super.getE().getWeaponR().getType().getEndurance() / 
					   (r.getTopDefense() + r.getE().getArmorH().getType().getEndurance());
			
			return super.getPowR() * super.getE().getWeaponR().getType().getEndurance() / 
				  (r.getMidDefense() + r.getE().getArmorB().getType().getEndurance());
		}
		
		return 0;
	}

	public void attack(RoleColiseo r, Direction dWeapon, Direction dAttack) {
		int tempX = 0;
		int tempY = 0;
		int distance = 0;
		
		if(dWeapon == Direction.LEFT) {
			tempX = super.getE().getWeaponL().getX();
			tempY = super.getE().getWeaponL().getY();
			distance = super.getE().getWeaponL().getDistance();
		}
		else if(dWeapon == Direction.RIGHT) {
			tempX = super.getE().getWeaponR().getX();
			tempY = super.getE().getWeaponR().getY();
			distance = super.getE().getWeaponR().getDistance();
		}
		else
			System.out.println("Weapon direction can only be: LEFT/RIGHT");
		
		if(dAttack == Direction.UP) {
			  if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setY(tempY - distance * ArenaMap.MAP_SPACE_Y);
			  }
			  else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setY(tempY - distance * ArenaMap.MAP_SPACE_Y);
			  }
		}
		else if(dAttack == Direction.DOWN) {
			  if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setY(tempY + distance * ArenaMap.MAP_SPACE_Y);
			  }
			  else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setY(tempY + distance * ArenaMap.MAP_SPACE_Y);
			  }
		}
		else if(dAttack == Direction.RIGHT) {
			  if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setX(tempX + distance * ArenaMap.MAP_SPACE_X);
			  }
			  else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setX(tempX + distance * ArenaMap.MAP_SPACE_X);
			  }
		}
		else if(dAttack == Direction.LEFT) {
			if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setX(tempX - distance * ArenaMap.MAP_SPACE_X);
			  }
			else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setX(tempX - distance * ArenaMap.MAP_SPACE_X);
			  }
		}
		else if(dAttack == Direction.UP_RIGHT) {
			if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setX(tempX + distance * ArenaMap.MAP_SPACE_X);
				  super.getE().getWeaponL().setY(tempY - distance * ArenaMap.MAP_SPACE_Y);
			  }
			else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setX(tempX + distance * ArenaMap.MAP_SPACE_X);
				  super.getE().getWeaponR().setY(tempY - distance * ArenaMap.MAP_SPACE_Y);
			  }
		}
		else if(dAttack == Direction.UP_LEFT) {
			if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setX(tempX - distance * ArenaMap.MAP_SPACE_X);
				  super.getE().getWeaponL().setY(tempY - distance * ArenaMap.MAP_SPACE_Y);
			  }
			else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setX(tempX - distance * ArenaMap.MAP_SPACE_X);
				  super.getE().getWeaponR().setY(tempY - distance * ArenaMap.MAP_SPACE_Y);
			  }
		}
		else if(dAttack == Direction.DOWN_RIGHT) {
			if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setX(tempX + distance * ArenaMap.MAP_SPACE_X);
				  super.getE().getWeaponL().setY(tempY + distance * ArenaMap.MAP_SPACE_Y);
			  }
			else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setX(tempX + distance * ArenaMap.MAP_SPACE_X);
				  super.getE().getWeaponR().setY(tempY + distance * ArenaMap.MAP_SPACE_Y);
			  }
		}
		else if(dAttack == Direction.UP_LEFT) {
			if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setX(tempX - distance * ArenaMap.MAP_SPACE_X);
				  super.getE().getWeaponL().setY(tempY + distance * ArenaMap.MAP_SPACE_Y);
			  }
			else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setX(tempX - distance * ArenaMap.MAP_SPACE_X);
				  super.getE().getWeaponR().setY(tempY + distance * ArenaMap.MAP_SPACE_Y);
			  }
		}
		
		if(r.hit(dWeapon == Direction.LEFT? super.getE().getWeaponL() : super.getE().getWeaponR())) { 	// checar hit completa
			  
			  if(r.getHead().hit(dWeapon == Direction.LEFT? super.getE().getWeaponL() : super.getE().getWeaponR())) {
				  
				   r.setHp(r.getHp() - this.damage(r, dWeapon, true));
				   
				   if(r.getTopDefense() != 0)
					   r.getE().getArmorH().decrease();
			  }
			  else {
				  r.setHp(r.getHp() - this.damage(r, dWeapon, false));
				  
				  if(r.getMidDefense() != 0)
					  r.getE().getArmorB().decrease();
			  }
			  
			  if(dWeapon == Direction.LEFT) {
				   if(super.getE().getWeaponL().getEndurance() == 0)
					   super.getE().setWeaponL(Weapons.FIST.getWeapon());
					   
				   super.getE().getWeaponL().decrease();
			   }
			   else if(dWeapon == Direction.RIGHT) {
				   if(super.getE().getWeaponR().getEndurance() == 0)
					   super.getE().setWeaponR(Weapons.FIST.getWeapon());
					   
				   super.getE().getWeaponR().decrease();
			   }
			  	
		 }
		
		  if(dWeapon == Direction.LEFT) {
			  super.getE().getWeaponL().setX(tempX);
			  super.getE().getWeaponL().setY(tempY);
		  }
		  else if(dWeapon == Direction.RIGHT) {
			  super.getE().getWeaponR().setX(tempX);
			  super.getE().getWeaponR().setY(tempY);
		  }
		  
		  super.updateAtributes(super.getHp(), super.getX(), super.getY(), super.getE());
		  r.updateAtributes(r.getHp(), r.getX(), r.getY(), r.getE());
	}
	
	public void jump(boolean before) {
		if(before)
			super.move(0, ArenaMap.MAP_SPACE_Y, Direction.UP);
		else
			super.move(0, ArenaMap.MAP_SPACE_Y, Direction.DOWN);
	}
	
	public void includeShield() {
		if(super.getE().getWeaponL() != null && super.getE().getWeaponL().equals(Weapons.IRON_SHIELD.getWeapon()) || 
		   super.getE().getWeaponR() != null && super.getE().getWeaponR().equals(Weapons.IRON_SHIELD.getWeapon())) {
			if(super.getE().getArmorS() == null)
				super.getE().setArmorS(Armors.IRON_SHIELD.getArmor());
			else if(super.getE().getWeaponL() != null && super.getE().getWeaponL().equals(Weapons.IRON_SHIELD.getWeapon()) && 
					super.getE().getWeaponR() != null && super.getE().getWeaponR().equals(Weapons.IRON_SHIELD.getWeapon())){
				super.getE().getArmorS().setDefense(super.getE().getArmorS().getDefense() * 2);
				super.getE().getArmorS().setWeight(super.getE().getArmorS().getWeight() * 2);
			}
			
			super.updateAtributes(super.getHp(), super.getX(), super.getY(), super.getE());
		}
	}
	
	public boolean shot(int x, int y, RoleColiseo r, Direction wDir, Direction dShot) {
		if(wDir == Direction.RIGHT && super.getE().getWeaponR() != null && super.getE().getWeaponR().isFlyable() == false)
			return false;
		if(wDir == Direction.LEFT && super.getE().getWeaponL() != null && super.getE().getWeaponL().isFlyable() == false)
			return false;
		if(wDir == Direction.RIGHT && super.getE().getWeaponR() == null)
			return false;
		if(wDir == Direction.LEFT && super.getE().getWeaponL() == null)
			return false;
		
		
		boolean hit = false;
		double angle = Math.asin(x * Role.GRAVITY / (V0 * V0));
		Weapon temp = wDir == Direction.RIGHT? super.getE().getWeaponR().clone() : super.getE().getWeaponL().clone();
		angle *= 57.2958;
	
		if(super.shot(angle, V0, r, wDir, dShot)) {
			if(r.getHead().hit(temp)) {
				r.setHp(r.getHp() - (int)(Math.pow(this.damage(r, wDir, true), 2) * temp.getType().getEndurance() / Math.abs(x - super.getX())));
				//this.damage(r, wDir, false));
				
				   if(r.getTopDefense() != 0) {
					   r.getE().getArmorH().decrease();
					   r.updateAtributes(r.getHp(), r.getX(), r.getY(), r.getE());
				   }
				   
			}
			else {
				  r.setHp(r.getHp() - (int)(Math.pow(this.damage(r, wDir, true), 2) * temp.getType().getEndurance() / Math.abs(x - super.getX())));
				  //this.damage(r, wDir, false));
				  
				  if(r.getMidDefense() != 0) {
					  r.getE().getArmorB().decrease();
					  r.updateAtributes(r.getHp(), r.getX(), r.getY(), r.getE());
				  }
			 }
			
			if(wDir == Direction.RIGHT)
				super.getE().setWeaponR(null);
			else
				super.getE().setWeaponL(null);
			
			hit = true;
			
		}
		
		if(wDir == Direction.RIGHT)
			super.getE().setWeaponR(null);
		else
			super.getE().setWeaponL(null);
		
		super.updateAtributes(super.getHp(), super.getX(), super.getY(), super.getE());
		r.updateAtributes(r.getHp(), r.getX(), r.getY(), r.getE());
		
		return hit;
	}
	
	@Override
	public String toString() {
		return String.format("Head: %s\n\nRoleColiseo: %s", head.toString(), super.toString());
	}
	
}
