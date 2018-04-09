package algoritmos;

import util.Imprimir;

public class TestaBinario {
	
	public static void main(String[] args) {
		int[] v1 = {0,0,1,1};
		int[] v2 = {1,1,1,1};
		
		int valor = 50;
		System.out.println(Integer.toBinaryString(valor));
		
		Binario b = new Binario();
		
		int[] v3 =  b.soma(v1, v2);
		Imprimir.imprimir(v3);
	}

}
