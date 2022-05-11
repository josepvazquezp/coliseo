package com.iteso.motor;

import java.util.TreeMap;
/**
 * Clase Armor de la aplicación
 * @author José Pablo Vázquez Partida, Octavio Valdez Fonseca, José Eduardo Pérez Valenzuela
 * @version 1.0
 */
public class Material {
	private String name;
	private int endurance;
	private static TreeMap<String, Integer> data;
	
	static {
		data = new TreeMap<String, Integer>();
	}
	/**
	 * Método constructor por defecto
	 */
	public Material() {
		
	}
	/** 
	 * Método constructor parametrizado
	 * @param name Nombre del objeto del material
	 * @param endurance Resistencia del objeto del material
	 */
	public Material(String name, int endurance) {
		this.setMaterial(name, endurance);
	}
	/**
	 * Establece el material del objeto o si ya existe
	 * @param name Nombre del material que se le asignara al objeto
	 * @param endurance Resistencia del material que se le asignara al objeto
	 */
	public void setMaterial(String name, int endurance) {
		if(Material.data.get(name) == null) {
			this.name = name;
			this.endurance = endurance;
			Material.data.put(name, endurance);
		}
		else {
			System.out.println("El material ya existe");
		}
	}
	/**
	 * Establece cambio de la resistencia del material del objeto
	 * @param name Nombre del material que se le asignara al objeto
	 * @param endurance Resistencia del material que se le asignara al objeto
	 */
	public void changeEndurance(String name, int endurance) {			
		if(Material.data.get(name) != null) {							
			Material.data.remove(name);
			Material.data.put(name, endurance);
			this.endurance = endurance;
		}
	}
	/**
	 * Método para regresar la informacion de material del objeto
	 * @return Regresa la informacion de material del objeto
	 */
	public TreeMap<String, Integer> getMaterials(){
		return Material.data;
	}
	/**
	 * Método para regresar el nombre de material del objeto
	 * @return Regresa el nombre de material del objeto
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Método para regresar la resitencia de material del objeto
	 * @return Regresa la resistencia de material del objeto
	 */
	public int getEndurance() {
		return this.endurance;
	}
	/** 
	 * Método para regresar cadena de texto de los atributos de material del objeto
	 * @return Regresa cadena de texto de los atributos de material del objeto
	 */
	@Override
	public String toString() {
		return String.format("Material: %s    Endurance: %d", this.getName(), this.getEndurance());
	}
	/** 
	 * Método para regresar si los objetos de material son iguales e igualarlos
	 * @return Regresa si los objetos de material son iguales
	 * @return Regresa igualdad de los objetos de material
	 */
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Material))
			return false;
		
		Material m = (Material) o;
		return this.getName().equals(m.getName()) && this.getEndurance() == m.getEndurance(); 
	}
	
}
