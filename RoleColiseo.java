package proyecto;

import com.iteso.motor.Direction;
import com.iteso.motor.Role;

public class RoleColiseo extends Role {
	
	public static final int MAP_SPACE, DIF_TO_HEAD, L_HEAD, H_HEAD;
	Role head;
	
	static {
		MAP_SPACE = 10;			// por acordar según las dimensiones necesarias
		DIF_TO_HEAD = 10;
		L_HEAD = 10;
		H_HEAD = 10;
	}
	
	public RoleColiseo() {
		super();
		head = new Role();
		head.setLong(L_HEAD);
		head.setHeight(H_HEAD);
	}
	
	public void updateHeadPosition() {
		head.setX(super.getX());
		head.setY(super.getY() + DIF_TO_HEAD);
	}
	
	public Role getHead() {
		return this.head;
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
				  super.getE().getWeaponL().setY(tempY - distance * MAP_SPACE);
			  }
			  else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setY(tempY - distance * MAP_SPACE);
			  }
		}
		else if(dAttack == Direction.DOWN) {
			  if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setY(tempY + distance * MAP_SPACE);
			  }
			  else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setY(tempY + distance * MAP_SPACE);
			  }
		}
		else if(dAttack == Direction.RIGHT) {
			  if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setX(tempX + distance * MAP_SPACE);
			  }
			  else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setX(tempX + distance * MAP_SPACE);
			  }
		}
		else if(dAttack == Direction.LEFT) {
			if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setX(tempX - distance * MAP_SPACE);
			  }
			else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setX(tempX - distance * MAP_SPACE);
			  }
		}
		else if(dAttack == Direction.UP_RIGHT) {
			if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setX(tempX + distance * MAP_SPACE);
				  super.getE().getWeaponL().setY(tempY - distance * MAP_SPACE);
			  }
			else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setX(tempX + distance * MAP_SPACE);
				  super.getE().getWeaponR().setY(tempY - distance * MAP_SPACE);
			  }
		}
		else if(dAttack == Direction.UP_LEFT) {
			if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setX(tempX - distance * MAP_SPACE);
				  super.getE().getWeaponL().setY(tempY - distance * MAP_SPACE);
			  }
			else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setX(tempX - distance * MAP_SPACE);
				  super.getE().getWeaponR().setY(tempY - distance * MAP_SPACE);
			  }
		}
		else if(dAttack == Direction.DOWN_RIGHT) {
			if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setX(tempX + distance * MAP_SPACE);
				  super.getE().getWeaponL().setY(tempY + distance * MAP_SPACE);
			  }
			else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setX(tempX + distance * MAP_SPACE);
				  super.getE().getWeaponR().setY(tempY + distance * MAP_SPACE);
			  }
		}
		else if(dAttack == Direction.UP_LEFT) {
			if(dWeapon == Direction.LEFT) {
				  super.getE().getWeaponL().setX(tempX - distance * MAP_SPACE);
				  super.getE().getWeaponL().setY(tempY + distance * MAP_SPACE);
			  }
			else if(dWeapon == Direction.RIGHT) {
				  super.getE().getWeaponR().setX(tempX - distance * MAP_SPACE);
				  super.getE().getWeaponR().setY(tempY + distance * MAP_SPACE);
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
	}
	
	public void jump(boolean before) {
		if(before)
			super.move(MAP_SPACE, Direction.UP);
		else
			super.move(MAP_SPACE, Direction.DOWN);
	}
	
	public void includeShield() {
		if(super.getE().getWeaponL().equals(Weapons.IRON_SHIELD.getWeapon()) || 
		   super.getE().getWeaponR().equals(Weapons.IRON_SHIELD.getWeapon())) {
			if(super.getE().getArmorS() == null)
				super.getE().setArmorS(Armors.IRON_SHIELD.getArmor());
			else {
				super.getE().getArmorS().setDefense(super.getE().getArmorS().getDefense() * 2);
				super.getE().getArmorS().setWeight(super.getE().getArmorS().getWeight() * 2);
			}
		}
	}
	
	public void fling(Direction direction) {
		// hasta que quede el shot del motor físico
	}
	
}
