package prova20181;

import estruturas.Elemento;
import estruturas.ListaLigada;
import util.Imprimir;

public class TestaDaniel {
	
	public static void main(String[] args) {
		DanielQuestao1 q = new DanielQuestao1();
		ListaLigada l = new ListaLigada();
		l.inserir(new Elemento(1));
		l.inserir(new Elemento(2));
		l.inserir(new Elemento(3));
		l.inserir(new Elemento(4));
		
		Imprimir.imprimir(l);
		q.inverter(l);
		Imprimir.imprimir(l);
		
		
	}

}
