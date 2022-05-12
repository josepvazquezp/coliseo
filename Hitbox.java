package com.iteso.motor;

/**
 * Interfaz Hitbox de la aplicación
 * @author José Pablo Vázquez Partida, Octavio Valdez Fonseca, José Eduardo Pérez Valenzuela
 * @version 1.0
 */
public interface Hitbox {
	int l = 0;
	int h = 0;
	
	/**
	 * Establece la longitud
	 * @param l Longitud que se asigna
	 */
	void setLong(int l);
	
	/**
	 * Método para regresar un entero de la longitud donde se implementa la interfaz
	 */
	int getLong();
	
	/**
	 * Establece la altura
	 * @param h Altura que se asigna
	 */
	void setHeight(int h);
	
	/**
	 * Método para regresar un entero de la altura donde se implementa la interfaz
	 */
	int getHeight();
	
}
