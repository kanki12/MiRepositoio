
import java.util.Scanner;

public class EjemploFor {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("insert un numero");
			int num=sc.nextInt();
			for (int i = 0; i < 10; i++) {
				System.out.println(num+" *"+i+" ="+(num*i));
			}
			sc.close();
			
			int num2=5;//Saca la tabla del 5 peros solo los 5 primeros
			
			for (int i = 1; i < 6; i++) {
				System.out.println(num2+" *"+i+" ="+(num2*i));
			}
	}

}
