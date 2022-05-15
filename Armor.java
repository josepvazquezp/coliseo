package com.iteso.motor;

/**
 * Clase Armor de la aplicación
 * @author José Pablo Vázquez Partida, Octavio Valdez Fonseca, José Eduardo Pérez Valenzuela
 * @version 1.0
 */
public class Armor extends EnduranceObject implements Hitbox{
	private int defense = 0, weight;
	private boolean helmet = false;
	private String name;
	private Material type;
	private int l = 1, h = 1;
	
	/**
	 * Método constructor por defecto
	 */
	public Armor() {
		
	}
	
	/** Método constructor parametrizado
	 * @param defense Defensa del objeto de la armadura
	 * @param weight Peso del objeto de la armadura
	 * @param helmet Casco del objeto de la armadura
	 * @param name Nombre del objeto de la armadura
	 * @param type Tipo de material del objeto de la armadura
	 * @param l Longitud del objeto de la armadura
	 * @param h Altura del objeto de la armadura
	 */
	public Armor(int defense, int weight, boolean helmet, String name, Material type, int l, int h) {
		this.setDefense(defense);
		this.setWeight(weight);
		this.setHelmet(helmet);
		this.setName(name);
		this.setType(type);
		this.setLong(l);
		this.setHeight(h);
	}
	
	/**
	 * Método para disminuir la defensa
	 */
	public void decrease() {
		int temp = this.getDefense() - this.type.getEndurance();
		
		if(temp < 0)
			temp = 0;
		
		this.setDefense(temp);
	}

	/**
	 * Método para regresar la defensa del objeto
	 * @return Regresa la defensa del objeto
	 */
	public int getDefense() {
		return this.defense;
	}
	
	/**
	 * Establece la defensa del objeto
	 * @param defense Defensa que se le asignara al objeto
	 */
	public void setDefense(int defense) throws NegativeNumberFound {
		if(defense < 0)
			throw new NegativeNumberFound(defense);
		
		this.defense = defense;
	}
	
	/**
	 * Método para regresar el peso del objeto
	 * @return Regresa el peso del objeto
	 */
	public int getWeight() {
		return this.weight;
	}

	/** Establece el peso del bojeto
	 * @param weight Peso que se le asignara al objeto
	 */
	public void setWeight(int weight) throws NegativeNumberFound {
		if(weight < 0)
			throw new NegativeNumberFound(weight);
		
		this.weight = weight;
	}

	/** Método para regresar el casco del objeto
	 * @return Regresa el casco del objeto
	 */
	public boolean isHelmet() {
		return this.helmet;
	}

	/** Establece el casco del objeto
	 * @param helmet Casco que se le asignara al objeto
	 */
	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}

	/** Método para regresar el nombre del objeto
	 * @return Regresa el nombre del objeto
	 */
	public String getName() {
		return this.name;
	}

	/** Establece el nombre del objeto
	 * @param name Nombre que se le asignara al objeto
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** Método para regresar el tipo de material del objeto
	 * @return Regresa el tipo de material del bojeto
	 */
	public Material getType() {
		return this.type;
	}

	/** Establece el tipo de material del objeto
	 * @param type Tipo de material que se le asignara al objeto
	 */
	public void setType(Material type) {
		this.type = type;
	}
	
	/**
	 * Establece la longitud del objeto de la armadura
	 * @param l longitud que se le asignara al objeto de la armadura
	 */
	@Override
	public void setLong(int l) throws NegativeNumberFound {
		if(l < 0)
			throw new NegativeNumberFound(l);
		
		this.l = l;
	}
	
	/**
	 * Método para regresar la longitud del objeto de la armadura
	 * @return Regresa la longitud del objeto de la armadura
	 */
	@Override
	public int getLong() {
		return this.l;
	}

	/**
	 * Establece la altura del objeto de la armadura
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
	

	/** Método para regresar cadena de texto de los atributos del objeto
	 * @return Regresa cadena de texto de los atributos del objeto
	 */
	@Override
	public String toString() {
		return String.format("Armor: %s \tType: [%s]\nDefense: %d \tWeight: %d \tHelmet: %b\nLong: %d \tHeight: %d", 
				             this.getName(), this.getType().toString(), this.getDefense(), 
				             this.getWeight(), this.isHelmet(), this.getLong(), this.getHeight());
	}
	
	/** Método para regresar si los objetos son iguales e igualarlos
	 * @return Regresa si los objetos son iguales
	 * @return Regresa igualdad de los objetos
	 */
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Armor))
			return false;
		
		Armor a = (Armor) o;
		return this.getDefense() == a.getDefense() && this.getWeight() == a.getWeight() && 
			   this.isHelmet() == a.isHelmet() && this.getName().equals(a.getName()) && 
			   this.getType().equals(a.getType()) && this.getLong() == a.getLong() && 
			   this.getHeight() == a.getHeight();
	}
	
	/** Método para regresar nuevo objeto con atributos
	 * @return Regresa nuevo objeto con atributos
	 */
	@Override
	public Armor clone() {
		return new Armor(this.getDefense(), this.getWeight(), this.isHelmet(), this.getName(), this.getType(),
				         this.getLong(), this.getHeight());
	}
	
}
