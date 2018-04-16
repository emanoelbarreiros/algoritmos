package aula;

import java.util.ArrayList;

public class Fila {
	
	private int[] elementos;
	private int cauda;
	
	public Fila(int tamanho) {
		elementos = new int[tamanho];
		cauda = 0;
	}
	
	public void inserir(int elemento) throws FilaCheiaException {
		if (cauda < elementos.length) {
			elementos[cauda++] = elemento;
		} else {
			throw new FilaCheiaException();
		}
	}
	
	public int remover() throws FilaVaziaException{
		if (cauda > 0) {
			int retorno = elementos[0];
			for (int i = 1; i < cauda; i++) {
				elementos[i-1] = elementos[i];
			}
			cauda--;
			return retorno;
		} else {
			throw new FilaVaziaException();
		}
		
	}

}
