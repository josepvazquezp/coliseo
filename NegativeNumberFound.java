package com.iteso.motor;
/**
 * Clase NegativeNumberFound de la aplicación
 * @author José Pablo Vázquez Partida, Octavio Valdez Fonseca, José Eduardo Pérez Valenzuela
 * @version 1.0
 */
public class NegativeNumberFound extends RuntimeException {
	private double NegativeNumberFound;
	/** 
	 * Método que establece el numero regativo encontrado
	 * @param n Numero negativo encontrado del objeto de numero negativo
	 */
	public NegativeNumberFound(double n) {
		super("NegativeNumberFoundEsxception");
		this.NegativeNumberFound = n;
	}
	/** 
	 * Método para regresar cadena de texto del numero negativo encontrado
	 * @return Regresa cadena de texto del numero negativo encontrado
	 */
	public String toString() {
		return getMessage() + "\nNegative number found: "+ this.NegativeNumberFound;
	}
}
