import java.util.Scanner;

public class EjercicioArraysI {
	public static void mostrarArray(int[] miArray) {
		for (int i = 0; i < miArray.length; i++) {
			System.out.print(miArray[i]+" ");
		} 
	}

	public static void main(String[] args) {
		int aux,tam=10;
		int[] datos=new int[tam];
				for (int i = 0; i < datos.length; i++) {
					datos[i]=(int)((Math.random()*10)+1);
				}
		System.out.println("Antes");
		mostrarArray(datos);
		System.out.println();
		aux=datos[0];
		System.out.println("Despues");
		datos[0]=datos[tam-1];
		datos[tam-1]=aux;
		mostrarArray(datos);
		System.out.println();
		System.out.println("Fin");
	}
	
}
