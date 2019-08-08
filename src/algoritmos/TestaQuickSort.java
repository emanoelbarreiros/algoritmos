package algoritmos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import util.Imprimir;

public class TestaQuickSort {

	public static void main(String[] args) {
		ArrayList<Integer> entrada = new ArrayList();
		for (int i = 0; i < 1000000; i++) {
			entrada.add(i);
		}
		
		Collections.shuffle(entrada);
		Imprimir.imprimir(entrada);
		Integer[] entrada2 = new Integer[1000000];
		entrada2 = entrada.toArray(entrada2);
		
		QuickSort q = new QuickSort();
		q.ordenar(entrada2, 0, entrada2.length - 1);
		
		Imprimir.imprimir(entrada2);
	}

}
