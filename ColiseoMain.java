package proyecto;

import com.iteso.motor.Direction;
import com.iteso.motor.Equipment;

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
		
		BattleP1 b = new BattleP1(r);
		
		temp = false;
		while(temp == false) {
			b.setVisible(true);
		}
		
		
	}
}
