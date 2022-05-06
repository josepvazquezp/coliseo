package proyecto;

import com.iteso.motor.Role;

public enum Roles {
	ASSESSIN(100, 1000),
	STANDAR(200, 500),
	TANK(300, 300);
	
	private Role r;
	
	private Roles(int hp, int speed) {
		this.r.setHp(hp);
		this.r.setBaseSpeed(speed);
	}
	
	public Role getRole() {
		return this.r;
	}
}
