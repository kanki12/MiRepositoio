import java.util.Scanner;

public class EjercicioCuadrado {
	public static void dibujaRectangulo(int base, int alt) {
		for (int i = 0; i < alt; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el largo del cuadrado");
		int base= Math.abs(sc.nextInt());
		System.out.println("Dime el ancho del cuadrado");
		int alt= Math.abs(sc.nextInt());
		sc.close();
		dibujaRectangulo(base, alt);
		System.out.println("Fin");
	}

}
