package prova20181;

import estruturas.Elemento;
import estruturas.PilhaCheiaException;
import estruturas.PilhaVaziaException;

public class TestaQuestao1 {
	
	public static void main(String[] args) {
		Questao1 ll = new Questao1();
		ll.inserir(new Elemento(8));
		ll.inserir(new Elemento(3));
		ll.inserir(new Elemento(1));
		ll.inserir(new Elemento(6));
		ll.inserir(new Elemento(9));
		ll.imprimir();
		
		try {
			ll.inverter();
		} catch (PilhaVaziaException | PilhaCheiaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		ll.imprimir();
		
	}

}
