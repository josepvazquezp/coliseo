package com.iteso.motor;

/**
 * Clase Weapon de la aplicación
 * @author José Pablo Vázquez Partida, Octavio Valdez Fonseca, José Eduardo Pérez Valenzuela
 * @version 1.0
 */
public class Weapon extends EnduranceObject implements Hitbox {
	private int pow, weight, x, y, capacity, distance, endurance;
	private boolean flyable;
	private Material type;
	private String name;
	private int l = 1, h = 1;
	
	/**
	 * Método constructor por defecto
	 */
	public Weapon() {
		
	}
	
	/** 
	 * Método constructor parametrizado
	 * @param pow Poder del objeto del arma
	 * @param weight Peso del objeto del arma
	 * @param x Posicion x del objeto del arma
	 * @param y Posicion y del objeto del arma
	 * @param capacity Capacidad del objeto del arma
	 * @param distance Distancia del objeto del arma
	 * @param endurance Resistencia del objeto del arma
	 * @param flyable Volabilidad del objeto del arma
	 * @param name Nombre del objeto del arma
	 * @param type Tipo de material del objeto del arma
	 * @param l Longitud del objeto del arma
	 * @param h Altura del objeto del arma
	 */
	public Weapon(int pow, int weight, int x, int y, int capacity, int distance, int endurance, boolean flyable, String name, Material type, int l, int h) {
		this.setPow(pow);
		this.setWeight(weight);
		this.setX(x);
		this.setY(y);
		this.setCapacity(capacity);
		this.setDistance(distance);
		this.setEndurance(endurance);
		this.setFlyable(flyable);
		this.setType(type);
		this.setName(name);
		this.setLong(l);
		this.setHeight(h);
	}
	
	/**
	 * Método para disminuir la resistencia del objeto del arma
	 */
	public void decrease() {
		int temp = this.getEndurance() - this.type.getEndurance();
		
		if(temp < 0)
			temp = 0;
		
		this.setEndurance(temp);
	}
	
	/**
	 * Método para regresar el poder del objeto del arma
	 * @return Regresa el poder del objeto del arma
	 */
	public int getPow() {
		return this.pow;
	}
	
	/**
	 * Establece el poder del objeto del arma
	 * @param pow Poder que se le asignara al objeto del arma
	 */
	public void setPow(int pow) throws NegativeNumberFound {
		if(pow < 0)
			throw new NegativeNumberFound(pow);
		
		this.pow = pow;
	}
	
	/**
	 * Método para regresar el peso del objeto del arma
	 * @return Regresa el peso del objeto del arma
	 */
	public int getWeight() {
		return this.weight;
	}
	
	/** Establece el peso del objeto del arma
	 * @param weight Peso que se le asignara al objeto del arma
	 */
	public void setWeight(int weight) throws NegativeNumberFound {
		if(weight < 0)
			throw new NegativeNumberFound(weight);
		
		this.weight = weight;
	}
	
	/** 
	 * Método para regresar la posicion x del objeto del arma
	 * @return Regresa la posicion x del objeto del arma
	 */
	public int getX() {
		return this.x;
	}
	
	/** 
	 * Establece la posicion x del objeto del arma
	 * @param x Posicion x que se le asignara al objeto del arma
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/** 
	 * Método para regresar la posicion y del objeto del arma
	 * @return Regresa la posicion y del objeto del arma
	 */
	public int getY() {
		return this.y;
	}
	
	/** 
	 * Establece la posicion y del objeto del arma
	 * @param y Posicion y que se le asignara al objeto del arma
	 */
	public void setY(int y) {		
		this.y = y;
	}
	
	/**
	 * Método para regresar la capacidad del objeto del arma
	 * @return Regresa la capacidad del objeto del arma
	 */
	public int getCapacity() {
		return this.capacity;
	}
	
	/** 
	 * Establece la capacidad del objeto del arma
	 * @param capacity Capacidad que se le asignara al objeto del arma
	 */
	public void setCapacity(int capacity) throws NegativeNumberFound {
		if(capacity < 0)
			throw new NegativeNumberFound(capacity);
		
		this.capacity = capacity;
	}
	
	/**
	 * Método para regresar la distancia del objeto del arma
	 * @return Regresa la distancia del objeto del arma
	 */
	public int getDistance() {
		return this.distance;
	}
	
	/** 
	 * Establece la distancia del objeto del arma
	 * @param distance Distancia que se le asignara al objeto del arma
	 */
	public void setDistance(int distance) throws NegativeNumberFound {
		if(distance < 0)
			throw new NegativeNumberFound(distance);
		
		this.distance = distance;
	}
	
