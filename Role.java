package com.iteso.motor;

/**
 * Clase Role de la aplicación
 * @author José Pablo Vázquez Partida, Octavio Valdez Fonseca, José Eduardo Pérez Valenzuela
 * @version 1.0
 */
public class Role implements Hitbox{
	private int powR = 0, powL = 0, hp, x, y, speed, topDefense = 0, midDefense = 0, totalWeight = 0, baseSpeed;
	private Equipment e;
	public static final double GRAVITY = 9.81;
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
		if(equipment != null) {
			this.setTotalWeight_Pows_Defenses(equipment);
		}
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
		else
			this.setPowL(0);
		
		if(equipment.getWeaponR() != null) {
			this.totalWeight += equipment.getWeaponR().getWeight();
			this.setPowR(equipment.getWeaponR().getPow());
		}
		else
			this.setPowR(0);
		
		if(equipment.getArmorH() != null) {
			this.totalWeight += equipment.getArmorH().getWeight();
			this.setTopDefense(equipment.getArmorH().getDefense());
		}
		else
			this.setTopDefense(0);
		
		if(equipment.getArmorB() != null) {
			this.totalWeight += equipment.getArmorB().getWeight();
			this.setMidDefense(equipment.getArmorB().getDefense());
		}
		else if(equipment.getArmorS() == null)
			this.setMidDefense(0);
		else
			this.setMidDefense(equipment.getArmorS().getDefense());
		
		if(equipment.getArmorS() != null) {
			this.totalWeight += equipment.getArmorS().getWeight();
			this.setMidDefense(this.midDefense + equipment.getArmorS().getDefense());
		}
		else if(equipment.getArmorB() == null)
			this.setMidDefense(0);
		else
			this.setMidDefense(equipment.getArmorB().getDefense());
		
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
	 * @param toSumX Valor a incrementar en x segun su direccion que se le asignara al objeto del personaje
	 * @param toSumY Valor a incrementar en y segun su direccion que se le asignara al objeto del personaje
	 * @param direction Direccion de movilidad que se le asignara al objeto del personaje
	 * @param x Posicion x que se le asignara al objeto del personaje
	 * @param y Posicion y que se le asignara al objeto del personaje
	 */
	public void move(int toSumX, int toSumY, Direction direction) throws NegativeNumberFound {
		if(toSumX < 0)
			throw new NegativeNumberFound(toSumX);
		else if(toSumY < 0)
			throw new NegativeNumberFound(toSumY);
		
		if(direction == Direction.UP)
			this.setY(this.y -= toSumY);
		else if(direction == Direction.DOWN)
			this.setY(this.y += toSumY);
		else if(direction == Direction.RIGHT)
			this.setX(this.x += toSumX);
		else if(direction == Direction.LEFT)
			this.setX(this.x -= toSumX);
		else if(direction == Direction.UP_RIGHT) {
			this.setX(this.x += toSumX);
			this.setY(this.y -= toSumY);
		}
		else if(direction == Direction.UP_LEFT) {
			this.setX(this.x -= toSumX);
			this.setY(this.y -= toSumY);
		}
		else if(direction == Direction.DOWN_RIGHT) {
			this.setX(this.x += toSumX);
			this.setY(this.y += toSumY);
		}
		else if(direction == Direction.DOWN_LEFT) {
			this.setX(this.x -= toSumX);
			this.setY(this.y += toSumY);
		}
		
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
		double minXRole = this.getX() - this.getLong() / 2.0;
		double maxXRole = this.getX() + this.getLong() / 2.0;
		double minYRole = this.getY() - this.getHeight()/ 2.0;
		double maxYRole = this.getY() + this.getHeight() / 2.0;
		double minXWeapon = weapon.getX() - weapon.getLong() / 2.0;
		double maxXWeapon = weapon.getX() + weapon.getLong() / 2.0;
		double minYWeapon = weapon.getY() - weapon.getHeight() / 2.0;
		double maxYWeapon = weapon.getY() + weapon.getHeight() / 2.0;
		
		if(minXWeapon >= minXRole && minXWeapon <= maxXRole && minYWeapon >= minYRole && minYWeapon <= maxYRole ||
		   maxXWeapon >= minXRole && maxXWeapon <= maxXRole && minYWeapon >= minYRole && minYWeapon <= maxYRole ||
		   maxXWeapon >= minXRole && maxXWeapon <= maxXRole && maxYWeapon >= minYRole && maxYWeapon <= maxYRole ||
		   minXWeapon >= minXRole && minXWeapon <= maxXRole && maxYWeapon >= minYRole && maxYWeapon <= maxYRole ||
		   minXRole >= minXWeapon && maxXRole >= minXWeapon && minXRole <= maxXWeapon && maxXRole <= maxXWeapon && 
		   minYRole >= minYWeapon && minYRole <= maxYWeapon ||
		   maxXRole >= minXWeapon && maxXRole <= maxXWeapon && minYRole >= minYWeapon && maxYRole >= minYWeapon &&
		   minYRole <= maxYWeapon && maxYRole <= maxYWeapon ||
		   minXRole >= minXWeapon && maxXRole >= minXWeapon && minXRole <= maxXWeapon && maxXRole <= maxXWeapon &&
		   maxYRole >= minYWeapon && maxYRole < maxYWeapon ||
		   minXRole >= minXWeapon && minXRole <= maxXWeapon && minYRole >= minYWeapon && maxYRole >= minYWeapon &&
		   minYRole <= maxYWeapon && maxYRole <= maxYWeapon ||
		   minXRole >= minXWeapon && minXRole <= maxXWeapon && maxXRole >= minXWeapon && maxXRole <= maxYWeapon &&
		   minYRole >= minYWeapon && minYRole <= maxYWeapon && maxYRole >= minYWeapon && maxYRole <= maxYWeapon)
			return true;
		
		return false;
	}
	
