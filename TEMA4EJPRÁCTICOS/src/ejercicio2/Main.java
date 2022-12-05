package ejercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//Creamos el objeto escáner

		System.out.print("Introduzca el radio de la esfera: ");//Pedimos el radio
		Esfera.rad = sc.nextInt();//Leemos el radio y lo guardamos en la variable global de la clase esfera
		
			System.out.println("El área es de " + Esfera.area() + " cm cuadrados");//Imprimimos el resultado del área
		
			System.out.println("El volumen es de " + Esfera.volumen() + " cm cúbicos");//Imprimimos el resultado del volumen
		
		sc.close();//Cerramos el escáner

	}
}
