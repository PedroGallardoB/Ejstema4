package ejercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		double radio;
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca el radio de la esfera: ");
		radio = sc.nextInt();
		
			System.out.println("El área es de " + Esfera.area(radio) + " cm cuadrados");
		
			System.out.println("El volumen es de " + Esfera.volumen(radio) + " cm cúbicos");
		
		

		sc.close();

	}
}
