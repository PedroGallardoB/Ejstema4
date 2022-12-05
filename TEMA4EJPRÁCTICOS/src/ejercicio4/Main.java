package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int eleccion;
		Operaciones op = new Operaciones();
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		op.num1 = sc.nextDouble();
		System.out.print("Introduzca otro número: ");
		op.num2 = sc.nextDouble();

		System.out.println("Introduzca 1 para sumar");
		System.out.println("Introduzca 2 para restar");
		System.out.println("Introduzca 3 para multiplicar");
		System.out.println("Introduzca 4 para dividir");
		eleccion = sc.nextInt();

		if (eleccion == 1) {
			System.out.println(op.suma());
		} else if (eleccion == 2) {
			System.out.println(op.resta());
		} else if (eleccion == 3) {
			System.out.println(op.multiplicacion());
		} else if (eleccion == 4) {
			System.out.println(op.division());
		} else {
			System.out.println("Los carácteres introducidos no eran una opción.");
		}

		sc.close();

	}
}
