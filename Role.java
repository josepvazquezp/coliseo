package com.iteso.motor;
/**
 * Clase Role de la aplicación
 * @author José Pablo Vázquez Partida, Octavio Valdez Fonseca, José Eduardo Pérez Valenzuela
 * @version 1.0
 */
public class Role {
	private int powR = 0, powL = 0, hp, x, y, speed, topDefense = 0, midDefense = 0, totalWeight = 0, baseSpeed;
	private Equipment e;
	public final double GRAVITY = 9.81;
	/** 
	 * Método constructor por defecto
	 */
	public Role() {
		
	}
	/**
	 * Método constructor parametrizado
	 * @param hp Hit points del objeto del personaje
	 * @param x Posicion x del objeto del personaje
	 * @param y Posicion y del objeto del personaje
	 * @param baseSpeed Velocidad default del objeto del personaje 
	 * @param e Objeto tipo equipment del objeto del personaje
	 */
	public Role(int hp, int x, int y, int baseSpeed, Equipment e) {
		this.setHp(hp);
		this.setX(x);
		this.setY(y);
		this.setBaseSpeed(baseSpeed);
		this.setE(e);
	}
	/**
	 * Método para regresar el poder del arma derecha del objeto del personaje
	 *@return Regresa el poder del arma derecha del objeto del personaje
	 */
	public int getPowR() {
		return this.powR;
	}
	/**
	 * Establece el poder del arma derecha del objeto del personaje
	 * @param powR Poder del arma derecha que se le asignara al objeto del personaje
	 */
	private void setPowR(int powR) {
		this.powR = powR;
	}
	/**
	 * Método para regresar el poder del arma izquierda del objeto del personaje
	 *@return Regresa el poder del arma izquierda del objeto del personaje
	 */
	public int getPowL() {
		return this.powL;
	}
	/**
	 * Establece el poder del arma izquierda del objeto del personaje
	 * @param powR Poder del arma izquierda que se le asignara al objeto del personaje
	 */
	private void setPowL(int powL) {
		this.powL = powL;
	}
	/**
	 * Método para regresar los Hit Points del objeto del personaje
	 *@return Regresa los Hit Points del objeto del personaje
	 */
	public int getHp() {
		return this.hp;
	}
	/**
	 * Establece los Hit Points del objeto del personaje
	 * @param hp Hit Points que se le asignara al objeto del personaje
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	/**
	 * Método para regresar la Posicion x del objeto del personaje
	 *@return Regresa la Posicion x del objeto del personaje
	 */
	public int getX() {
		return this.x;
	}
	/**
	 * Establece la Posicion x del objeto del personaje
	 * @param x Posicion x que se le asignara al objeto del personaje
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * Método para regresar la Posicion y del objeto del personaje
	 *@return Regresa la Posicion y del objeto del personaje
	 */
	public int getY() {
		return this.y;
	}
	/**
	 * Establece la Posicion y del objeto del personaje
	 * @param x Posicion y que se le asignara al objeto del personaje
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * Método para regresar la Velocidad del objeto del personaje
	 *@return Regresa la Velocidad del objeto del personaje
	 */
	private int getSpeed() {
		return this.speed;
	}
	/**
	 * Establece la Velocidad del objeto del personaje
	 */
	private void setSpeed() {
		this.speed = this.getBaseSpeed() - this.getTotalWeight();
	}
	/**
	 * Método para regresar la Defensa superior del objeto del personaje
	 *@return Regresa la Defensa superior del objeto del personaje
	 */
	public int getTopDefense() {
		return this.topDefense;
	}
	/**
	 * Establece la Defensa superior del objeto del personaje
	 * @param topDefense Defensa superior que se le asignara al objeto del personaje
	 */
	private void setTopDefense(int topDefense) {
		this.topDefense = topDefense;
	}
	/**
	 * Método para regresar la Defensa del torso del objeto del personaje
	 *@return Regresa la Defensa del torso del objeto del personaje
	 */
	public int getMidDefense() {
		return this.midDefense;
	}
	/**
	 * Establece la Defensa del torso del objeto del personaje
	 * @param midDefense Defensa del torso que se le asignara al objeto del personaje
	 */
	private void setMidDefense(int midDefense) {
		this.midDefense = midDefense;
	}
	/**
	 * Método para regresar el Equipo del objeto del personaje
	 *@return Regresa el Equipo del objeto del personaje
	 */
	public Equipment getE() {
		return this.e;
	}
	/**
	 * Establece el Equipo del objeto del personaje
	 * @param equipment Equipo que se le asignara al objeto del personaje
	 */
	public void setE(Equipment equipment) {
		this.e = equipment;				
		this.setTotalWeight_Pows_Defenses(equipment);
	}
	/**
	 * Método para regresar el Peso total del objeto del personaje
	 *@return Regresa el Peso total del objeto del personaje
	 */
	public int getTotalWeight() {
		return this.totalWeight;
	}
	/**
	 * Método para regresar la Velocidad default del objeto del personaje
	 *@return Regresa la Velocidad default del objeto del personaje
	 */
	public int getBaseSpeed() {
		return this.baseSpeed;
	}
	/**
	 * Establece la Velocidad default del objeto del personaje
	 * @param baseSpeed Velocidad default que se le asignara al objeto del personaje
	 */
	public void setBaseSpeed(int baseSpeed) {
		this.baseSpeed = baseSpeed;
	}
	/**
	 * Establece el Peso total, el poder derecha, izquierda y las defensas del objeto del personaje
	 * @param equipment Peso total, el poder derecha, izquierda y las defensas que se le asignaran al objeto del personaje
	 */
	private void setTotalWeight_Pows_Defenses(Equipment equipment) {
		this.totalWeight = 0;
		
		if(equipment.getWeaponL() != null) {
			this.totalWeight += equipment.getWeaponL().getWeight();
			this.setPowL(equipment.getWeaponL().getPow());
		}
		
		if(equipment.getWeaponR() != null) {
			this.totalWeight += equipment.getWeaponR().getWeight();
			this.setPowR(equipment.getWeaponR().getPow());
		}
		
		if(equipment.getArmorH() != null) {
			this.totalWeight += equipment.getArmorH().getWeight();
			this.setTopDefense(equipment.getArmorH().getDefense());
		}
		
		if(equipment.getArmorB() != null) {
			this.totalWeight += equipment.getArmorB().getWeight();
			this.setMidDefense(equipment.getArmorB().getDefense());
		}
		
		if(equipment.getArmorS() != null) {
			this.totalWeight += equipment.getArmorS().getWeight();
			this.setMidDefense(this.midDefense + equipment.getArmorS().getDefense());
		}
		
		this.setSpeed();
	}
	/**
	 * Actualiza los Hit points, la posicion x, la posicion y y el equipo del objeto del personaje
	 * @param hp Hit Points que se le asignara al objeto del personaje
	 * @param x Posicion x que se le asignara al objeto del personaje
	 * @param y Posicion y que se le asignara al objeto del personaje
	 * @param equipment Peso total, el poder derecha, izquierda y las defensas que se le asignaran al objeto del personaje
	 */
	public void updateAtributes(int hp, int x, int y, Equipment equipment) {
		this.setHp(hp);
		this.setX(x);
		this.setY(y);
		this.setTotalWeight_Pows_Defenses(equipment);
	}
	/**
	 * Establece la direccion de movilidad del objeto del personaje y si esta dentro del rango
	 * @param toSum Valor a incrementar segun su direccion que se le asignara al objeto del personaje
	 * @param direction Direccion de movilidad que se le asignara al objeto del personaje
	 * @param y Posicion y que se le asignara al objeto del personaje
	 * @param equipment Peso total, el poder derecha, izquierda y las defensas que se le asignaran al objeto del personaje
	 */
	public void move(int toSum, Direction direction) {
		if(direction == Direction.UP)
			this.y -= toSum;
		else if(direction == Direction.DOWN)
			this.y += toSum;
		else if(direction == Direction.RIGHT)
			this.x += toSum;
		else if(direction == Direction.LEFT)
			this.x -= toSum;
		
		if(this.getX() < 0 | this.getY() < 0) {
			System.out.println("Role out of bounds");
		}
	}
	
