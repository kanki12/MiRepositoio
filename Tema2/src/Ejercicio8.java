import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menor, intermedio, mayor; 						//Variables auxiliares
		System.out.println("Introduce 1 valor entero");
		int n1 = sc.nextInt(); 								//Primer numero
		menor = n1; 										//Ponemos el n1 como menor

		System.out.println("Introduce un segundo valor entero");
		int n2 = sc.nextInt(); 								//Segunodo numero

		if (n2 > menor) { 									//Vemos si n2 es mayor que n1 = menor
			intermedio = n2; 								//Ponemos el n2 como intermedio si se cumple
		} else {
			menor = n2; 									//Si no se culple ponemos como menor n2
			intermedio = n1;								//Y como intermedio n1
		}

		System.out.println("Introduce un tercer valor entero");
		int n3 = sc.nextInt(); 								//Tercer numero.
		if (n3 > intermedio) { 								//Si el n3 es mayor que el intermedio,
			mayor = n3; 									//El n3 es el mayor.
		} else if (n3 > menor) { 							// Si no se cumple, vemos si n3 es mayor que el menor el cual puede ser n2 o n1.
			mayor = intermedio; 							//Entonces el mayor seria el intermedio
			intermedio = n3;								//Y el intermedio es n3
		} else {
			mayor = intermedio;								//Pero si no se cumple todo lo anterior el mayor pasa a ser el intermedio,
			intermedio = menor;								//El menor pasa a ser el intermedio,
			menor = n3;										//Y el menor es n3.
		}
		sc.close();
		System.out.println(mayor + ", " + intermedio + ", " + menor);
	}

}
