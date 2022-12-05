package ejercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número para generar esa cantidad de aleatorios: ");
		num1 = sc.nextInt();
		NumerosAleatorios.numAleatorios(num1);

		System.out.print("Introduzca un número para generar esa cantidad de aleatorios: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca el valor máximo de los mismos: ");
		num2 = sc.nextInt();
		NumerosAleatorios.numAleatorios2(num1, num2);

		System.out.print("Introduzca un número para generar esa cantidad de aleatorios: ");
		num1 = sc.nextInt();
		System.out.print("Introduzca el valor máximo de los mismos: ");
		num2 = sc.nextInt();
		System.out.print("Introduzca el valor mínimo de los mismos: ");
		num3 = sc.nextInt();
		NumerosAleatorios.numAleatorios3(num1, num2, num3);


sc.close();

}

}
