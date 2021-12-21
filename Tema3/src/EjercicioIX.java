
public class EjercicioIX {

	public static void main(String[] args) {
		//Programa que averigua si un número leído es primo o no
		int num=(int)(Math.random()*10);
		System.out.println("El numero es " +num);
		boolean b=true;
		for (int i =num-1; i>1; i--) {
			if (num%i==0) {
				System.out.println(num+" no es primo");
				b=false;
				break;
			}
		}
		if (b) {
			System.out.println("Es primo");
		}	
		System.out.println("Fin");
	}

}
