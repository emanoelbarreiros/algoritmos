package algoritmos;

import util.Imprimir;

public class TestaInsertionSort {

	public static void main(String[] args) {
		int[] v = {4, 2, 6, 7, 1, 9, 3};
		
		InsertionSort algoritmo = new InsertionSort();
		
		int[] resultado = algoritmo.ordenar(v);
		
		Imprimir.imprimir(resultado);
	}

}
