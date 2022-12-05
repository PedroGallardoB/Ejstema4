package ejercicio4;

import java.util.Scanner;
/**
 * Clase Main
 * @author Rexil
 *
 */

public class Main {

	public static void main(String[] args) {

		Operaciones op = new Operaciones();//Crea un objeto de la clase operaciones
		Scanner sc = new Scanner(System.in);//Nombra al escáner

		System.out.print("Introduzca un número: ");//Pide un número para operar 
		op.num1 = sc.nextDouble();//Guarda un número para operar en las distintas funciones en el objeto op de la clase Operaciones
		System.out.print("Introduzca otro número: ");//Pide un número para operar 
		op.num2 = sc.nextDouble();//Guarda un número para operar en las distintas funciones en el objeto op de la clase Operaciones

			System.out.println("Resultado;  " + op.suma());//Muestra el resultado de la suma
			System.out.println("Resultado;  " + op.resta());//Muestra el resultado de la resta
			System.out.println("Resultado;  " + op.multiplicacion());//Muestra el resultado de la multiplicación
			System.out.println("Resultado;  " + op.division());//Muestra el resultado de la división

		sc.close();//Cerramos el escáner

	}
}
