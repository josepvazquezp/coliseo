package proyecto;

import javax.swing.SwingUtilities;

import com.iteso.motor.Direction;
import com.iteso.motor.Equipment;
import com.iteso.motor.Weapon;

public class ColiseoMain {
	public static void main(String[] args) {
		RoleColiseo r = new RoleColiseo();
		RoleColiseo r2 = new RoleColiseo();

		r2.setX(ArenaMap.S14X);
		r2.setY(ArenaMap.S14Y);
		
		Equipment e1 = new Equipment(), e2 = new Equipment();
		
		boolean turn = true, jumpP1 = false, jumpP2 = false;
		
		Direction d = Direction.LEFT;
		Direction d2 = Direction.RIGHT;
		
		boolean menu = true, equip = false, temp = false;
		
		Menu m = new Menu(r);
		ChooseCharacter w = new ChooseCharacter(r);
		ChooseRightWeapon cR = new ChooseRightWeapon(e1);
		ChooseLeftWeapon cL = new ChooseLeftWeapon(e1);
		
		int id = 0;
		
		SelectMaterial materialWR = null;
		SelectMaterial materialWL = null;

		// weapons P1
		while(equip == false) {
			if(r.getX() == 0)
				m.setVisible(true);
				
			if(r.getX() != 0 && r.getHp() == 0) {
				w.setVisible(true);
			}
			
			if(r.getHp() != 0 &&  e1.getWeaponR() == null) {
				cR.setVisible(true);
			}
			
			if(e1.getWeaponL() == null && e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.COPPER_AXE.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e1, 1, true);
					e1.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
			}
			
			if(e1.getWeaponL() == null && e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.COPPER_SWORD.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e1, 2, true);
					e1.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
			}
			
			if(e1.getWeaponL() == null && e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.COPPER_KUNAI.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e1, 3, true);
					e1.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
			}
			
			if(e1.getWeaponL() == null && e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.COPPER_MACE.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e1, 4, true);
					e1.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
				temp = true;
			}
			
			if(e1.getWeaponL() == null && e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.COPPER_LONG_AXE.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e1, 5, true);
					e1.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
				temp = true;
			}
			
			System.out.println();
			
			if(e1.getWeaponL() == null && e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.FIST.getWeapon()) == false) {
				cL.setVisible(true);
				e1.setWeaponL(Weapons.FIST.getWeapon());
			}
			
			if(e1.getWeaponL() != null && e1.getWeaponL().equals(Weapons.COPPER_AXE.getWeapon())) {
				if(materialWL == null) {
					materialWL = new SelectMaterial(e1, 1, false);
					e1.setWeaponL(Weapons.FIST.getWeapon());
				}
				
				materialWL.setVisible(true);
			}
			
			if(e1.getWeaponL() != null && e1.getWeaponL().equals(Weapons.COPPER_SWORD.getWeapon())) {
				if(materialWL == null) {
					materialWL = new SelectMaterial(e1, 2, false);
					e1.setWeaponL(Weapons.FIST.getWeapon());
				}
				
				materialWL.setVisible(true);
			}
			
			if(e1.getWeaponL() != null && e1.getWeaponL().equals(Weapons.COPPER_KUNAI.getWeapon())) {
				if(materialWL == null) {
					materialWL = new SelectMaterial(e1, 3, false);
					e1.setWeaponL(Weapons.FIST.getWeapon());
				}
				
				materialWL.setVisible(true);
			}
			
			if(e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.FIST.getWeapon()) == false && temp == true || e1.getWeaponR() != null && e1.getWeaponL() != null && 
			   e1.getWeaponR().equals(Weapons.FIST.getWeapon()) == false &&
			   e1.getWeaponL().equals(Weapons.FIST.getWeapon()) == false) {
				equip = true;
			}
			
		}
		cL.setVisible(false);
		
		r.setE(e1);
		r.includeShield();
		
