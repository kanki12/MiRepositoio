package ejercicioPelicula;

public class testPelicula {

	public static void main(String[] args) {
		Pelicula p1=new Pelicula("Connan","accion",120);
		System.out.println(p1);
		
		System.out.println(p1.agregar("ws"));
		System.out.println(p1.agregar("ws2"));
		System.out.println(p1.agregar("ws"));
		System.out.println(p1.agregar("ws3"));
		System.out.println(p1.agregar("Antonio"));
		
		System.out.println(p1);
	}

}
