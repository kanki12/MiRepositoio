
public class Ejerciciovi {

	public static void main(String[] args) {
		//Calcula el factorial de un número leído por teclado
		int num=(int)(Math.random()*10);
		int resultado=num;
		for (int i =num-1; i >0; i--) {
			resultado=resultado*i;
		}
		System.out.println("El factorial de "+num+" es resultado "+resultado);
		System.out.println("FIN");
	}

}
