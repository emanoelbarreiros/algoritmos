package prova20181;

import algoritmos.QuickSort;
import estruturas.Elemento;
import estruturas.ListaLigada;

public class Questao2 extends ListaLigada {
	
	public void ordernar() {
		Integer[] aux = new Integer[tamanho()];
		int indice = 0;
		
		Elemento elem = getPrimeiro();
		while (elem != null) {
			aux[indice++] = elem.getValor();
			elem = elem.getProximo();
		}
		
		QuickSort qs = new QuickSort();
		qs.ordenar(aux, 0, aux.length - 1);
		
		setPrimeiro(null);
		
		for (int i = 0; i < aux.length; i++) {
			inserir(new Elemento(aux[i]));
		}
	}
	
	public int tamanho() {
		Elemento elem = getPrimeiro();
		int tam = 0;
		while (elem != null) {
			tam++;
			elem = elem.getProximo();
		}
		return tam;
	}

}
