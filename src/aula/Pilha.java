package aula;

public class Pilha {

	private int[] elementos;
	private int topo;

	public Pilha(int tamanho) {
		elementos = new int[tamanho];
		topo = 0;
	}

	public void push(int elemento) throws PilhaCheiaException{
		if (topo < elementos.length) {
			elementos[topo++] = elemento;
		} else {
			throw new PilhaCheiaException();
		}
	}

	public int pop() throws PilhaVaziaException{
		if (topo > 0) {
		return elementos[--topo];
		} else {
			throw new PilhaVaziaException();
		}
	}

}
