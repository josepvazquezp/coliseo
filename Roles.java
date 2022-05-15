package proyecto;

import com.iteso.motor.Role;

public enum Roles {
	ASSESSIN(100, 1000, 0, 0),
	STANDAR(200, 500, 0, 0),
	TANK(300, 300, 0, 0);
	
	private RoleColiseo r = new RoleColiseo();
	
	private Roles(int hp, int speed, int l, int h) {
		r.setHp(hp);
		r.setBaseSpeed(speed);
		r.setLong(l);
		r.setHeight(h);
	}
	
	public RoleColiseo getRole() {
		return this.r;
	}
}
