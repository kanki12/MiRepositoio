package ejercicio2;

public class Nombres {

	private int numMax; //Numero maximo de nombres que puede tener la lista
	private String[] lista;
	private int actual;
	
	public Nombres (int max) {
		numMax=max;
		lista= new String [numMax];
		actual = 0;
	}
	
	public void setnumMax(int nuevoMax) {
		numMax=nuevoMax;
	}
	
	public int getnumMax() {
		return numMax;
	}
	
	public int agregarNombre(String nuevoNombre) {
		if (estaLlena()) { //Lista llena
			//System.out.println("lalista ya estaba llena");
			return -1;
		} else if (actual<numMax) { //Es posible añadirlo
			for (int i = 0; i < actual; i++) {
				if(lista[i].equals(nuevoNombre)) { //No añadimos porque ya estaba
					//System.out.println(nuevoNombre+" ya estaba");
					return 0;
				}
			}
		}
		lista[actual++]=nuevoNombre; //Añadimos
			return 1;
	}
	
	public boolean eliminar(String nombre) {
		int posicion=-1;
		for (int i = 0; i < actual; i++) {
			if(lista[i].equals(nombre)) {
				//El nombre está.Buena data.
				posicion=i;
				break;
			}
		}
		if (posicion==-1) {
			return false;
		}
		
		for (int i = posicion; i < actual-1 ; i++) {
			lista[i]=lista[i+1];
		}
		lista[actual-1]=null; //Borrado fisico
		actual--; //Borrado logico
		return true;
	}
	
	public void vaciar() {
		for (int i = 0; i < actual; i++) {
			lista[i]=null;
		}
	}
	
	public int NumNombres() {
		return actual;
	}
	
	public String mostrar(int valor) {
		if (valor<actual) {
			return lista[valor];
		}
		return "Ese valor no existe en la lista";
	}
	
	public int maxNombres() {
		return numMax;
	}
	
	public boolean estaLlena() {
		if (actual==numMax) {
			return true;
		}
		return false;
	}
	
	public void verListaActual ( ) {
		System.out.println("Listado de nombres");
		for (int i = 0; i < actual; i++) {
				System.out.println(lista[i]);
			}
	}
}
