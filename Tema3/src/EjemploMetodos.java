
public class EjemploMetodos {
	public static int Suma (int n1,int n2) {
		return n1+n2;
	}
	public static void main(String[] args) {
		int num;
		for (int i = 1; i < 11; i++) {
			num=(int)(Math.random()*100);
			System.out.println(num+"\t");
			System.out.println(Suma(i,num));
			System.out.println();
		}
	}

}
