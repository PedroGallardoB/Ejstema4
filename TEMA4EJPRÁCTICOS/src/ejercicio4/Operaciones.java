package ejercicio4;

public class Operaciones {

	double num1; //Variable que guarda número para operar
	double num2; //Variable que guarda número para operar

	public double suma() {//Función que suma

		double sum = num1 + num2;//Suma de las cifras
		return sum;//Devuelve el resultado de la suma

	}

	public double resta() {//Función que resta 

		double res = num1 - num2;//Resta de las cifras
		return res;//Devuelve el resultado de la resta

	}

	public double multiplicacion() {//Función que multiplica

		double mul = num1 * num2;//Multiplicación de las cifras
		return mul;//Devuelve el resultado de la multiplicación

	}

	public double division() {//Función que divide
		double div=0;//Valor que dará si no cumple la condición la división
		if (num2!=0) {//En caso de que sea distinto de cero...
		 div = num1/num2;//...Hará la división
		}
		return div;//Devuelve el resultado de la división
	}

}