package com.iteso.motor;

import java.util.TreeMap;

public class Material {
	private String name;
	private int endurance;
	private static TreeMap<String, Integer> data;
	
	static {
		data = new TreeMap<String, Integer>();
	}
	
	public void setMaterial(String name, int endurance) {
		int temp = Material.data.size();
		Material.data.put(name, endurance);
		
		if(temp < Material.data.size()) {
			this.name = name;
			this.endurance = endurance;
		}
		else
			System.out.println("El material ya existe");
	}
	
	public void changeEndurance(String name, int endurance) {
		if(Material.data.get(name) != null) {
			Material.data.remove(name);
			Material.data.put(name, endurance);
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
}