	public boolean hit(int long1, int height1, Weapon weapon, int long2, int height2) {
		double minXRole = this.getX() - long1 / 2.0;
		double maxXRole = this.getX() + long1 / 2.0;
		double minYRole = this.getY() - height1 / 2.0;
		double maxYRole = this.getY() + height1 / 2.0;
		double minXWeapon = weapon.getX() - long2 / 2.0;
		double maxXWeapon = weapon.getX() + long2 / 2.0;
		double minYWeapon = weapon.getY() - height2 / 2.0;
		double maxYWeapon = weapon.getY() + height2 / 2.0;
		
		if(((minXWeapon >= minXRole && minXWeapon <= maxXRole) || (maxXWeapon >= minXRole && maxXWeapon <= maxXRole)) && 
		   ((minYWeapon >= minYRole && minYWeapon <= maxYRole) || (maxYWeapon >= minYRole && maxYWeapon <= maxYRole)))
			return true;
		
		return false;
	}
	
	public boolean shot(double angle, int v0, Weapon w, Role r, int longR, int heightR, int longW, int heightW, Direction direction) {
		angle *= Math.PI / 180;
		int x = 0, baseX = w.getX(), baseY = w.getY();
		double y = 1;
		double maxX = v0 * v0 * Math.sin(2 * angle) / GRAVITY;
		System.out.println(maxX);
		boolean hit = false;
		
		while(y >= 0 && hit == false) {
			x += maxX / 100;
			y = Math.tan(angle) * x - (GRAVITY * x * x) / (2 * v0 * v0 * Math.pow(Math.cos(angle), 2));
			System.out.printf("%d, %f\n", x, y);
			if(y > 0) {
				if(direction == Direction.RIGHT) {
					w.setX((int) (baseX + x));
					w.setY((int) (baseY - y));
				}
				else if(direction == Direction.LEFT) {
					w.setX((int) (baseX - x));
					w.setY((int) (baseY - y));
				}
			}
			else
				break;
			System.out.printf("%d, %d\n", w.getX(), w.getY());
			if(r.hit(longR, heightR, w, longW, heightW))
				hit = true;
		}
			
		return hit;
		
	}
	** 
	 * Método para regresar cadena de texto de los atributos del objeto del personaje
	 * @return Regresa cadena de texto de los atributos del objeto del personaje
	 */
	@Override
	public String toString() {
		return String.format("Left Pow: %d\tRight Pow: %d\nHP: %d\tPosition: (%d, %d)\tBaseSpeed:%d \tSpeed: %d\nWeight: %d\tTop defense: %d\t    Mid defense: %d\nEquipment: \n%s", 
				             this.getPowL(), this.getPowR(), this.getHp(), this.getX(), this.getY(), this.getBaseSpeed(),
				             this.getSpeed(), this.getTotalWeight(), 
				             this.getTopDefense(), this.getMidDefense(), this.getE());
	}
	/** 
	 * Método para regresar si los objetos son iguales e igualarlos
	 * @return Regresa si pertenece a la clase
	 * @return Regresa si hay igualdad entre el Personaje y el objeto ingresado
	 */
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Role))
			return false;
		
		Role r = (Role) o;
		return this.getHp() == r.getHp() && this.getX() == r.getX() && this.getY() == r.getY() && 
			   this.getBaseSpeed() == r.getBaseSpeed() && this.getE().equals(r.getE());
	}
	/** 
	 * Método para regresar nuevo objeto del personaje con atributos
	 * @return Regresa nuevo objeto del personaje con atributos
	 */
	public Role clone() {
		return new Role(this.getHp(), this.getX(), this.getY(), this.getBaseSpeed(), this.getE());
	}

}
