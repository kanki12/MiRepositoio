package ejercicio1;

public class Vehiculo {

	
	 private int numruedas;
	 private int velmax;
	 private int peso;
	 
	 public Vehiculo (int num, int max, int ps) {
		 numruedas=num;
		 velmax=max;
		 peso=ps;
	 }
	 
	public void setNumeroruedas(int num) {
		numruedas=num;
	}
	 
	public void setVelmax(int max) {
		velmax=max;
	}
	 
	 public void setPeso(int ps) {
		peso=ps;
	}
	 
	public int getNumruedas() {
		return numruedas;
	}
	 
	public int getVelmax() {
		return velmax;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public boolean esigual(Vehiculo otro) {
		if (numruedas==otro.numruedas && velmax==otro.velmax && peso==otro.peso) {
		return true;
		}
	return false;
	}
	
	public void copia1 (Vehiculo otro) { //De otro vamos a copiar a este.
		numruedas=otro.numruedas;
		velmax=otro.velmax;
		peso=otro.peso;
	}
	
	public void copia2 (Vehiculo otro) { //De otro este a copiar a otro.
		otro.numruedas=numruedas;
		otro.velmax=velmax;
		otro.peso=peso;
	}
	
	public String informacion() {
		return "vehiculo " + " " + numruedas + " " + velmax + " " + peso;
	}
	
	public Vehiculo copia3() {
	//	Vehiculo avion= new Vehiculo(0,0,0)
		
		return new Vehiculo(numruedas,velmax,peso);
	}
}

