package prova20181;

import estruturas.Elemento;
import estruturas.ListaLigada;
import estruturas.PilhaVaziaException;

public class Questao4 {

	ListaLigada ll = new ListaLigada();

	public void push(int n) {
		ll.inserir(new Elemento(n));
	}

	public int pop() throws PilhaVaziaException {
		Elemento elem = ll.getPrimeiro();
		if (elem != null) {
			Elemento anterior = null;
			while (elem.getProximo() != null) {
				anterior = elem;
				elem = elem.getProximo();
			}
			if (anterior != null) {
				anterior.setProximo(null);
			} else {
				ll.setPrimeiro(null);
			}
			return elem.getValor();
		} else {
			throw new PilhaVaziaException();
		}
	}

}
