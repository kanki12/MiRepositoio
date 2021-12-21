
public class EjercicioArrayBidi {

	
	
	private static void verArrayBidim(int[][] vector) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				System.out.print(vector[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int filas=5,cols=7,num=filas*cols;
		int[][] array1=new int [filas][cols];
		for (int columna = 0; columna < cols; columna++) {
			for (int fila = 0; fila < filas; fila++) {
				array1[fila][columna]=num;
				num--;
			}
		}
		verArrayBidim(array1);
	}
	

}
