package ejercicioMiString;

public class MiString {

	public static String alReves(String cadena) {
		String nuevaCadena="";
		for (int i = cadena.length()-1; i > -1; i--) {
			nuevaCadena+=cadena.charAt(i);
		}
		return nuevaCadena;
	}
	
	public static String limpiaCaracteres(String cadena, String exp) {
		String[] salida=cadena.split(exp);
		String sol="";
		for (int i = 0; i < salida.length; i++) {
			sol+=salida[i];
		}
		return sol;
	}
	
	public static String quitarTildes(String cadena) {
		String contildes="αινσϊ";
		String sintildes="aeiou";
		String cadenaLimpiaAcentos="";
		int pos;
		for (int i = 0; i < cadena.length(); i++) {
			pos=contildes.indexOf(cadena.charAt(i));
			if (pos==-1) {//Encuentra tildes
				cadenaLimpiaAcentos+=cadena.charAt(i);
			}else {//No hay acento
				cadenaLimpiaAcentos+=sintildes.charAt(pos);
			}
		}
		return cadenaLimpiaAcentos;
		
	}
	
	public static boolean esPalindromo(String cadena) {
		if (cadena.equals(alReves(cadena))) {
			return true;
		}
		return false;
	}
	
	public static boolean esNumero(String cad) {
		char c;
		int contadorPuntos = 0;
		for (int i = 0; i < cad.length(); i++) { //Recorrer la cadena caracter a caracter
			c=cad.charAt(i); // +, -, . son 43, 45, 46
			if (i==0 && c!=45 && c!=43 && c!=46 && (c<=47 || c>=58)) {
				return false;
			} else if(i!=0) {
				if ((c<=47 || c>=58) && c!=46) {
					return false;
				}
			}
			
			if (c==46) {
					contadorPuntos++;
				}
		}
		if(contadorPuntos>1) {
		return false;
	}
	return true;
	}
}

