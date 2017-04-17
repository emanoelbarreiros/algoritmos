package estruturas;

import util.Imprimir;

public class TestaListaLigada {
	
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.inserir(new Elemento(1));
		lista.inserir(new Elemento(2));
		lista.inserir(new Elemento(3));
		lista.inserir(new Elemento(4));
		
		Imprimir.imprimir(lista);
	}

}
