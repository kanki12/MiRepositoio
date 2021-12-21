import java.util.Scanner;

public class EjercicioBreak {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int contadorIntentos=10;
		int numUsu;
		int numMaq=(int)(Math.random()*100+1);
		do {
		System.out.println("Acierta un numero del 1 al 100");
		numUsu=sc.nextInt();
		contadorIntentos--;
		if (numMaq==numUsu) {
			System.out.println("Has acertado, GG EZ, el numero era "+numMaq+" en el intento "+(10-contadorIntentos)+"º");
		}else if (numMaq>numUsu) {
			System.out.println("Has fallado, te quedaste por debajo");
		}else {
			System.out.println("Has fallado, te quedaste por encima");
		}
		}while (contadorIntentos>0 && numMaq!=numUsu);
		System.out.println("Fin del proframa");
		sc.close();
	}

}
