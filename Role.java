package com.iteso.motor;

/**
 * Clase Role de la aplicación
 * @author José Pablo Vázquez Partida, Octavio Valdez Fonseca, José Eduardo Pérez Valenzuela
 * @version 1.0
 */
public class Role implements Hitbox{
	private int powR = 0, powL = 0, hp, x, y, speed, topDefense = 0, midDefense = 0, totalWeight = 0, baseSpeed;
	private Equipment e;
	public final double GRAVITY = 9.81;
	private int l = 1, h = 1;
	
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
	 * @param l Longitud del objeto del objeto del personaje
	 * @param h Altura del objeto del objeto del personaje 
	 */
	public Role(int hp, int x, int y, int baseSpeed, Equipment e, int l, int h) {	
		this.setHp(hp);
		this.setX(x);
		this.setY(y);
		this.setBaseSpeed(baseSpeed);
		this.setE(e);
		this.setLong(l);
		this.setHeight(h);
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
	private void setPowR(int powR) throws NegativeNumberFound {
		if(powR < 0)
			throw new NegativeNumberFound(powR);
		
		this.powR = powR;
	}
	
	/**
	 * Establece el poder del arma derecha del objeto del personaje
	 * @param powR Poder del arma derecha que se le asignara al objeto del personaje
	 */
	public int getPowL() {
		return this.powL;
	}
	
	/**
	 * Establece el poder del arma izquierda del objeto del personaje
	 * @param powL Poder del arma izquierda que se le asignara al objeto del personaje
	 */
	private void setPowL(int powL) throws NegativeNumberFound {
		if(powL < 0)
			throw new NegativeNumberFound(powL);
		
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
	public void setHp(int hp) throws NegativeNumberFound {
		if(hp < 0)
			throw new NegativeNumberFound(hp);
		
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
		int temp = this.getBaseSpeed() - this.getTotalWeight();
		
		if(temp < 0)
			temp = 0;
		
		this.speed = temp;
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
		if(topDefense < 0)
			topDefense = 0;
		
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
		if(midDefense < 0)
			midDefense = 0;
		
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
	public void setBaseSpeed(int baseSpeed) throws NegativeNumberFound {
		if(baseSpeed < 0)
			throw new NegativeNumberFound(baseSpeed);
		
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
	public void move(int toSum, Direction direction) throws NegativeNumberFound {
		if(toSum < 0)
			throw new NegativeNumberFound(toSum);
		
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
	
	/**
	 * Método para regresar si el arma le dio al objeto del personaje
	 * @param weapon Arma a utilizar para calcular si efectuo un tiro y asignarlo al objeto del personaje
	 * @return Regresa que el arma le dio al objeto del personaje
	 * @return Regresa que el arma no le dio al objeto del personaje
	 */
	public boolean hit(Weapon weapon) {
		double minXRole = this.getX() - this.l / 2.0;
		double maxXRole = this.getX() + this.l / 2.0;
		double minYRole = this.getY() - this.h / 2.0;
		double maxYRole = this.getY() + this.h / 2.0;
		double minXWeapon = weapon.getX() - weapon.getLong() / 2.0;
		double maxXWeapon = weapon.getX() + weapon.getLong() / 2.0;
		double minYWeapon = weapon.getY() - weapon.getHeight() / 2.0;
		double maxYWeapon = weapon.getY() + weapon.getHeight() / 2.0;
		
		if(((minXWeapon >= minXRole && minXWeapon <= maxXRole) || (maxXWeapon >= minXRole && maxXWeapon <= maxXRole)) && 
		   ((minYWeapon >= minYRole && minYWeapon <= maxYRole) || (maxYWeapon >= minYRole && maxYWeapon <= maxYRole)))
			return true;
		
		return false;
	}
	/**
	 * Método para calcular el tiro parabolico segun la direccion que se le de y regresar hit
	 * @param angle Valor a utilizar para calcular el angulo del tiro parabolico
	 * @param v0 Valor a utilizar para calcular la velocidad del tiro parabolico
	 * @param w Arma a utilizar para calcular la direccion del angulo del tiro parabolico
	 * @param r Personaje a utilizar para calcular si le dieron
	 * @param direction Direccion a utilizar para calcular la posicion del arma
	 * @return Regresa metodo hit
	 */
	public boolean shot(double angle, int v0, Weapon w, Role r, Direction direction) throws NegativeNumberFound {
		if(angle < 0)
			throw new NegativeNumberFound(angle);
		if(v0 < 0)
			throw new NegativeNumberFound(v0);
		
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
			if(r.hit(w))
				hit = true;
		}
			
		return hit;
		
	}
	/**
	 * Establece la longitud del objeto del personaje
	 * @param l longitud que se le asignara al objeto del personaje
	 */
	@Override
	public void setLong(int l) throws NegativeNumberFound {
		if(l < 0)
			throw new NegativeNumberFound(l);
		
		this.l = l;
	}
	/**
	 * Método para regresar la longitud del objeto del personaje
	 * @return Regresa la longitud del objeto del personaje
	 */
	@Override
	public int getLong() {
		return this.l;
	}
	/**
	 * Establece la altura del objeto del personaje
	 * @param h Altura que se le asignara al objeto del pesonaje
	 */
	@Override
	public void setHeight(int h) throws NegativeNumberFound {
		if(h < 0)
			throw new NegativeNumberFound(h);
		
		this.h = h;
	}
	/**
	 * Método para regresar la altura del objeto del arma
	 * @return Regresa la altura del objeto del arma
	 */
	@Override
	public int getHeight() {
		return h;
	}
	
	/** 
	 * Método para regresar cadena de texto de los atributos del objeto del personaje
	 * @return Regresa cadena de texto de los atributos del objeto del personaje
	 */
	@Override
	public String toString() {
		return String.format("Left Pow: %d\tRight Pow: %d\nHP: %d\tPosition: (%d, %d)\tBaseSpeed:%d \tSpeed: %d\nWeight: %d\tTop defense: %d\t    Mid defense: %d\nEquipment: \n%s\nLong: %d \tHeight: %d", 
				             this.getPowL(), this.getPowR(), this.getHp(), this.getX(), this.getY(), this.getBaseSpeed(),
				             this.getSpeed(), this.getTotalWeight(), 
				             this.getTopDefense(), this.getMidDefense(), this.getE(), this.getLong(), this.getHeight());
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
			   this.getBaseSpeed() == r.getBaseSpeed() && this.getE().equals(r.getE()) &&
			   this.getLong() == r.getLong() && this.getHeight() == r.getHeight();
	}
	
	/** 
	 * Método para regresar nuevo objeto del personaje con atributos
	 * @return Regresa nuevo objeto del personaje con atributos
	 */
	@Override
	public Role clone() {
		return new Role(this.getHp(), this.getX(), this.getY(), this.getBaseSpeed(), this.getE(), this.getLong(), this.getHeight());
	}

}
