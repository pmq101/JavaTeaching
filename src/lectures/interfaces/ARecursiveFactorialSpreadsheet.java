package lectures.interfaces;

import lectures.class_dual_roles.Factorials;


public class ARecursiveFactorialSpreadsheet implements FactorialSpreadsheet {
	int number;
	long factorial;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newValue) {
		number = newValue;
		factorial = Factorials.recursingFactorial(number);
	}
	public long getFactorial() {
		return factorial;
	}	
}
