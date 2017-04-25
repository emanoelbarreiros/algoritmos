package algoritmos;

import util.Imprimir;

public class TestaHeapSort {
	
	public static void main(String[] args) {
		//int[] valores = {0, 3, 5, 1, 2, 9, 6, 7, 8,11, 10};
		int[] valores = {0, 3, 5, 1, 2, 9};
		
		HeapSort hs = new HeapSort();
		hs.ordenar(valores);
		
		Imprimir.imprimir(valores);
	}

}
