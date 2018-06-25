package prova20181;

import estruturas.Elemento;
import estruturas.ListaLigada;
import estruturas.Pilha;
import estruturas.PilhaCheiaException;
import estruturas.PilhaVaziaException;

public class Questao1 extends ListaLigada{
	
	public void inverter() throws PilhaCheiaException, PilhaVaziaException {
		Elemento elemento = getPrimeiro();
		Pilha pilha = new Pilha();
		while (elemento != null) {
			pilha.push(elemento.getValor());
			elemento = elemento.getProximo();
		}
		
		setPrimeiro(null);
		
		int valor;
		while (!pilha.vazia()) {
			valor = pilha.pop();
			inserir(new Elemento(valor));
		}
	}

}
