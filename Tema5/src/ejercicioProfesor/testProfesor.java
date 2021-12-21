package ejercicioProfesor;

public class testProfesor {

	public static void main(String[] args) {
		Profesor p1=new Profesor("Samu","Chupapijas",54,true);
		System.out.println(p1.informa());
		Profesor p2=new Profesor();
		System.out.println(p2.informa());
		Profesor p3=new Profesor("JEJEJEJE","Hola",69);
		System.out.println(p3.informa());
		Profesor p4=new Profesor("Siuuuuuu",6900,true);
		System.out.println(p4.informa());
	}

}
