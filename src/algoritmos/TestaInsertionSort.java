package algoritmos;

import util.Imprimir;

public class TestaInsertionSort {

	public static void main(String[] args) {
		int[] v = {3,1,2,6,5,4};
		
		InsertionSort algoritmo = new InsertionSort();
		
		int[] resultado = algoritmo.ordenar(v);
		
		Imprimir.imprimir(resultado);
	}

}
