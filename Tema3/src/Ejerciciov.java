
public class Ejerciciov {

	public static void main(String[] args) {
		//Programa que muestra todos los divisores de un n�mero introducido. Entre los divisores no se incluir� el propio n�mero.
		int numero=(int)(Math.random()*10);
		for (int i = 1; i < numero; i++) {
			if (numero%i==0) {
				System.out.println("\nEl numero es "+numero+"/"+i);
				System.out.println("La division es "+(numero/i));
			} 
		}
		System.out.println("Fin del sistema");
	}

}