//		System.out.println(r);
		
		equip = false;
		
		SelectArmor sa = new SelectArmor(e1);
		SelectMaterialArmor sam = null;
		
		// armors P1
		while(equip == false) {
			if(e1.getArmorH() == null && e1.getArmorB() == null)
				sa.setVisible(true);
			
			if(e1.getArmorH() != null && e1.getArmorH().isHelmet() == true && e1.getArmorH().getDefense() == 0) {
				if(sam == null) {
					sam = new SelectMaterialArmor(e1, 2); 
				}
				
				sam.setVisible(true);
			}
			
			if(e1.getArmorB() != null && e1.getArmorB().isHelmet() == false && e1.getArmorB().getDefense() == 0) {
				if(sam == null) {
					sam = new SelectMaterialArmor(e1, 1); 
				}
				
				sam.setVisible(true);
			}
			
			if(e1.getArmorH() != null && e1.getArmorH().getDefense() > 0 || e1.getArmorB() != null && e1.getArmorB().getDefense() > 0)
				equip = true;
		}
		
		r.setE(e1);
//		System.out.println(r);
		r.getE().getWeaponR().setX(r.getX());
		r.getE().getWeaponR().setY(r.getY());
		
		r.getE().getWeaponL().setX(r.getX());
		r.getE().getWeaponL().setY(r.getY());
		
		equip = false;
		
		w = new ChooseCharacter(r2);
		cR = new ChooseRightWeapon(e2);
		cL = new ChooseLeftWeapon(e2);
		
		materialWR = null;
		materialWL = null;
		
		// weapons P2
		while(equip == false) {
			if(r2.getHp() == 0) {
				w.setVisible(true);
			}
			
			if(r2.getHp() != 0 &&  e2.getWeaponR() == null) {
				cR.setVisible(true);
			}
			
			if(e2.getWeaponL() == null && e2.getWeaponR() != null && e2.getWeaponR().equals(Weapons.COPPER_AXE.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e2, 1, true);
					e2.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
			}
			
			if(e2.getWeaponL() == null && e2.getWeaponR() != null && e2.getWeaponR().equals(Weapons.COPPER_SWORD.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e2, 2, true);
					e2.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
			}
			
			if(e2.getWeaponL() == null && e2.getWeaponR() != null && e2.getWeaponR().equals(Weapons.COPPER_KUNAI.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e2, 3, true);
					e2.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
			}
			
			if(e2.getWeaponL() == null && e2.getWeaponR() != null && e2.getWeaponR().equals(Weapons.COPPER_MACE.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e2, 4, true);
					e2.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
				temp = true;
			}
			
			if(e2.getWeaponL() == null && e2.getWeaponR() != null && e2.getWeaponR().equals(Weapons.COPPER_LONG_AXE.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e2, 5, true);
					e2.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
				temp = true;
			}
			
			System.out.println();
			
			if(e2.getWeaponL() == null && e2.getWeaponR() != null && e2.getWeaponR().equals(Weapons.FIST.getWeapon()) == false) {
				cL.setVisible(true);
				e2.setWeaponL(Weapons.FIST.getWeapon());
			}
			
			if(e2.getWeaponL() != null && e2.getWeaponL().equals(Weapons.COPPER_AXE.getWeapon())) {
				if(materialWL == null) {
					materialWL = new SelectMaterial(e2, 1, false);
					e2.setWeaponL(Weapons.FIST.getWeapon());
				}
				
				materialWL.setVisible(true);
			}
			
			if(e2.getWeaponL() != null && e2.getWeaponL().equals(Weapons.COPPER_SWORD.getWeapon())) {
				if(materialWL == null) {
					materialWL = new SelectMaterial(e2, 2, false);
					e2.setWeaponL(Weapons.FIST.getWeapon());
				}
				
				materialWL.setVisible(true);
			}
			
			if(e2.getWeaponL() != null && e2.getWeaponL().equals(Weapons.COPPER_KUNAI.getWeapon())) {
				if(materialWL == null) {
					materialWL = new SelectMaterial(e2, 3, false);
					e2.setWeaponL(Weapons.FIST.getWeapon());
				}
				
				materialWL.setVisible(true);
			}
			
			if(e2.getWeaponR() != null && e2.getWeaponR().equals(Weapons.FIST.getWeapon()) == false && temp == true || 
			   e2.getWeaponR() != null && e2.getWeaponL() != null && 
			   e2.getWeaponR().equals(Weapons.FIST.getWeapon()) == false &&
			   e2.getWeaponL().equals(Weapons.FIST.getWeapon()) == false) {
				equip = true;
			}
			
		}
		cL.setVisible(false);
		r2.setE(e2);
		r2.includeShield();
		
