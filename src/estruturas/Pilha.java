package estruturas;

public class Pilha {
	
	int[] vetor = new int[10];
	int topo = -1;
	
	public int pop(){
		int aux = topo;
		topo--;
		return vetor[aux];
	}
	
	public int pop2(){
		if (topo >= 0) {
			return vetor[topo--];
		} else {
			throw new PilhaVaziaException();
		}
	}
	
	public void push(int valor) throws PilhaCheiaException{
		if (topo + 1 <= vetor.length - 1) {
			vetor[++topo] = valor;
		} else {
			throw new PilhaCheiaException();
		}
		
	}

}
