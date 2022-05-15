package proyecto;

import javax.swing.JOptionPane;

import com.iteso.motor.Direction;
import com.iteso.motor.Equipment;

public class Coliseum {
	public static void main(String[] args) {
		RoleColiseo r = Roles.ASSESSIN.getRole();
		r.setX(ArenaMap.S2X);
		r.setY(ArenaMap.S2Y);
		
		RoleColiseo r2 = Roles.STANDAR.getRole();
		r2.setX(ArenaMap.S14X);
		r2.setY(ArenaMap.S14Y);
		
		Equipment e1 = new Equipment(), e2 = new Equipment();
		
		boolean turn = true, jumpP1 = false, jumpP2 = false;
		int state = 0;
		int o = -1;
		
		Direction d = Direction.LEFT;
		Direction d2 = Direction.RIGHT;
		
		// choose class P1
		while(o != 0) {
			o = Integer.parseInt(JOptionPane.showInputDialog("Choose class:\n->Tank 1\n->Knight 2\n->Ninja 3"));
			if(o == 1)
				r = Roles.TANK.getRole();
			else if(o == 2)
				r = Roles.STANDAR.getRole();
			else if(o == 3)
				r = Roles.ASSESSIN.getRole();
		}
		
		o = -1;
		
		// choose right weapon P1
		while(o != 0) {
			o = Integer.parseInt(JOptionPane.showInputDialog("Choose right weapon:\n->Axe 1\n->Sword 2\n->Kunai 3\n->Maze 4\n->Long axe 5\n->Shield 6"));
			if(o == 1) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e1.setWeaponR(Weapons.GOLD_AXE.getWeapon()); 
				else if(o == 2)
					e1.setWeaponR(Weapons.IRON_AXE.getWeapon()); 
				else if(o == 3)
					e1.setWeaponR(Weapons.COPPER_AXE.getWeapon()); 
			}
			else if(o == 2) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e1.setWeaponR(Weapons.GOLD_SWORD.getWeapon()); 
				else if(o == 2)
					e1.setWeaponR(Weapons.IRON_SWORD.getWeapon()); 
				else if(o == 3)
					e1.setWeaponR(Weapons.COPPER_SWORD.getWeapon());
			}
			else if(o == 3) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e1.setWeaponR(Weapons.GOLD_KUNAI.getWeapon()); 
				else if(o == 2)
					e1.setWeaponR(Weapons.IRON_KUNAI.getWeapon()); 
				else if(o == 3)
					e1.setWeaponR(Weapons.COPPER_KUNAI.getWeapon());
			}
			else if(o == 4) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e1.setWeaponR(Weapons.GOLD_MACE.getWeapon()); 
				else if(o == 2)
					e1.setWeaponR(Weapons.IRON_MACE.getWeapon()); 
				else if(o == 3)
					e1.setWeaponR(Weapons.COPPER_MACE.getWeapon());
			}
			else if(o == 5) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e1.setWeaponR(Weapons.GOLD_LONG_AXE.getWeapon()); 
				else if(o == 2)
					e1.setWeaponR(Weapons.IRON_LONG_AXE.getWeapon()); 
				else if(o == 3)
					e1.setWeaponR(Weapons.COPPER_LONG_AXE.getWeapon());
			}
			else if(o == 6) {
				e1.setWeaponR(Weapons.IRON_SHIELD.getWeapon());
				r.includeShield();
			}
		}
		o = -1;
		
		// choose left weapon P1
		while(o != 0) {
			o = Integer.parseInt(JOptionPane.showInputDialog("Choose left weapon:\n->Axe 1\n->Sword 2\n->Kunai 3\n->Maze 4\n->Long axe 5\n->Shield 6"));
			if(o == 1) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e1.setWeaponL(Weapons.GOLD_AXE.getWeapon()); 
				else if(o == 2)
					e1.setWeaponL(Weapons.IRON_AXE.getWeapon()); 
				else if(o == 3)
					e1.setWeaponL(Weapons.COPPER_AXE.getWeapon()); 
			}
			else if(o == 2) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e1.setWeaponL(Weapons.GOLD_SWORD.getWeapon()); 
				else if(o == 2)
					e1.setWeaponL(Weapons.IRON_SWORD.getWeapon()); 
				else if(o == 3)
					e1.setWeaponL(Weapons.COPPER_SWORD.getWeapon());
			}
			else if(o == 3) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e1.setWeaponL(Weapons.GOLD_KUNAI.getWeapon()); 
				else if(o == 2)
					e1.setWeaponL(Weapons.IRON_KUNAI.getWeapon()); 
				else if(o == 3)
					e1.setWeaponL(Weapons.COPPER_KUNAI.getWeapon());
			}
			else if(o == 4) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e1.setWeaponL(Weapons.GOLD_MACE.getWeapon()); 
				else if(o == 2)
					e1.setWeaponL(Weapons.IRON_MACE.getWeapon()); 
				else if(o == 3)
					e1.setWeaponL(Weapons.COPPER_MACE.getWeapon());
			}
			else if(o == 5) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e1.setWeaponL(Weapons.GOLD_LONG_AXE.getWeapon()); 
				else if(o == 2)
					e1.setWeaponL(Weapons.IRON_LONG_AXE.getWeapon()); 
				else if(o == 3)
					e1.setWeaponL(Weapons.COPPER_LONG_AXE.getWeapon());
			}
			else if(o == 6) {
				e1.setWeaponL(Weapons.IRON_SHIELD.getWeapon()); 
				r.includeShield();
			}
		}
		o = -1;
		
		// choose armors P1
		while(o != 0) {
			o = Integer.parseInt(JOptionPane.showInputDialog("Choose armors:\n->Helmet 1\n->Breastplate 2"));
			if(o == 1) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e1.setArmorH(Armors.GOLD_HELMET.getArmor());
				else if(o == 2)
					e1.setArmorH(Armors.IRON_HELMET.getArmor());
				else if(o == 3)
					e1.setArmorH(Armors.COPPER_HELMET.getArmor());
			}
			else if(o == 2) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e1.setArmorB(Armors.GOLD_BREASTPLATE.getArmor());
				else if(o == 2)
					e1.setArmorB(Armors.IRON_BREASTPLATE.getArmor());
				else if(o == 3)
					e1.setArmorB(Armors.COPPER_BREASTPLATE.getArmor());
			}
		}
			
		o = -1;
		
		// choose class P2
		while(o != 0) {
			o = Integer.parseInt(JOptionPane.showInputDialog("Choose class:\n->Tank 1\n->Knight 2\n->Ninja 3"));
			if(o == 1)
				r2 = Roles.TANK.getRole();
			else if(o == 2)
				r2 = Roles.STANDAR.getRole();
			else if(o == 3)
				r2 = Roles.ASSESSIN.getRole();
		}
		
		o = -1;
		
		// choose right weapon P2
		while(o != 0) {
			o = Integer.parseInt(JOptionPane.showInputDialog("Choose right weapon:\n->Axe 1\n->Sword 2\n->Kunai 3\n->Maze 4\n->Long axe 5\n->Shield 6"));
			if(o == 1) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e2.setWeaponR(Weapons.GOLD_AXE.getWeapon()); 
				else if(o == 2)
					e2.setWeaponR(Weapons.IRON_AXE.getWeapon()); 
				else if(o == 3)
					e2.setWeaponR(Weapons.COPPER_AXE.getWeapon()); 
			}
			else if(o == 2) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e2.setWeaponR(Weapons.GOLD_SWORD.getWeapon()); 
				else if(o == 2)
					e2.setWeaponR(Weapons.IRON_SWORD.getWeapon()); 
				else if(o == 3)
					e2.setWeaponR(Weapons.COPPER_SWORD.getWeapon());
			}
			else if(o == 3) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e2.setWeaponR(Weapons.GOLD_KUNAI.getWeapon()); 
				else if(o == 2)
					e2.setWeaponR(Weapons.IRON_KUNAI.getWeapon()); 
				else if(o == 3)
					e2.setWeaponR(Weapons.COPPER_KUNAI.getWeapon());
			}
			else if(o == 4) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e2.setWeaponR(Weapons.GOLD_MACE.getWeapon()); 
				else if(o == 2)
					e2.setWeaponR(Weapons.IRON_MACE.getWeapon()); 
				else if(o == 3)
					e2.setWeaponR(Weapons.COPPER_MACE.getWeapon());
			}
			else if(o == 5) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e2.setWeaponR(Weapons.GOLD_LONG_AXE.getWeapon()); 
				else if(o == 2)
					e2.setWeaponR(Weapons.IRON_LONG_AXE.getWeapon()); 
				else if(o == 3)
					e2.setWeaponR(Weapons.COPPER_LONG_AXE.getWeapon());
			}
			else if(o == 6) {
				e2.setWeaponR(Weapons.IRON_SHIELD.getWeapon()); 
				r2.includeShield();
			}
		}
		o = -1;
		
		// choose left weapon P2
		while(o != 0) {
			o = Integer.parseInt(JOptionPane.showInputDialog("Choose left weapon:\n->Axe 1\n->Sword 2\n->Kunai 3\n->Maze 4\n->Long axe 5\n->Shield 6"));
			if(o == 1) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e2.setWeaponL(Weapons.GOLD_AXE.getWeapon()); 
				else if(o == 2)
					e2.setWeaponL(Weapons.IRON_AXE.getWeapon()); 
				else if(o == 3)
					e2.setWeaponL(Weapons.COPPER_AXE.getWeapon()); 
			}
			else if(o == 2) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e2.setWeaponL(Weapons.GOLD_SWORD.getWeapon()); 
				else if(o == 2)
					e2.setWeaponL(Weapons.IRON_SWORD.getWeapon()); 
				else if(o == 3)
					e2.setWeaponL(Weapons.COPPER_SWORD.getWeapon());
			}
			else if(o == 3) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e2.setWeaponL(Weapons.GOLD_KUNAI.getWeapon()); 
				else if(o == 2)
					e2.setWeaponL(Weapons.IRON_KUNAI.getWeapon()); 
				else if(o == 3)
					e2.setWeaponL(Weapons.COPPER_KUNAI.getWeapon());
			}
			else if(o == 4) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e2.setWeaponL(Weapons.GOLD_MACE.getWeapon()); 
				else if(o == 2)
					e2.setWeaponL(Weapons.IRON_MACE.getWeapon()); 
				else if(o == 3)
					e2.setWeaponL(Weapons.COPPER_MACE.getWeapon());
			}
			else if(o == 5) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e2.setWeaponL(Weapons.GOLD_LONG_AXE.getWeapon()); 
				else if(o == 2)
					e2.setWeaponL(Weapons.IRON_LONG_AXE.getWeapon()); 
				else if(o == 3)
					e2.setWeaponL(Weapons.COPPER_LONG_AXE.getWeapon());
			}
			else if(o == 6) {
				e2.setWeaponL(Weapons.IRON_SHIELD.getWeapon());
				r2.includeShield();
			}
		}
		
		o = -1;
		
		// choose armors P2
		while(o != 0) {
			o = Integer.parseInt(JOptionPane.showInputDialog("Choose armors:\n->Helmet 1\n->Breastplate 2"));
			if(o == 1) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e2.setArmorH(Armors.GOLD_HELMET.getArmor());
				else if(o == 2)
					e2.setArmorH(Armors.IRON_HELMET.getArmor());
				else if(o == 3)
					e2.setArmorH(Armors.COPPER_HELMET.getArmor());
			}
			else if(o == 2) {
				o = Integer.parseInt(JOptionPane.showInputDialog("Material:\n->Gold 1\n->Iron 2\n->Copper 3\n"));
				if(o == 1)
					e2.setArmorB(Armors.GOLD_BREASTPLATE.getArmor());
				else if(o == 2)
					e2.setArmorB(Armors.IRON_BREASTPLATE.getArmor());
				else if(o == 3)
					e2.setArmorB(Armors.COPPER_BREASTPLATE.getArmor());
			}
		}
		
		r.setE(e1);
		r2.setE(e2);
		
		// battle
		while(state != 5 || state != 6) {
			switch(state) {
				case 0: if(jumpP1) {
							r.jump(false);
							jumpP1 = false;
						}
						
						if(jumpP2) {
							r2.jump(false);
							jumpP2 = false;
						}
						
						System.out.println("Role 1");
						System.out.println(r);
						System.out.println();
						System.out.println("Role 2");
						System.out.println(r2);
						o = Integer.parseInt(JOptionPane.showInputDialog("Introduce an action:\n->Attack 1\n->Move 2\n->Jump 3\n->Shot 4"));
						if(o == 1)
							state = 1;
						else if(o == 2)
							state = 2;
						else if(o == 3)
							state = 3;
						else if(o == 4)
							state = 4;
						break;
				case 1: o = Integer.parseInt(JOptionPane.showInputDialog("Introduce wepon to attack:\nRight 1\\n->Left 2"));
						if(o == 1)
							d = Direction.RIGHT;
						else if(o == 2)
							d = Direction.LEFT;
						
					    o = Integer.parseInt(JOptionPane.showInputDialog("Introduce attack direction:\n->Right 1\n->Left 2\n->Up 3\n->Down 4\n->Up_right 5\n->Up_left 6\n->Down_right 7\n->Down_Left 8"));
						if(turn) {
							if(o == 1)
								r.attack(r2, d, Direction.RIGHT);
							else if(o == 2)
								r.attack(r2, d, Direction.LEFT);
							else if(o == 3)
								r.attack(r2, d, Direction.UP);
							else if(o == 4)
								r.attack(r2, d, Direction.DOWN);
							else if(o == 5)
								r.attack(r2, d, Direction.UP_RIGHT);
							else if(o == 6)
								r.attack(r2, d, Direction.UP_LEFT);
							else if(o == 7)
								r.attack(r2, d, Direction.DOWN_RIGHT);
							else if(o == 8)
								r.attack(r2, d, Direction.DOWN_LEFT);
								
							turn = false;
							
						}
						else {
							if(o == 1)
								r2.attack(r2, d, Direction.RIGHT);
							else if(o == 2)
								r2.attack(r2, d, Direction.LEFT);
							else if(o == 3)
								r2.attack(r2, d, Direction.UP);
							else if(o == 4)
								r2.attack(r2, d, Direction.DOWN);
							else if(o == 5)
								r2.attack(r2, d, Direction.UP_RIGHT);
							else if(o == 6)
								r2.attack(r2, d, Direction.UP_LEFT);
							else if(o == 7)
								r2.attack(r2, d, Direction.DOWN_RIGHT);
							else if(o == 8)
								r2.attack(r2, d, Direction.DOWN_LEFT);
							
							turn = true; 
						}
						
						state = 0;
						
						if(r.getHp() == 0)
							state = 5;
						
						if(r2.getHp() == 0)
							state = 6;
						
						break;
				case 2: o = Integer.parseInt(JOptionPane.showInputDialog("Introduce direction:\n->Right 1\n->Left 2\n->Up 3\n->Down 4\n->Up_right 5\n->Up_left 6\n->Down_right 7\n->Down_Left 8"));
						if(turn) {
							if(o == 1)
								r.move(ArenaMap.MAP_SPACE_X, 0, Direction.RIGHT);
							else if(o == 2)
								r.move(ArenaMap.MAP_SPACE_X, 0, Direction.LEFT);
							else if(o == 3)
								r.move(0, ArenaMap.MAP_SPACE_Y, Direction.UP);
							else if(o == 4)
								r.move(0, ArenaMap.MAP_SPACE_Y, Direction.DOWN);
							else if(o == 5)
								r.move(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_Y, Direction.UP_RIGHT);
							else if(o == 6)
								r.move(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_Y, Direction.UP_LEFT);
							else if(o == 7)
								r.move(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_Y, Direction.DOWN_RIGHT);
							else if(o == 8)
								r.move(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_Y, Direction.DOWN_LEFT);
							
							turn = false;
						}
						else {
							if(o == 1)
								r2.move(ArenaMap.MAP_SPACE_X, 0, Direction.RIGHT);
							else if(o == 2)
								r2.move(ArenaMap.MAP_SPACE_X, 0, Direction.LEFT);
							else if(o == 3)
								r2.move(0, ArenaMap.MAP_SPACE_Y, Direction.UP);
							else if(o == 4)
								r2.move(0, ArenaMap.MAP_SPACE_Y, Direction.DOWN);
							else if(o == 5)
								r2.move(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_Y, Direction.UP_RIGHT);
							else if(o == 6)
								r2.move(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_Y, Direction.UP_LEFT);
							else if(o == 7)
								r2.move(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_Y, Direction.DOWN_RIGHT);
							else if(o == 8)
								r2.move(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_Y, Direction.DOWN_LEFT);
							
							turn = true; 
						}
						
						state = 0;
						
						break;
				case 3: if(turn) {
							r.jump(true);
							turn = false;
						}
						else {
							r2.jump(true);
							turn = true;
						}
				
						state = 0;
						
						break;
				case 4: o = Integer.parseInt(JOptionPane.showInputDialog("Introduce wepon to throw:\nRight 1\\n->Left 2"));
						if(o == 1)
							d = Direction.RIGHT;
						else if(o == 2)
							d = Direction.LEFT;
				
						o = Integer.parseInt(JOptionPane.showInputDialog("Introduce shot direction:\n->S1 1\n->S2 2\nS3 3\nS4 4\nS5 5\nS6 6\nS7 7\nS8 8\n S9 9\nS10 10\nS11 11\nS12 12\nS13 13\nS14 14\nS15 15"));
						if(turn) {
							if(r.getX() < r2.getX())
								d2 = Direction.RIGHT;
							else
								d2 = Direction.LEFT;
							
							if(o == 1)
								r.shot(ArenaMap.S1X, ArenaMap.S1Y, r2, d, d2);
							else if(o == 2)
								r.shot(ArenaMap.S2X, ArenaMap.S2Y, r2, d, d2);
							else if(o == 3)
								r.shot(ArenaMap.S3X, ArenaMap.S3Y, r2, d, d2);
							else if(o == 4)
								r.shot(ArenaMap.S4X, ArenaMap.S4Y, r2, d, d2);
							else if(o == 5)
								r.shot(ArenaMap.S5X, ArenaMap.S5Y, r2, d, d2);
							else if(o == 6)
								r.shot(ArenaMap.S6X, ArenaMap.S6Y, r2, d, d2);
							else if(o == 7)
								r.shot(ArenaMap.S7X, ArenaMap.S7Y, r2, d, d2);
							else if(o == 8)
								r.shot(ArenaMap.S8X, ArenaMap.S8Y, r2, d, d2);
							else if(o == 9)
								r.shot(ArenaMap.S9X, ArenaMap.S9Y, r2, d, d2);
							else if(o == 10)
								r.shot(ArenaMap.S10X, ArenaMap.S10Y, r2, d, d2);
							else if(o == 11)
								r.shot(ArenaMap.S11X, ArenaMap.S11Y, r2, d, d2);
							else if(o == 12)
								r.shot(ArenaMap.S12X, ArenaMap.S12Y, r2, d, d2);
							else if(o == 13)
								r.shot(ArenaMap.S13X, ArenaMap.S13Y, r2, d, d2);
							else if(o == 14)
								r.shot(ArenaMap.S14X, ArenaMap.S14Y, r2, d, d2);
							else if(o == 15)
								r.shot(ArenaMap.S15X, ArenaMap.S15Y, r2, d, d2);
							
							turn = false;
							
						}
						else {
							if(r2.getX() < r.getX())
								d2 = Direction.RIGHT;
							else
								d2 = Direction.LEFT;
							
							if(o == 1)
								r2.shot(ArenaMap.S1X, ArenaMap.S1Y, r, d, d2);
							else if(o == 2)
								r2.shot(ArenaMap.S2X, ArenaMap.S2Y, r, d, d2);
							else if(o == 3)
								r2.shot(ArenaMap.S3X, ArenaMap.S3Y, r, d, d2);
							else if(o == 4)
								r2.shot(ArenaMap.S4X, ArenaMap.S4Y, r, d, d2);
							else if(o == 5)
								r2.shot(ArenaMap.S5X, ArenaMap.S5Y, r, d, d2);
							else if(o == 6)
								r2.shot(ArenaMap.S6X, ArenaMap.S6Y, r, d, d2);
							else if(o == 7)
								r2.shot(ArenaMap.S7X, ArenaMap.S7Y, r, d, d2);
							else if(o == 8)
								r2.shot(ArenaMap.S8X, ArenaMap.S8Y, r, d, d2);
							else if(o == 9)
								r2.shot(ArenaMap.S9X, ArenaMap.S9Y, r, d, d2);
							else if(o == 10)
								r2.shot(ArenaMap.S10X, ArenaMap.S10Y, r, d, d2);
							else if(o == 11)
								r2.shot(ArenaMap.S11X, ArenaMap.S11Y, r, d, d2);
							else if(o == 12)
								r2.shot(ArenaMap.S12X, ArenaMap.S12Y, r, d, d2);
							else if(o == 13)
								r2.shot(ArenaMap.S13X, ArenaMap.S13Y, r, d, d2);
							else if(o == 14)
								r2.shot(ArenaMap.S14X, ArenaMap.S14Y, r, d, d2);
							else if(o == 15)
								r2.shot(ArenaMap.S15X, ArenaMap.S15Y, r, d, d2);
							
							turn = true;
						}
						
						state = 0;
						
						if(r.getHp() == 0)
							state = 5;
						
						if(r2.getHp() == 0)
							state = 6;
						
						break;
				case 5: state = 5; 
						break;
				case 6: state = 6;
						break;
			}
		}
		
		if(state == 5)
			System.out.println("Winner: P1");
		else if(state == 6)
			System.out.println("Winner: P2");
	}
}
