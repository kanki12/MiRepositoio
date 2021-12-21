import java.util.Scanner;

public class EjemploCharAt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre=sc.next();
		sc.close();
		
		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		

	}

}
