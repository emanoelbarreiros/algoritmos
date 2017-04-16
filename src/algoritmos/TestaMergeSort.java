package algoritmos;

import util.Imprimir;

public class TestaMergeSort {

	public static void main(String[] args) {
		int[] v = {5, 1, 7, 6, 2, 4, 3, 5};
		
		MergeSort alg = new MergeSort();
		alg.ordenar(v, 0, v.length - 1);
		
		Imprimir.imprimir(v);
	}

}
