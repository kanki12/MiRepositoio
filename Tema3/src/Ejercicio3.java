
public class Ejercicio3 {

	public static void main(String[] args) {
		int menor;
		int num1 = -(int) (Math.random() * 100);
		System.out.println(num1);
		menor = num1;
		for (int i = 0; i < 9; i++) {
			num1 = -(int) (Math.random() * 100);
			System.out.println(num1);
			if (num1 < menor) {
				menor = num1;
			}
		}
		System.out.println("El menor es " + menor);

		// version 2.0
		int menor2 = 0;
		int num2;
		for (int i = 0; i < 9; i++) {
			num2 = (int)(Math.random()*(-100));
			if (num2 < menor2) {
				menor = num2;
			}
		}
		System.out.println("El menor es " + menor2);
	}
	

}
