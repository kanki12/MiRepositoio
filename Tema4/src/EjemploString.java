
public class EjemploString {

	public static void main(String[] args) {
		String cad1=new String("Hola");
		String cad2=new String(cad1);
		System.out.println(cad1+" "+cad2);
		if (cad1==cad2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		if (cad1.equals(cad2)) {
			System.out.println("Tienen el mismo contenido");
		} else {
			System.out.println("No tienen el mismo contenido");
		}
		
		System.out.println();
		 
		String[] cads= {new String("Java para principiantes"),
				new String("Estudio de Java Poo"),
				new String("Estudio de Poo")};
		for (int i = 0; i < cads.length; i++) {
			int pos=cads[i].indexOf("Java");
			if (pos>-1) {
				System.out.println(cads[i]+" "+pos);
			}
		}
		}
	}
