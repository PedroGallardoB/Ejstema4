package ejercicio1;

import java.util.Scanner;
/**
 * Clase Main
 * @author Rexil
 *
 */
public class Main {

	public static void main(String[] args) {

		int num;//Guarda el número introducido
		Scanner sc = new Scanner(System.in);//Creamos el objeto escáner

		System.out.print("Introduzca un número: ");//Pedimos el número
		num = sc.nextInt();//Leemos el número
		Números obj = new Números();//Creamos un objeto números
		if (obj.esPrimo(num) == false) {//Si la función es primo es falsa
			System.out.print("No es primo ");//Imprimimos no es primo
		} else {//De lo contrario
			System.out.print("Es primo ");//Imprimimos es primo
		}
		if (obj.esCapicua(num) == false) {//Si la función es capicúa es falsa
			System.out.print("y no es capicúa");//Imprimimos no es capicúa
		} else {//De lo contrario
			System.out.print("y es capicúa");//Imprimimos es capicúa

		}
		sc.close();//Cerramos el escáner
	}
}
