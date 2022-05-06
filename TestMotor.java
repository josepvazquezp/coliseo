package proyecto;

import com.iteso.motor.Armor;
import com.iteso.motor.Direction;
import com.iteso.motor.Equipment;
import com.iteso.motor.Material;
import com.iteso.motor.Role;
import com.iteso.motor.Weapon;

public class TestMotor {

	public static void main(String[] args) {
		Material m = Materials.GOLD.getMaterial();
//		System.out.println(m);
		
		Armor a1 = Armors.IRON_BREASTPLATE.getArmor();
//		System.out.println(a1);
//		a1.decrease();
//		System.out.println(a1);
		
		Armor a2 = Armors.COPPER_HELMET.getArmor();
//		System.out.println(a2);
		
		Weapon w = Weapons.COPPER_AXE.getWeapon();
//		System.out.println(w);
//		w.decrease();
//		System.out.println(w);
		
		Weapon w2 = Weapons.GOLD_MACE.getWeapon();
//		System.out.println(w2);
		
		Equipment e = new Equipment();
		e.setWeaponL(w);
		e.setWeaponR(w2);
		e.setArmorH(a2);
		e.setArmorB(a1);
//		System.out.println(e);
		
		Role r = new Role();
		r = Roles.ASSESSIN.getRole();
		r.setE(e);
		System.out.println(r);
		System.out.println();
//		r.updateAtributes(r.getHp(), 100, 300, e);
		r.move(22, Direction.UP);
		System.out.println(r);

	}

}
