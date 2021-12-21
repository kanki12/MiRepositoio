
public class EjemploChar {

	public static void main(String[] args) {
		char ch = 'h';// Un solo caracter
		String str = "hola chupapijas";// Cadena de caracteres
		System.out.println("Mi caracter es " + ch);
		System.out.println("Mi cadena de caracteres es " + str);
		System.out.println("Mi caracter de forma numerica es " + (int) ch);// Asi seria como poner mi caracter en su
																			// forma numerica
		System.out.println("Mis caracteres combinados es " + ((char) (ch + ch)));// Esto seria la suma de los dos
																					// caracteres de forma numerica y me
																					// da esa suma el simbolo en UNICODE

	}

}
