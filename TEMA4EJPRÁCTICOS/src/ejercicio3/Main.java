package ejercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int num1;//Guarda un número para operar en las distintas funciones
		int num2;//Guarda un número para operar en las distintas funciones
		int num3;//Guarda un número para operar en las distintas funciones

		Scanner sc = new Scanner(System.in);//Llamamos a un objeto escáner
		System.out.print("Introduzca un número para generar esa cantidad de aleatorios: ");//Pide la cantidad de números aleatorios a generar
		num1 = sc.nextInt();//Lo lee
		NumerosAleatorios.numAleatorios(num1);//Función que genera números aleatorios

		System.out.print("Introduzca un número para generar esa cantidad de aleatorios: ");//Pide la cantidad de números aleatorios a generar
		num1 = sc.nextInt();//Lo lee
		System.out.print("Introduzca el valor máximo de los mismos: ");//Pide un valor máximo para los números
		num2 = sc.nextInt();//Lo lee
		NumerosAleatorios.numAleatorios2(num1, num2);//Función que genera números aleatorios con un máximo

		System.out.print("Introduzca un número para generar esa cantidad de aleatorios: ");//Pide la cantidad de números aleatorios a generar
		num1 = sc.nextInt();//Lo lee
		System.out.print("Introduzca el valor máximo de los mismos: ");//Pide un valor máximo para los números
		num2 = sc.nextInt();//Lo lee
		System.out.print("Introduzca el valor mínimo de los mismos: ");//Pide un valor mínimo para los números
		num3 = sc.nextInt();//Lo lee
		NumerosAleatorios.numAleatorios3(num1, num2, num3);//Función que genera números aleatorios comprendidos entre dos valores


sc.close();//Cerramos el escáner

}

}
