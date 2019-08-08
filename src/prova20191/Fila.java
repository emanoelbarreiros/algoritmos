package prova20191;

import java.util.Arrays;

public class Fila {
	
	int[] vetor = new int[10];
	int cauda = vetor.length;
	
	public void inserir(int elemento) {
		if (cauda - 1 >= 0) {
			vetor[--cauda] = elemento;
		} else {
			throw new RuntimeException();
		}
	}
	
	public int remover() {
		int aux = vetor[vetor.length - 1];
		for (int i = vetor.length - 1; i > cauda - 1; i--) {
			vetor[i] = vetor[i - 1];
		}
		vetor[cauda++] = 0;
		return aux;
	}
	
	public void imprimir() {
		System.out.println(Arrays.toString(vetor));
	}

}
