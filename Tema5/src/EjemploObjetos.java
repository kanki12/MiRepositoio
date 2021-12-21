
public class EjemploObjetos {
	public class vehiculo{
		int numpasajeros;
		int capacidad;
		int consumo;
	
	public void Informacion() {
		System.out.println("Tu vehiculo puede llevar hasta "+numpasajeros+" pasajeos y consume "+consumo+" litros por km");
	}
	public double coste(double precio, int kmRecorridos) {
		double aux=precio*consumo*kmRecorridos;
		return aux;
	}
	
	}
	
}
