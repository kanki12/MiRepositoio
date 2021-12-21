import java.util.Scanner;

public class PracticaScaner2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un numero");
		// String cad=sc.next();
		int v=sc.nextInt();
		System.out.println("Ahora cadena");
		String cad1=sc.next();
		System.out.println(cad1+" "+v);
		sc.close();
		
	}

}
