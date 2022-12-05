package ejercicio2;

public class Esfera {
	public static double area(double rad) {

		double area = 4 * Math.PI * rad * rad;
		return area;

	}

	public static double volumen(double rad) {

		double volumen = (4 * Math.PI / 3) * rad * rad * rad;
		return volumen;

	}

}
