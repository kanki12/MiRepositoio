
public class cuatrobiv {
	private static void visualizarMatriz(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	private static int[][] crearMN (int filas,int cols,int valor) {
		int [][] mat=new int[filas][cols];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]=(int)(Math.random()*(valor+1));
			}
		}
		return mat;
	}
	
	private static void verUnaFila(int queFila,int[][] mat) {
		if (queFila>mat.length) {
			System.out.println("Esa fila no existe");
		} else {
			for (int i = 0; i < mat[queFila].length; i++) {
				System.out.print(mat[queFila][i]+"\t");
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] tabla=crearMN(3, 4, 100);
		visualizarMatriz(tabla);
		int suma,sumaMayor=0,filaMasSuma=0;
		for (int i = 0; i < tabla.length; i++) {
			suma=0;
			for (int j = 0; j < tabla[i].length; j++) {
			suma+=tabla[i][j];	
			}
			if (suma>sumaMayor) {
				sumaMayor=suma;
				filaMasSuma=i;
				
			}
		}
		System.out.println();
		verUnaFila(filaMasSuma, tabla);
		System.out.println("\n"+"Que suma "+sumaMayor);
	}

}