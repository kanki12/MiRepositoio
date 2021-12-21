
public class EjercicioVIII {

	public static void main(String[] args) {
		//Calcula y muestra el factorial de los 10 primeros números naturales
		for (int j = 1; j < 11; j++) {
			int resultado=j;
			for (int i = 2; i < j+1; i++) {
				resultado=resultado*j;
			}
			System.out.println("El factorial de "+j+" es "+resultado);
		}
		System.out.println("Fin de sistema");
	}

}
