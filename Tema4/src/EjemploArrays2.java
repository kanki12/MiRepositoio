import java.util.Scanner;

public class EjemploArrays2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size;
		System.out.println("Dime cuantos elementos quires");
		size=Math.abs(sc.nextInt());
		int [] numeros=new int[size];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Intro valor");
			numeros [i]=sc.nextInt();
			System.out.print(numeros[i]+"\t");
		}
		sc.close();
		
	}

}
