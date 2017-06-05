package algoritmos;

import util.Imprimir;

public class TesteCountingSort {
	
	public static void main(String[] args) {
		int[] valores = {1, 3, 5, 1, 2, 5, 6, 8, 8, 8, 10};
		
		CountingSort cs = new CountingSort();
		int[] resultado = cs.ordenar(valores, 10);
		
		Imprimir.imprimir(resultado);
	}

}