//		System.out.println(r);
		
		equip = false;
		
		sa = new SelectArmor(e2);
		sam = null;
		
		// armors P1
		while(equip == false) {
			if(e2.getArmorH() == null && e2.getArmorB() == null)
				sa.setVisible(true);
			
			if(e2.getArmorH() != null && e2.getArmorH().isHelmet() == true && e2.getArmorH().getDefense() == 0) {
				if(sam == null) {
					sam = new SelectMaterialArmor(e2, 2); 
				}
				
				sam.setVisible(true);
			}
			
			if(e2.getArmorB() != null && e2.getArmorB().isHelmet() == false && e2.getArmorB().getDefense() == 0) {
				if(sam == null) {
					sam = new SelectMaterialArmor(e2, 1); 
				}
				
				sam.setVisible(true);
			}
			
			if(e2.getArmorH() != null && e2.getArmorH().getDefense() > 0 || e2.getArmorB() != null && e2.getArmorB().getDefense() > 0)
				equip = true;
		}
		
		r2.setE(e2);
		
		r2.getE().getWeaponR().setX(r2.getX());
		r2.getE().getWeaponR().setY(r2.getY());
		
		r2.getE().getWeaponL().setX(r2.getX());
		r2.getE().getWeaponL().setY(r2.getY());
		
		System.out.println(r);
		System.out.println(r2);
		
		Weapon o = new Weapon();
		Weapon o2 = new Weapon();
		
		int mace = 75, longAxe = 70, axe = 20, sword = 45, kunai = 20, shield = 60; 
		
		int P1_W_R = 0, P1_W_L = 0, P2_W_R = 0, P2_W_L = 0, P1_A = 0, P2_A = 0;
		
		if(r.getE().getWeaponR().getHeight() == axe)
			P1_W_R = 1;
		else if(r.getE().getWeaponR().getHeight() == sword)
			P1_W_R = 2;
		else if(r.getE().getWeaponR().getLong() == kunai)
			P1_W_R = 3;
		else if(r.getE().getWeaponR().getHeight() == mace)
			P1_W_R = 4;
		else if(r.getE().getWeaponR().getHeight() == longAxe)
			P1_W_R = 5;
		else if(r.getE().getWeaponR().getHeight() == shield)
			P1_W_R = 6;
		
		if(r2.getE().getWeaponR().getHeight() == axe)
			P2_W_R = 1;
		else if(r2.getE().getWeaponR().getHeight() == sword)
			P2_W_R = 2;
		else if(r2.getE().getWeaponR().getLong() == kunai)
			P2_W_R = 3;
		else if(r2.getE().getWeaponR().getHeight() == mace)
			P2_W_R = 4;
		else if(r2.getE().getWeaponR().getHeight() == longAxe)
			P2_W_R = 5;
		else if(r2.getE().getWeaponR().getHeight() == shield)
			P2_W_R = 6;
		
		if(r.getE().getWeaponL() != null) {
			if(r.getE().getWeaponL().getHeight() == axe)
				P1_W_L = 1;
			else if(r.getE().getWeaponL().getHeight() == sword)
				P1_W_L = 2;
			else if(r.getE().getWeaponL().getLong() == kunai)
				P1_W_L = 3;
			else if(r.getE().getWeaponL().getHeight() == shield)
				P1_W_L = 4;
		}
		else
			P1_W_L = 0;
		
		if(r2.getE().getWeaponL() != null) {
			if(r2.getE().getWeaponL().getHeight() == axe)
				P2_W_L = 1;
			else if(r2.getE().getWeaponL().getHeight() == sword)
				P2_W_L = 2;
			else if(r2.getE().getWeaponL().getLong() == kunai)
				P2_W_L = 3;
			else if(r2.getE().getWeaponL().getHeight() == shield)
				P2_W_L = 4;
		}
		else
			P2_W_L = 0;
		
		if(r.getE().getArmorB() != null)
			P1_A = 1;
		else
			P1_A = 2;
		
		if(r2.getE().getArmorB() != null)
			P2_A = 1;
		else
			P2_A = 2;
		
		Battle b = new Battle(r, r2, true, o, r.getBaseSpeed(), r2.getBaseSpeed(), P1_W_R, P1_W_L, P2_W_R, P2_W_L, P1_A, P2_A);
		Battle b2 = new Battle(r2, r, false, o, r.getBaseSpeed(), r2.getBaseSpeed(), P1_W_R, P1_W_L, P2_W_R, P2_W_L, P1_A, P2_A);
		
		WeaponDirection wd = new WeaponDirection(P1_W_R, P1_W_L, o2, true);
		WeaponDirection wd2 = new WeaponDirection(P2_W_R, P2_W_L, o2, false);
		ActionDirection rd = null;
		MapShot ms = null;
		
		temp = false;
		
		int p1HP = r.getHp();
		int p2HP = r2.getHp();
		
		while(temp == false) {
			if(turn && o.getX() == 0)
				b.setVisible(true);
			
			if(turn == false && o.getX() == 0)
				b2.setVisible(true);
			
			if(turn) {
				if((o.getX() == 1 || o.getX() == 4) && o2.getX() == 0)
					wd.setVisible(true);
				
				if(o.getX() == 3) { 
					jumpP1 = true;
					o.setX(99);
				}
				
				if(o.getX() == 4 && o2.getX() == 1 || o.getX() == 4 && o2.getX() == 2) {
					if(ms == null)
						ms = new MapShot(r, r2, turn, o);
				
					ms.setVisible(true);
				}
				
				if(o.getX() == 2 || o.getX() == 1 && o2.getX() == 1 || o.getX() == 1 && o2.getX() == 2) {
					if(rd == null)
						rd = new ActionDirection(r, r2, o, o2, turn);
					
					rd.setVisible(true);
				}
				
			}
			else if(turn == false) {
				if((o.getX() == 1 || o.getX() == 4) && o2.getX() == 0)
					wd2.setVisible(true);
				
				if(o.getX() == 3) { 
					jumpP2 = true;
					o.setX(99);
				}
				
				if(o.getX() == 4 && o2.getX() == 1 || o.getX() == 4 && o2.getX() == 2) {
					if(ms == null)
						ms = new MapShot(r2, r, turn, o);
				
					ms.setVisible(true);
				}
				
				if(o.getX() == 2 || o.getX() == 1 && o2.getX() == 1 || o.getX() == 1 && o2.getX() == 2) {
					if(rd == null)
						rd = new ActionDirection(r2, r, o, o2, turn);
					
					rd.setVisible(true);
				}
			}
			
			if(r.getHp() <= 0) {
				o.setX(5);
				temp = true;
			}
			
			if(r2.getHp() <= 0) {
				o.setX(6);
				temp = true;
			}
			
			if(o.getX() == 99) {
				o.setX(0);
				o2.setX(0);
				
				if(jumpP1 == true)
					r.jump(false);
				
				if(jumpP2 == true)
					r2.jump(false);
				
				rd = null;
				
				if(P1_A == 1 && r.getE().getArmorB() == null)
					P1_A = 0;
				else if(P1_A == 2 && r.getE().getArmorH() == null)
					P1_A = 0;
				
				if(P2_A == 1 && r2.getE().getArmorB() == null)
					P2_A = 0;
				else if(P2_A == 2 && r2.getE().getArmorH() == null)
					P2_A = 0;
				
				b = new Battle(r, r2, true, o, r.getBaseSpeed(), r2.getBaseSpeed(),
						       r.getE().getWeaponR() != null? P1_W_R : 0, 
						       r.getE().getWeaponL() != null? P1_W_L : 0, 
						       r2.getE().getWeaponR() != null? P2_W_R : 0, 
						       r2.getE().getWeaponL() != null? P2_W_L : 0, 
						       P1_A, P2_A);

				b2 = new Battle(r2, r, false, o, r.getBaseSpeed(), r2.getBaseSpeed(), P1_W_R, P1_W_L, P2_W_R, P2_W_L, P1_A, P2_A);
				
				System.out.println(r);
				System.out.println(r2);
				turn = !turn;
			}
			
		}
		
		Winner wins = null;
		if(o.getX() == 5)
			wins = new Winner(false);
		else if(o.getX() == 6)
			wins = new Winner(true);
		
		wins.setVisible(true);
		
	}
}
