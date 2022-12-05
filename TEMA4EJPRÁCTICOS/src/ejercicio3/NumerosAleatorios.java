package ejercicio3;

public class NumerosAleatorios {
	static void numAleatorios(int cantidad) {

		for (int i = 1; i <= cantidad; i++) {

			System.out.println(Math.random());
		}
	}

	static void numAleatorios2(int cantidad, int numMax) {

		for (int i = 1; i <= cantidad; i++) {

			System.out.println((int) (Math.random() * numMax + 1));
		}
	}

	static void numAleatorios3(int cantidad, int numMax, int numMin) {
		if (numMax < numMin) {
			System.out.println("El máximo debe ser mayor que el mínimo");
		} else {
			int tope = 0;
			while (tope < cantidad) {
				int num = (int) (Math.random() * (numMax + 1));
				if (num >= numMin) {
					System.out.println(num);
					tope++;
				}

			}
		}
	}


}
