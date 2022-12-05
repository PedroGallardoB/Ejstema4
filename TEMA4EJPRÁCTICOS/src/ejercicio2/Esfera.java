package ejercicio2;
/**
 * Métodos de área y volumen
 * @author Rexil
 *
 */
public class Esfera {
	static double rad;//Variable estática global del valor del radio
	public static double area() {//Función para calcular el área

		double area = 4 * Math.PI * rad * rad;//Formula del área
		return area;//Devuelve el valor del área

	}

	public static double volumen() {//Función para calcular el volumen

		double volumen = (4 * Math.PI / 3) * rad * rad * rad;//Formula del área
		return volumen;//Devuelve el valor del área

	}

}
