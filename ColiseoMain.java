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
		
		boolean menu = true, equip = false, temp = true;
		
		Menu m = new Menu(r);
		ChooseCharacter w = new ChooseCharacter(r);
		ChooseRightWeapon cR = new ChooseRightWeapon(e1);
		ChooseLeftWeapon cL = new ChooseLeftWeapon(e1);
		
		int id = 0;
		
		SelectMaterial materialWR = null;
		
		while(equip == false) {
			if(r.getX() == 0)
				m.setVisible(true);
				
			if(r.getX() != 0 && r.getHp() == 0) {
				w.setVisible(true);
			}
			
			if(r.getHp() != 0 &&  e1.getWeaponR() == null) {
				cR.setVisible(true);
			}
			
			if(e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.COPPER_AXE.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e1, 1, true);
					e1.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
			}
			
			if(e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.COPPER_SWORD.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e1, 2, true);
					e1.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
			}
			
			if(e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.COPPER_KUNAI.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e1, 3, true);
					e1.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
			}
			
			if(e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.COPPER_MACE.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e1, 4, true);
					e1.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
			}
			
			if(e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.COPPER_LONG_AXE.getWeapon())) {
				if(materialWR == null) {
					materialWR = new SelectMaterial(e1, 5, true);
					e1.setWeaponR(Weapons.FIST.getWeapon());
				}
				
				materialWR.setVisible(true);
				
			}
			
			if(e1.getWeaponR() != null)
				System.out.println();
			
			if(e1.getWeaponR() != null && e1.getWeaponR().equals(Weapons.FIST.getWeapon()) == false)//&& e1.getWeaponL() != null)
				equip = true;
			
		}
		
		r.setE(e1);
		r.includeShield();
		
		System.out.println(r);
		equip = true;
		w = new ChooseCharacter(r2);
		
	}
}
