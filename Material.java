package com.iteso.motor;

import java.util.TreeMap;

public class Material {
	private String name;
	private int endurance;
	private static TreeMap<String, Integer> data;
	
	static {
		data = new TreeMap<String, Integer>();
	}
	
	public Material() {
		
	}
	
	public Material(String name, int endurance) {
		this.setMaterial(name, endurance);
	}
	
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
	
	public void changeEndurance(String name, int endurance) {			
		if(Material.data.get(name) != null) {							
			Material.data.remove(name);
			Material.data.put(name, endurance);
			this.endurance = endurance;
		}
	}
	
	public TreeMap<String, Integer> getMaterials(){
		return Material.data;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getEndurance() {
		return this.endurance;
	}
	
	@Override
	public String toString() {
		return String.format("Material: %s    Endurance: %d", this.getName(), this.getEndurance());
	}
}
