
public class Ejercicoiv {

	public static void main(String[] args) {
		// Programa que lee 9 números, y en el caso en el que el primero introducido sea igual al último, nos muestra la media. En caso contrario, no se mostrará nada
		int primero= (int)(Math.random()*10);
		System.out.println("El primero es "+ primero);
		int ultimo= (int)(Math.random()*10);
		System.out.println("El ultimo es "+ultimo);
		int suma=0;
		if (primero==ultimo) {
		for (int i = 1; i < 8; i++) {
			int n1= (int)(Math.random()*10);
			suma += n1;
			System.out.print(n1+ ", ");
		}
		System.out.println("\n\nLa media es: "+ ((ultimo+primero+suma)/9.0));
		} else {
			System.out.println("No son iguales");
		}
		System.out.println("Fin de programa");
	}
}
