
public class cuatrobiii {
	
	private static void visualizarMatriz(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int filas=3, aux;
		int [][] tabla=new int [filas][filas];
		int inicial=1;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j]=inicial;
				inicial++;
			}
		}
		visualizarMatriz(tabla);
		for (int i = 0; i < tabla.length; i++) {
			for (int j = i+1; j < tabla.length; j++) {
				aux=tabla[i][j];
				tabla[i][j]=tabla[j][i];
				tabla[j][i]=aux;
			}
		}
		System.out.println("Despues de trasponer");
		visualizarMatriz(tabla);
	}

}
