package ejercicioPelicula;

import java.util.Arrays;

public class Pelicula {
	private String titulo;
	private String genero;
	private int duracion;
	private String[] actores;
	
	public Pelicula(String titulo, String genero, int duracion) {
		this.titulo=titulo;
		this.genero=genero;
		this.duracion=duracion;
		this.actores=new String[3]; //3 posiciones en NULL
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String critica() {
		return "la pelicula "+titulo+" desarrola como tema principal...";
	}
	
	public static double recaudacion(int numesp) {
		return numesp*10.0;
	}
	
	public boolean agregar(String nombre) {
		for (int i = 0; i < actores.length; i++) {
			if (actores[i]!=null) {
				if (actores[i].equals(nombre)) {
					System.out.println("Ese nombre ya esta");
					return false;
				}
			} else {
				actores[i]=nombre;
				System.out.println("Nombre agregado"); //Ayudas para el progrmador, no hay que ponerlo
				return true;
			}
		}
		return false; //Lista llena y no coincidente
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + ", actores="
				+ Arrays.toString(actores) + "]";
	}
	
}

