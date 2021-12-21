import java.util.Scanner;

public class ejemploCadena2 {

	public static void main(String[] args) {
		/*String cad="Estamos en la clase de progrmacion";*/
		Scanner sc=new Scanner(System.in);
		int posicion;
		String cad;
		System.out.println("Introduce una cadena");
		cad=sc.nextLine();
		do {
			posicion=cad.indexOf(" ");
		if (posicion>-1) {
			System.out.println(cad.substring(0, posicion));
			cad=cad.substring(posicion+1);
		}
		}while (posicion!=-1);
		System.out.println(cad);
		sc.close();
	}

}
