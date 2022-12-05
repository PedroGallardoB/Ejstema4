package ejercicio5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int numero;//Guardará el número que se introduce en la primera y tercera función
		double base;//Guarda la base de la potencia
		int exponente;//Guarda el exponente de la potencia
		Scanner sc = new Scanner(System.in);//Nombramos el escáner

		System.out.print("Introduzca un número para el sumatorio con sus anteriores: ");//Pedimos un número para el sumatorio
		numero = sc.nextInt();//Lo leemos

		System.out.println("El resultado es " + FuncionesRecursivas.sumatorio(numero));//Imprimimos el resultado de la función sumatorio

		System.out.print("Introduzca un número para que haga de base: ");//Pedimos un número para la base
		base = sc.nextDouble();//Lo leemos
		System.out.print("Introduzca un número para que haga de exponente: ");//Pedimos un número para el exponente
		exponente = sc.nextInt();//Lo leemos

		System.out.println("El resultado es " + FuncionesRecursivas.potencia(base, exponente)); //Imprimimos el resultado de la función sumatorio

		System.out.print("Introduzca un número para saber el valor de esa posición de Fibonacci: ");//Pedimos un número para averiguar la posición en la secuencia Fibonacci
		numero = sc.nextInt();//Lo leemos

		System.out.println("El resultado es " + FuncionesRecursivas.fibonacci(numero));//Imprimimos el resultado de la función de Fibonacci


		sc.close();//Cerramos el escáner

	}
}
