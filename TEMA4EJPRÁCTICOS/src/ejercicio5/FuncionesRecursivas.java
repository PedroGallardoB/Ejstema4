package ejercicio5;
/**
 * Método de funciones recursivas
 * @author Rexil
 *
 */
public class FuncionesRecursivas {
	

		static int sumatorio(int num) {//Suma de todos los números entre 1 y n.
			int res=0;//Iniciamos el resultado en cero
			
			if (num==1) {//CASO BASE si el número es cero el resultado es 1
				res=1;
			} else {//De lo contrario...
				res=num+ sumatorio(num-1); //Resultado es sumar el número más la recursiva entrando como el número anterior
			}

			return res;//Devuelve el resultado

		}

		static double potencia(double num, int veces) {//Calcula potencias dado base y exponente
			double res=0;//Iniciamos el resultado en cero
			if (veces==0) {//CASO BASE si el número es cero el resultado es 1
				res=1;
			} else {//De otra forma...
				res=num*potencia(num,veces-1);//Resultado es multiplicar el número más la recursiva entrando como el número anterior
			}

			return res;//Devolvemos el resultado
			
		}

		static int fibonacci(int posicion) { //Da el valor de una posición en la secuencia Fibonacci
			int res;//Iniciamos la variable
			if (posicion <= 1) {//Si el número es uno o menor el resultado es 1
				res = 1;
			} else {//De otro modo...
				res = fibonacci(posicion - 1) + fibonacci(posicion - 2);//El resultado será el anterior menos el anterior del anterior
			}

			return res;//Devolvemos el resultado
		}
	}


