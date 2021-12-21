package ejercicioMiString;

public class testMiString {

	public static void main(String[] args) {
		String cad="88";
		String reves= MiString.alReves(cad);

		System.out.println(cad);
		System.out.println(reves);

		System.out.println(MiString.limpiaCaracteres(cad, reves));
		
		String cad2="camión";
		System.out.println(cad2.toUpperCase());

		System.out.println(MiString.quitarTildes(cad));
		
		System.out.println("¿Es palindromo? "+MiString.esPalindromo(cad));
		
		System.out.println("¿Es un numero? "+MiString.esNumero(cad));
		
		
	}

}
