package ejercicio3;
/**
 * Clase que genera números aleatorios
 * @author Rexil
 *
 */

public class NumerosAleatorios {
	static void numAleatorios(int cantidad) {// Función que imprime números aleatorios del cero al uno

		for (int i = 1; i <= cantidad; i++) {// Bucle para repetir la acción de debajo "cantidad" veces

			System.out.println(Math.random());// Imprime un número aleatorio del cero al uno
		}
	}

	static void numAleatorios2(int cantidad, int numMax) {// Función que genera números aleatorios con un máximo

		for (int i = 1; i <= cantidad; i++) {// Bucle para repetir la acción de debajo "cantidad" veces

			System.out.println((int) (Math.random() * numMax + 1));// Genera números aleatorios de cero al máximo
		}
	}

	static void numAleatorios3(int cantidad, int numMax, int numMin) {// Función que genera números aleatorios con un
																		// máximo y mínimo
		if (numMax < numMin) {// Si el mínimo es mayor que el máximo...
			System.out.println("El máximo debe ser mayor que el mínimo");// ...Da error
		} else {// De otro modo...
			for (int i = 1; i <= cantidad; i++) {// Bucle para repetir la acción de debajo "cantidad" veces
				System.out.println((int) (Math.random() * numMax + 1) + numMin);//genera números aleatorios con un máximo y mínimo
			}
		}
	}
}