	/**
	 * Método para calcular el tiro parabolico segun la direccion que se le de y regresar hit
	 * @param angle Valor a utilizar para calcular el angulo del tiro parabolico
	 * @param v0 Velocidad inicial a utilizar para calcular la longitud de la parabola con el respectivo angulo
	 * @param r Personaje a utilizar para calcular si le dieron
	 * @param wDir Direccion a utilizar para escoger cual arma se desea utilizar
	 * @param direction Direccion a utilizar para el lanzamiento del arma
	 * @return Regresa metodo hit
	 */
	public boolean shot(double angle, int v0, Role r, Direction wDir, Direction direction) throws NegativeNumberFound {
		if(angle < 0)
			throw new NegativeNumberFound(angle);
		if(v0 < 0)
			throw new NegativeNumberFound(v0);
		
		int baseX, baseY;
		
		if(wDir == Direction.LEFT && this.getE().getWeaponL() != null && this.getE().getWeaponL().isFlyable()) {
			baseX = this.getE().getWeaponL().getX(); 
			baseY = this.getE().getWeaponL().getY();
		}
		else if(wDir == Direction.RIGHT && this.getE().getWeaponR() != null && this.getE().getWeaponR().isFlyable()) {
			baseX = this.getE().getWeaponR().getX(); 
			baseY = this.getE().getWeaponR().getY();
		}
		else {
			System.out.println("Not object in your possession to throw");
			return false;
		}
		
		angle *= Math.PI / 180;
		int x = 0, tempX, tempY;
		double y = 1;
		double maxX = v0 * v0 * Math.sin(2 * angle) / GRAVITY;
		boolean hit = false;
		
		while(y >= 0 && hit == false) {
			x += Math.ceil(maxX / 100);
			y = Math.tan(angle) * x - (GRAVITY * x * x) / (2 * v0 * v0 * Math.pow(Math.cos(angle), 2));
			System.out.printf("%d, %f\n", x, y);
			if(y > 0) {
				if(direction == Direction.RIGHT) {
					if(wDir == Direction.RIGHT) {
						this.getE().getWeaponR().setX((int) (baseX + x));
						this.getE().getWeaponR().setY((int) (baseY - y));
					}
					else {
						this.getE().getWeaponL().setX((int) (baseX + x));
						this.getE().getWeaponL().setY((int) (baseY - y));
					}
				}
				else if(direction == Direction.LEFT) {
					if(wDir == Direction.LEFT) {
						this.getE().getWeaponL().setX((int) (baseX - x));
						this.getE().getWeaponL().setY((int) (baseY - y));
					}
					else {
						this.getE().getWeaponR().setX((int) (baseX - x));
						this.getE().getWeaponR().setY((int) (baseY - y));
					}
						
				}
			}
			else
				break;
			
			tempX = wDir == Direction.RIGHT? this.getE().getWeaponR().getX() : this.getE().getWeaponL().getX();
			tempY = wDir == Direction.RIGHT? this.getE().getWeaponR().getY() : this.getE().getWeaponL().getY();
			
			System.out.printf("%d, %d\n", tempX, tempY);
			if(r.hit(wDir == Direction.RIGHT? this.getE().getWeaponR() : this.getE().getWeaponL()))
				hit = true;
		}
	
		return hit;
		
	}
	
	@Override
	public void setLong(int l) throws NegativeNumberFound {
		if(l < 0)
			throw new NegativeNumberFound(l);
		
		this.l = l;
	}

	@Override
	public int getLong() {
		return this.l;
	}

	@Override
	public void setHeight(int h) throws NegativeNumberFound {
		if(h < 0)
			throw new NegativeNumberFound(h);
		
		this.h = h;
	}

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
		return String.format("Left Pow: %d\tRight Pow: %d\nHP: %d\tPosition: (%d, %d)\tBaseSpeed:%d \tSpeed: %d\nWeight: %d\tTop defense: %d\t    Mid defense: %d\nLong: %d \tHeight: %d\nEquipment: \n%s", 
				             this.getPowL(), this.getPowR(), this.getHp(), this.getX(), this.getY(), this.getBaseSpeed(),
				             this.getSpeed(), this.getTotalWeight(), 
				             this.getTopDefense(), this.getMidDefense(), this.getLong(), this.getHeight(), this.getE());
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
