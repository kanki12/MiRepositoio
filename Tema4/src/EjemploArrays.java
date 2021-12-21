
public class EjemploArrays {

	public static void main(String[] args) {
		int tamaño=7;
		double [] cesta=new double[tamaño];//Esto es una array de 11 de longitud del 0,1,2....10
		boolean [] compro=new boolean[tamaño];
		for (int i = 0; i < cesta.length; i++) {//Recorrido de la array cesta con nº random
			cesta[i]=(Math.round((Math.random()*100)*100)/100);
			System.out.print(cesta[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < compro.length; i++) {//Recorrido de la array compro
			if (((int)(Math.random()*10))%2!=0){
				compro[i]=true;
			}
			System.out.print(compro[i]+"\t");
		}
		System.out.println();
		double total=0;
		for (int i = 0; i < compro.length; i++) {
			if (compro[i])
			total+=cesta[i];
		}
		System.out.println(total);
	}

}
