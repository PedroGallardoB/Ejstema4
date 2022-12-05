package ejercicio1;

public class Números {

	boolean esPrimo(int num) {

		if (num < 0) {
			num = -num;
		}

		// Recorremos los números desde 2 hasta número-1
		boolean esPrimo = true;
		for (int aux = 2; aux < num; aux++) {
			// Si el número es divisible por i deja de ser primo

			
				if (num % aux == 0) {
					esPrimo = false;
					break;
				}
			}
		

		return esPrimo;
	}

	boolean esCapicua(int numero) {
	
		boolean esCapicua=false;
		int num;
		int aux=0;
		num=numero;
		
		while(num!=0) {
		int cifra = num % 10;
		aux = aux*10 + cifra;
		num=num/10;}
		
	
	if(numero==aux) {
		esCapicua=true;
	}
	return esCapicua;
}
}
