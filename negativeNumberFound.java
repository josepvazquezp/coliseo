package EXE;

public class negativeNumberFound extends Exception {
	private double NegativeNumberFound;
	
	public negativeNumberFound(double n) {
		super("NegativeNumberFoundEsxception");
		this.NegativeNumberFound = n;
	}
	
	public String toString() {
		return getMessage() + "\nNegative number found: "+ this.NegativeNumberFound;
	}
}
