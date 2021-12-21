package ejercicioParking;

public class testParking {

	public static void main(String[] args) {
		Parking p1=new Parking("Parque Sur", 3, 100);
		if (p1.lleno()) {
			System.out.println("Primer cartel lleno");
		} else {
			System.out.println("Poner cartel de hay plaza libre");
		}

	}

}
