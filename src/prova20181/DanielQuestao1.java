package prova20181;

import estruturas.Elemento;
import estruturas.ListaLigada;

public class DanielQuestao1 extends ListaLigada{
	
	public void inverter(ListaLigada lista) {
		Elemento ultimo = lista.getPrimeiro();
		Elemento proximo = ultimo.getProximo();
		Elemento primeiro;
		
		int cont = 2;
		while(proximo.getProximo() != null) {
			ultimo = proximo;
			proximo = proximo.getProximo();
			cont++;
		}
		
		int controle = 1;
		primeiro = proximo;
		
		while(controle < cont) {
			ultimo = lista.getPrimeiro();
			proximo = ultimo.getProximo();
			while(proximo.getProximo() != null) {
				ultimo = proximo;
				proximo = proximo.getProximo();
			}
			
			Elemento penultimo = ultimo;
			ultimo = proximo;
			ultimo.setProximo(penultimo);
			penultimo.setProximo(null);
			controle++;
		}
		lista.setPrimeiro(primeiro);
	}

}
