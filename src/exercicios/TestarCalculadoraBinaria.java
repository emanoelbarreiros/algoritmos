package exercicios;

import util.Imprimir;

public class TestarCalculadoraBinaria {

	public static void main(String[] args) {
		CalculadoraBinaria calc = new CalculadoraBinaria();
		
		int[] resultado = calc.somar(new int[]{0, 1, 1, 0}, new int[]{1, 1, 1, 1});
		
		Imprimir.imprimir(resultado);
	}

}
