package ejercicioProfesor;

public class Profesor {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean especialista;
	
	public Profesor (String nombre, String apellido, int edad, boolean especialista) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.especialista=especialista;
	}
	
	public Profesor () {
		nombre="Juan Carlos";
		apellido="Ruiz";
		edad=20;
		especialista=false;
	}
	
	public Profesor (String nombre, String apellido, int edad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		especialista=false;
	}
	
	public Profesor (String nombre, double edad, boolean especialista) {
		this.nombre=nombre;
		apellido="Ruiz";
		this.edad=(int)edad;
		this.especialista=especialista;
	}
	
	public void setEpecialista(boolean especialista) {
		this.especialista=especialista;
	}
	
	
	public String informa() {
		String aux="No";
		if(especialista) {
			aux="Si";
		}
		return "Nombre del profesor: "+ nombre+"\t Apellido: "+apellido+"\t Edad: "+edad+"\t Especialista: "+aux;
	}
}
