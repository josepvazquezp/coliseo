package proyecto;

import com.iteso.motor.Armor;
import com.iteso.motor.Direction;
import com.iteso.motor.Equipment;
import com.iteso.motor.Material;
import com.iteso.motor.NegativeNumberFound;
import com.iteso.motor.Role;
import com.iteso.motor.Weapon;

public class TestMotor {

	public static void main(String[] args) throws NegativeNumberFound {
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
		w.setX(0);
		w.setY(0);
//		w.setLong(10);
//		w.setHeight(10);
//		System.out.println(w);
		Weapon w2 = Weapons.GOLD_MACE.getWeapon();
//		System.out.println(w2);
		
		Equipment e = new Equipment();
		e.setWeaponR(w);
		e.setWeaponL(w);
		e.setWeaponL(w2);
		e.setArmorH(a2);
		e.setArmorB(a1);
		System.out.println(e);
//		Equipment e2 = e.clone();
//		System.out.println(e.equals(e2));
		
		RoleColiseo r = new RoleColiseo();
		r = Roles.ASSESSIN.getRole();
		r.setE(e);
		r.setX(0);
		r.setY(0);
		r.setLong(10);
		r.setHeight(10);
		
		RoleColiseo r2 = new RoleColiseo();
		r2 = Roles.TANK.getRole();
		r2.setE(e);
		r2.includeShield();
		r2.setX(25);
		r2.setY(1);
		r2.setLong(10);
		r2.setHeight(10);
//		System.out.println(r2);
//		System.out.println(r.shot(35, 0, r2, Direction.LEFT, Direction.RIGHT));
//		r2.jump(true);
		r.attack(r2, Direction.LEFT, Direction.RIGHT);
//		System.out.println(r2);
//		System.out.println(r);
//		r2.jump(false);
//		System.out.println(r2);
//		System.out.println(r2);
//		System.out.println(r);
//		System.out.println(r.shot(r2.getX(), r2.getY(), r2, Direction.LEFT, Direction.RIGHT));
//		r.attack(r2, Direction.LEFT, Direction.RIGHT);
//		System.out.println(r);
//		System.out.println(r2);
		
//		Role p = new Role();
//		p.setHp(300);
//		p.setX(0);
//		p.setY(0);
//		p.setLong(10);
//		p.setHeight(10);
//		System.out.println(p.hit(w));
		
//		System.out.println(r);
//		System.out.println();
//		r.updateAtributes(r.getHp(), 100, 300, e);
//		r.move(22, Direction.UP);
//		System.out.println(r);
//		Role r2 = r.clone();
//		r.updateAtributes(r.getHp(), 100, 300, e);
//		System.out.println(r2.equals(r));
//		System.out.println(r.hit(10, 10, w, 5, 20));
		
		
//		System.out.println(r.shot(30, 100, r, Direction.LEFT, Direction.RIGHT));
//		r.getE().setWeaponL(null);
//		System.out.println(e);
//		r.updateAtributes(r.getHp(), r.getX(), r.getY(), r.getE());
//		System.out.println(r);
//		r.getE().getArmorB().decrease();
//		System.out.println(r);
//		r.updateAtributes(r.getHp(), r.getX(), r.getY(), r.getE());
//		System.out.println(r);
		
	}

}

