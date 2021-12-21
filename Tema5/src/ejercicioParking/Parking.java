package ejercicioParking;

public class Parking {
	private String nombre;
	private int[][] plazas;
	private int nPlantas;
	private int nLugaresPlanta;
	
	
	public Parking(String nombre, int nPlantas, int nLugaresPlanta) {
		this.setNombre(nombre);
		this.nPlantas = nPlantas;
		this.nLugaresPlanta = nLugaresPlanta;
		this.plazas= new int[nPlantas][nLugaresPlanta];
	}

	public boolean plantaOcupada(int planta) {
		boolean plantaOcupada=true;
		for (int i = 0; i < plazas[planta].length; i++) {
			if (plazas[planta][i]==0) {
				plantaOcupada=false;
				break;
			}
		}
		return plantaOcupada;
	}
	
	public boolean lleno() {
		for (int i = 0; i < plazas.length; i++) {
			if (!plantaOcupada(i)) {
				return false;
			}	
		}
		return true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[][] getPlazas() {
		return plazas;
	}

	public void setPlazas(int[][] plazas) {
		this.plazas = plazas;
	}

	public int getnPlantas() {
		return nPlantas;
	}

	public void setnPlantas(int nPlantas) {
		this.nPlantas = nPlantas;
	}

	public int getnLugaresPlanta() {
		return nLugaresPlanta;
	}

	public void setnLugaresPlanta(int nLugaresPlanta) {
		this.nLugaresPlanta = nLugaresPlanta;
	}
	
	
}
