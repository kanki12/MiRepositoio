import java.util.Scanner;

public class EjercicoArrays7 {
	private static void mostrar(int[] miArray) {
			for (int i = 0; i < miArray.length; i++) {
				System.out.println(miArray[i]+" ");
			}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tam=5;
		int[] datos=new int[tam];
		 
		for (int i = 0; i < tam; i++) {
			System.out.println("Intro valor");
			int num=sc.nextInt();
			datos[i]=num;
			for (int j = 0; j < i; j++) {
				if (datos[j]==num) {
					i--;
					break;
				}
			}
			System.out.println("Dame un numero");
			int d=sc.nextInt();
			}
			mostrar(datos);
			sc.close();
			System.out.println("Fin");
		}
	}
			


