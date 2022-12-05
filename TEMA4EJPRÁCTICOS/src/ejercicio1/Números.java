package ejercicio1;

/**
 * Métodos Números
 * @author Rexil
 *
 */

public class Números {

	//Comprueba si el número es primo
	boolean esPrimo(int num) {

		if (num < 0) {//Si el número es negativo...
			num = -num;//Tomamos en cuenta el inverso
		}

		boolean esPrimo = true;
		for (int aux = 2; aux < num; aux++) {//Bucle hasta que el auxiliar sea igual o mayor que el num 
			
				if (num % aux == 0) { // Si el número es divisible por i...
					esPrimo = false; // ...deja de ser primo
					break;//Salimos del bucle
				}
			}
		

		return esPrimo; //Devuelve el resultado
	}

	//Comprueba si el número es capicúo
	boolean esCapicua(int numero) {
	
		boolean esCapicua=false;//Partimos de que el número no es capicúo
		int num;//Guarda el número introducido
		int aux=0;//Auxiliar que se inicializa en cero
		num=numero; //Guardamos el número en otra variable para no alterarlo
		
		while(num!=0) {//Mientras el número sea distinto de cero
		int cifra = num % 10;//La variable cifra será el resto de num/10
		aux = aux*10 + cifra;//Auxiliar será el inverso del número
		num=num/10;}//El número es el mismo entre 10 para trabajar con sus distintos dígitos
		
	
	if(numero==aux) {//Si el inverso y el número son iguales
		esCapicua=true;//Es capicúa
	}
	return esCapicua;//Devuelve el resultado
}
}
