import java.util.Scanner;

public class EjercicioSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Mete la nota");
		int nota=sc.nextInt();
		sc.close();
		switch (nota) {
		case 0, 1, 2, 3, 4:
			System.out.println("Suspenso");
			break;
		case 5:
			System.out.println("Aprobado");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7, 8:
			System.out.println("Notable");
			break;
		case 9, 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println(nota+" es erronea");
			break;
		}
		System.out.println("Fin del programa");
	}
	

}
