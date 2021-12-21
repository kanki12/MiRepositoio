
public class PruebaMath {

	public static void main(String[] args) {
		System.out.println("Prueba paquete Math");
		double alea = Math.random() * 100 + 5;
		int n1 = (int) (alea);
		System.out.println("Mi primer numero aleatorio es " + n1);
		double n2 = Math.random();
		System.out.println("Mi segundo numero aleatorio es " + n2);

		int i = Math.abs(-7);
		System.out.println(i);

		int max = 500;
		int min = 46;
		int var = (int) (Math.random() * (max - min + 1) + (min));
		System.out.println(var);
	}

}
