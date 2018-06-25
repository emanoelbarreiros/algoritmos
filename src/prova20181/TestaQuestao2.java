package prova20181;

import estruturas.Elemento;

public class TestaQuestao2 {
	
	public static void main(String[] args) {
		Questao2 ll = new Questao2();
		ll.inserir(new Elemento(8));
		ll.inserir(new Elemento(3));
		ll.inserir(new Elemento(1));
		ll.inserir(new Elemento(6));
		ll.inserir(new Elemento(9));
		ll.imprimir();
		
		System.out.println();
		ll.ordernar();
		ll.imprimir();
	}

}
