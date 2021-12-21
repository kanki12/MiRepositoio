
public class EjercicioBoolean {

	public static void main(String[] args) {
		double n1 = (int) (Math.random() * (50 - 1 + 1) + (1));
		double n2 = (int) (Math.random() * (50 - 1 + 1) + (1));
		System.out.println("n1 es " + n1 + " y n2 es " + n2);
		boolean n3 = (n1 > n2);/* Aqui */
		/*
		 * if (n1>n2) { n3=true; } else { Esto es opcional, ya que seria mas facil dar
		 * el valor true o false arriba directamente n3=false; }
		 */
		if (n3) {
			System.out.println("n1 es mayor que n2");
		} else {
			System.out.println("n1 es menor o igual que n2");
		}
	}

}
