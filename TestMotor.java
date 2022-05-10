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
//		m.changeEndurance("gold", 10);
//		System.out.println(m);
		
		Armor a1 = Armors.IRON_BREASTPLATE.getArmor();
//		System.out.println(a1);
//		a1.decrease();
//		System.out.println(a1);
//		Armor a3 = a1.clone();
//		System.out.println(a1.equals(a3));
		
		Armor a2 = Armors.COPPER_HELMET.getArmor();
//		System.out.println(a2);
		
		Weapon w = Weapons.COPPER_AXE.getWeapon();
//		System.out.println(w);
//		w.decrease();
//		System.out.println(w);
//		Weapon w3 = w.clone();
//		System.out.println(w);
//		System.out.println(w3);
//		System.out.println(w.equals(w3));
		w.setX(10);
		w.setY(20);
		
		Weapon w2 = Weapons.GOLD_MACE.getWeapon();
//		System.out.println(w2);
		
		Equipment e = new Equipment();
		e.setWeaponL(w);
		e.setWeaponR(w2);
		e.setArmorH(a2);
		e.setArmorB(a1);
//		System.out.println(e);
//		Equipment e2 = e.clone();
//		System.out.println(e.equals(e2));
		
		Role r = new Role();
		r = Roles.ASSESSIN.getRole();
		r.setE(e);
		r.setX(100);
		r.setY(10);
//		System.out.println(r);
//		System.out.println();
//		r.updateAtributes(r.getHp(), 100, 300, e);
//		r.move(22, Direction.UP);
//		System.out.println(r);
//		Role r2 = r.clone();
//		r.updateAtributes(r.getHp(), 100, 300, e);
//		System.out.println(r2.equals(r));
//		System.out.println(r.hit(10, 10, w, 5, 20));
		
//		r.shot(w, 100, 10, 34, 20, 10, 30, 20);
		
		
	}

}
