package algoritmos;

import util.Imprimir;

public class TestaBubbleSort {
	
	public static void main(String[] args) {
		int[] valores = {5,1,6,3,9,7,10};
		
		BubbleSort b = new BubbleSort();
		int[] resultado = b.ordenar(valores);
		
		Imprimir.imprimir(resultado);
	}

}
