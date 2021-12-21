package ejercicioEmpleado;

public class Empleado {
	
	private String nombre;
	private String telefono;
	static private int numEmpleados;
	
	
	public Empleado(String nombre, String telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
		numEmpleados++;
	}
	
	public Empleado(String telefono) {
		this.nombre="Pepe";
		this.telefono=telefono;
		numEmpleados++;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public static int getNumEmpleados() {
		return numEmpleados;
	}
	
	
	public String toString() {
		return nombre+" "+telefono;
	}
	
	
	public boolean sonIguales(Empleado Otro) { // Mismo nombre y mismo telefono
		if (this.nombre.equals(Otro.getNombre()) && this.telefono.equals(Otro.getTelefono())) {
		return true;
		}
		return false;
	}
	
}
