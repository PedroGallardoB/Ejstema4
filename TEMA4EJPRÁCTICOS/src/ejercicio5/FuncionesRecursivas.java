package ejercicio5;

public class FuncionesRecursivas {
	public class Fibonacci {

		static int sumatorio(int posicion) {

		}

		static double potencia(double a, int n) {

		}

		static int fibonacci(int posicion) {
			int res;
			if (posicion <= 1) {
				res = 1;
			} else {
				res = fibonacci(posicion - 1) + fibonacci(posicion - 2);
			}

			return res;
		}
	}

}
