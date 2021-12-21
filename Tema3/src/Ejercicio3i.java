
public class Ejercicio3i {

	public static void main(String[] args) {
		int primero = (int) (Math.random()*2);
		System.out.println("El numero es "+primero);
		int numero;
		boolean si = true;
		for (int i = 1; i < 3; i++) {
			numero = (int) (Math.random()*2);
			System.out.println("El numero es " + numero);
			if (primero != numero) {
				si = false;
			}
		}
		if (si == true) {
			System.out.println("Todos son iguales");
		} else {
			System.out.println("No todos son iguales");
		}
		System.out.println("Fin de mi programa");
}
	}
