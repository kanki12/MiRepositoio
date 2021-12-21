import java.util.Scanner;

public class PracticaScanner {

	public static void main(String[] args) {
		Scanner num1= new Scanner(System.in);
		System.out.println("Tecla un numero entero");
		int v=num1.nextInt();
		num1.close();
		int t=v++;
		System.out.println(t);
		System.out.println(v);
		
		Scanner num2= new Scanner(System.in);
		System.out.println("Tecla un numero con decimales");
		double v2=num2.nextDouble();
		num2.close();
		System.out.println(v2);
		
		Scanner num3= new Scanner(System.in);
		System.out.println("Tecla un boolean");
		boolean b=num3.nextBoolean();
		num3.close();
		if (b) {
			int numero=(int)(Math.random()*10);
			System.out.println(numero);
		}else {
		System.out.println("La clase ha terminado");}
		
		Scanner cadena= new Scanner(System.in);
		System.out.println("Dime una frase o una palabra");
		String cad=cadena.nextLine();
		cadena.close();
		System.out.println(cad);	
	}
}
