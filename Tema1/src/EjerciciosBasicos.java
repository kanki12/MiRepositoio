
public class EjerciciosBasicos {

	public static void main(String[] args) {
		// Ejercicio 1
		double km = (Math.random() * (5.7 - 1 + 1) + (1));
		System.out.println("Km recorridos " + km);
		double litros = (Math.random() * (100 - 1 + 1) + (1));
		System.out.println("Litros consumidos " + litros);
		double con = litros / km;
		System.out.println("El consumo que tiene la moto es " + (Math.round((con * 100) / 100) + " l/km"));

		// Ejercicio 2
		double n1 = (int) (Math.random() * (20 - 1 + 1) + (1));
		System.out.println("Mi primer numero es " + n1);
		double n2 = (int) (Math.random() * (10 - 1 + 1) + (1));
		System.out.println("Mi segundo numero es " + n2);
		double n3 = n1 + n2;
		System.out.println("La suma de los dos es " + n3);
		double n4 = (int) (Math.random() * (30 - 1 + 1) + (1));
		System.out.println("Mi tercer numero es " + n4);
		System.out.println("La suma de los dos por el tercer numero es " + (n4 * n3));

		// Ejercico 3
		double num1 = (Math.random() * (10 - 1 + 1) + (1));
		System.out.println("Mi primer numero es " + num1);
		double num2 = (int) (Math.random() * (10 - 1 + 1) + (1));
		System.out.println("Mi segundo numero es " + num2);
		double num3 = num1 + num2;
		System.out.println("La suma de los dos es " + num3);
	}

}
