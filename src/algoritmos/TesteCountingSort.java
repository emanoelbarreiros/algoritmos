package algoritmos;

import util.Imprimir;

public class TesteCountingSort {
	
	public static void main(String[] args) {
		int[] valores = {0, 3, 5, 1, 2, 9, 6, 7, 8, 11, 10};
		
		CountingSort cs = new CountingSort();
		int[] resultado = cs.ordenar(valores, 11);
		
		Imprimir.imprimir(resultado);
	}

}
