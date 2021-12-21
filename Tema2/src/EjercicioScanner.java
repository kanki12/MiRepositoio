import java.util.Scanner;

public class EjercicioScanner {

	public static void main(String[] args) {
		/*Scanner sc1=new Scanner(System.in);
		System.out.println("Escribe un numero entero"); 
		int ent1=sc1.nextInt();
		sc1.close();
		if (ent1%2==0) {
			System.out.println("Su numero es par");
		}else {
			System.out.println("Su numero es impar");
		}
		System.out.println("FIN DEL PROGRAMA");*/
		
		
		
		/*Scanner sc2=new Scanner(System.in);
		System.out.println("Tu nombre");
		String nombre=sc2.nextLine(); 
		System.out.println("Hola "+nombre+" chupapijas");
		sc2.close();
		System.out.println("FIN DEL PROGRAMA");*/
		
		
		
		/*Scanner sc3=new Scanner(System.in);
		System.out.println("Escribe un numero entero");
		int ente1=sc3.nextInt();
		sc3.close();
		if ((ente1-1)%3==0) {
			System.out.println((ente1-1)+" es multiplo de 3");
		}else {
			if ((ente1+1)%3==0) {
				System.out.println((ente1+1)+" es multiplo de 3");
			}else {
			System.out.println("No es multiplo de 3");
			}
		}
		System.out.println("FIN DEL PROGRAMA");*/
		
		
		
		/*Scanner sc4 = new Scanner(System.in);
		System.out.println("Mete un true o false");
		boolean b1 = sc4.nextBoolean();
		System.out.println("Mete otro un true o false");
		boolean b2 = sc4.nextBoolean();
		sc4.close();
		if (b1 != b2) {
			System.out.println("Son diferentes valores, siguen secuencia");
		} else {
			System.out.println("Son iguales valores, no siguen secuencia");
		}
		System.out.println("FIN DEL PROGRAMA");*/
		
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Dime que quieres calcular, poniendo 1 o 2, 1 es par el area de un triangulo y 2 para el cuadrado.");
		int opc=sc.nextInt();
		if (opc==1 || opc==2) {
		if (opc==1) {
			System.out.println("Dime la base del triangulo");
			int b= sc.nextInt();
			System.out.println("Dime la altura del triangulo");
			int a= sc.nextInt();
			System.out.println("El area del rectangulo es "+(b*a));
		}else  if (opc==2){
			System.out.println("Introduce el lado");
			int l= sc.nextInt();
			System.out.println("El area del cuadrado es "+(l*l));
		}}else {
			System.out.println("Solo puedes introducir un 1 o 2");
		}
		sc.close();
		System.out.println("FIN DEL PROGRAMA");*/
		
		
		
		Scanner sc5=new Scanner(System.in);
		System.out.println("Introduce un 1º numero");
		int num1=sc5.nextInt();
		System.out.println("Introduce un 2º numero");
		int num2=sc5.nextInt();
		System.out.println("Introduce un 3º numero");
		int num3=sc5.nextInt();
		sc5.close();
		if (num1<num2 && num2<num3) {
			System.out.println(num1 + "es el menor");
		}else if (num2<num3){
			System.out.println(num2 + "es el menor");
		}else {
			System.out.println(num3 + "es el menor");
		}
		
		System.out.println("FIN DEL PROGRAMA");
	}
}	