package ejercicio4;

public class Operaciones {
	

	double num1;
	double num2;

	public double suma() {

		double sum = num1 + num2;
		return sum;

	}

	public double resta() {

		double res = num1 - num2;
		return res;

	}

	public double multiplicacion() {

		double mul = num1 * num2;
		return mul;

	}

	public double division() {
		double div=0;
		if (num2!=0) {
		 div = num1/num2;
		}
		return div;
	}

}