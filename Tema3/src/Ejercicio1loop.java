import java.util.Scanner;

public class Ejercicio1loop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num, contador=0, suma=0;
		while(suma<100){
			System.out.println("Intro numero");
			num=sc.nextInt();
			contador++;
			suma+=num;
			System.out.println(num);
		}
		sc.close();
		System.out.print("La suma acomulada es "+suma);
		System.out.println(" con "+contador+" numeros");
	}
}
