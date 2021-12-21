import java.util.Scanner;

public class EjercicioBuclesV {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int unidad, factura;	
		double precio=0, acomulador=0, descuento;
		
		do {
		System.out.println("Dime el nº de unidades");
		unidad=sc.nextInt();
		
		/*if(unidad==0) {
			break;
		}*/
		
		System.out.println("Dime el precio de la unidad");
		precio=sc.nextDouble();
		
		acomulador+=precio*unidad;
		
		}while(unidad!=0);
		System.out.println("El valor de tu factura es "+acomulador);
		if(acomulador>=1000) {
			descuento=precio*5/100;
			System.out.println("El precio es "+(acomulador-descuento));
		}else {
			System.out.println("El precio es "+acomulador);
		}
		
			System.out.println("Fin");
	}

}