	/** 
	 * Método para regresar la volatilidad del objeto del arma
	 * @return Regresa la volatilidad del objeto del arma
	 */
	public boolean isFlyable() {
		return this.flyable;
	}
	
	/** 
	 * Establece la volatilidad del objeto del arma
	 * @param flyable Volatilidad que se le asignara al objeto del arma
	 */
	public void setFlyable(boolean flyable) {
		this.flyable = flyable;
	}
	
	/**
	 * Método para regresar el tipo de material del objeto del arma
	 * @return Regresa el tipo de material del objeto del arma
	 */
	public Material getType() {
		return this.type;
	}
	
	/** 
	 * Establece el tipo de material del objeto del arma
	 * @param type Tipo de material que se le asignara al objeto del arma
	 */
	public void setType(Material type) {
		this.type = type;
	}
	
	/**
	 * Método para regresar la resistencia del objeto del arma
	 * @return Regresa la resistencia del objeto del arma
	 */
	public int getEndurance() {
		return this.endurance;
	}
	
	/** 
	 * Establece la resistencia del objeto del arma
	 * @param endurance Resistencia que se le asignara al objeto del arma
	 */
	public void setEndurance(int endurance) throws NegativeNumberFound {
		if(endurance < 0)
			throw new NegativeNumberFound(endurance);
		
		this.endurance = endurance;
	}
	
	/** 
	 * Método para regresar el nombre del objeto del arma
	 * @return Regresa el nombre del objeto del arma
	 */
	public String getName() {
		return this.name;
	}
	
	/** 
	 * Establece el nombre del objeto del arma
	 * @param name Nombre que se le asignara al objeto del arma
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Establece la longitud del objeto del arma
	 * @param l longitud que se le asignara al objeto del arma
	 */
	@Override
	public void setLong(int l) throws NegativeNumberFound {
		if(l < 0)
			throw new NegativeNumberFound(l);
		
		this.l = l;
	}

	/**
	 * Método para regresar la longitud del objeto del arma
	 * @return Regresa la longitud del objeto del arma
	 */
	@Override
	public int getLong() {
		return this.l;
	}

	/**
	 * Establece la altura del objeto del arma
	 * @param h Altura que se le asignara al objeto de la armadura
	 */
	@Override
	public void setHeight(int h) throws NegativeNumberFound {
		if(h < 0)
			throw new NegativeNumberFound(h);
		
		this.h = h;
	}

	/**
	 * Método para regresar la altura del objeto de la armadura
	 * @return Regresa la altura del objeto de la armadura
	 */
	@Override
	public int getHeight() {
		return this.h;
	}
	
	/** 
	 * Método para regresar cadena de texto de los atributos del objeto del arma
	 * @return Regresa cadena de texto de los atributos del objeto del arma
	 */
	@Override
	public String toString() {
		return String.format("Weapon: %s \tType: [%s]\tFlyable: %b\nPow: %d \tWeight: %d \tDistance: %d\nEndurance: %d \tCapacity: %d\nLong: %d \tHeight: %d", 
				             this.getName(), this.getType().toString(), this.isFlyable(), this.getPow(), this.getWeight(),
				             this.getDistance(), this.getEndurance(), this.getCapacity(), this.getLong(), this.getHeight());
	}
	
	/** 
	 * Método para regresar si los objetos son iguales e igualarlos
	 * @return Regresa si pertenece a la clase
	 * @return Regresa si hay igualdad entre el arma y el objeto ingresado
	 */
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Weapon))
			return false;
		
		Weapon w = (Weapon) o;
		return this.getPow() == w.getPow() && this.getWeight() == w.getWeight() && 
			   this.getDistance() == w.getDistance() && this.getEndurance() == w.getEndurance() &&
			   this.getCapacity() == w.getCapacity() && this.isFlyable() == w.isFlyable() &&
			   this.getName().equals(w.getName()) && this.getType().equals(w.getType()) &&
			   this.getLong() == w.getLong() && this.getHeight() == w.getHeight();
	}
	
	/** 
	 * Método para regresar nuevo objeto del arma con atributos
	 * @return Regresa nuevo objeto del arma con atributos
	 */
	@Override
	public Weapon clone() {
		return new Weapon(this.getPow(), this.getWeight(), this.getX(), this.getY(), this.getCapacity(), 
				          this.getDistance(), this.getEndurance(), this.isFlyable(), this.getName(), this.getType(),
				          this.getLong(), this.getHeight());
	}
	
}