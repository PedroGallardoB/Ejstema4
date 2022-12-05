package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		Números obj = new Números();
		if (obj.esPrimo(num) == false) {
			System.out.print("No es primo ");
		} else {
			System.out.print("Es primo ");
		}
		if (obj.esCapicua(num) == false) {
			System.out.print("y no es capicúa");
		} else {
			System.out.print("y es capicúa");

		}
		sc.close();
	}
}
