
public class Ejercicio3iii {

	public static void main(String[] args) {
		int maximo=0,contador=0;
		System.out.println("Mis valores son: ");
		for (int i = 0; i < 40; i++) {
			int numero=(int)(Math.random()*10);
			System.out.print("|"+numero+"|");
			if(numero>maximo) {
				maximo=numero;
				contador=1;
			}else if(numero==maximo){
				contador++;
			}
		}
		System.out.println("\n\nEl maximo valor es "+ maximo + ", que se ha repetido " + contador + " veces.");
	}

}
