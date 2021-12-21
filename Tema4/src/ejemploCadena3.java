import java.util.Scanner;

public class ejemploCadena3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int posicion;
		String cad;
		System.out.println("Introduce una cadena");
		cad=sc.nextLine();
		String[] trozos=cad.split("z");
		System.out.println("El numero de elementos que tiene trozos es:"+trozos.length);
		for (String subcadena:trozos) {
			System.out.println(subcadena);
		}
		sc.close();

	}

}
