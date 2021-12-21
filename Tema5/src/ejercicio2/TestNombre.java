package ejercicio2;

public class TestNombre {
	
	public static void main(String[] args) {
		Nombres l1 = new Nombres(3);
		l1.agregarNombre("Eva");
		l1.agregarNombre("Juan Carlos");
		l1.agregarNombre("Pedro");
		
		l1.verListaActual();
		
		
		l1.eliminar("Eva");
		
		l1.verListaActual();
		
		
		l1.eliminar("Juan Carlos");
		
		l1.verListaActual();
		
		
		l1.eliminar("Pedro");
		
		l1.verListaActual();
		
		
		l1.eliminar("Mercedes");
		
		l1.verListaActual();
		
		
		
	}

}
