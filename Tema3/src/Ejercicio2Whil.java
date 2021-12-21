import java.util.Scanner;

public class Ejercicio2Whil {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Intro numero");
		int anterior=sc.nextInt();
		System.out.println("Intro numero");
		int siguiente=sc.nextInt();
		while(anterior!=siguiente) {
			anterior=siguiente;
			System.out.println("intro numero");
			siguiente=sc.nextInt();
		
		}
		sc.close();
		System.out.println("Fin de programa, son iguales");
	}

}
