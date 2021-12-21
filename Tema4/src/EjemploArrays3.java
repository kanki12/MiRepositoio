
public class EjemploArrays3 {

	public static void main(String[] args) {
		String[] nombres=new String[3];
		String[] nombres1= {"carlos","hugo","utan","pepe","ana","pablo","ines","juan","alfonso",""};
		System.out.println(nombres.length);
		System.out.println(nombres1.length);
		for (int i = 0; i < nombres1.length; i++) {
			System.out.println(nombres1[i].charAt(0));
		}

	}

}
