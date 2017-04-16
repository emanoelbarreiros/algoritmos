package algoritmos;

import util.Imprimir;

public class TestaQuickSort {

	public static void main(String[] args) {
		int[] entrada = {4, 1, 7, 2, 1, 9, 6, 13, 10};
		
		QuickSort q = new QuickSort();
		
		q.ordenar(entrada, 0, entrada.length - 1);
		
		Imprimir.imprimir(entrada);
	}

}
