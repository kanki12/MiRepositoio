import java.util.Scanner;

public class EjercicioBuclesVI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=0, num2=1, aux, cadena;
		System.out.println("Cuantos numeros de al cadena quieres");
		cadena=sc.nextInt();
		cadena=Math.abs(cadena);
		for (int i = 0; i < cadena; i++) {
			System.out.println(num2+" ");
			aux=num2+num1;
			num1=num2;
			num2=aux;
		}
		sc.close();
	}
}
