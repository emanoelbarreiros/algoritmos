package estruturas;

public class Fila {
	
	int cauda = -1;
	int[] vetor = new int[10];
	
	public void inserir(int elemento) {
		if (cauda + 1 <= vetor.length - 1) {
			vetor[++cauda] = elemento;
		} else {
			throw new FilaCheiaException();
		}
	}
	
	public int remover() {
		int aux = vetor[0];
		for (int i = 0; i < cauda - 1; i++) {
			vetor[i] = vetor[i + 1];
		}
		return aux;
	}

}
