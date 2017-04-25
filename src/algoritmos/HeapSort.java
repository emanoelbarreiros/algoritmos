package algoritmos;

public class HeapSort {
	
	private int[] valores;
	private int heapSize;
	
	public void ordenar(int[] valores) {
		construirHeap(valores);
		for (int i = valores.length - 1; i >= 1; i--) {
			substituir(0, i);
			heapSize--;
			manterHeap(0);
		}
	}
	
	public void manterHeap(int pai){
		int e = esquerda(pai);
		int d = direita(pai);
		int maior = 0;
		if (e <= this.heapSize - 1 
				&& valores[e] > valores[pai]) {
			maior = e;
		} else {
			maior = pai;
		}
		if (d <= this.heapSize - 1 
				&& valores[d] > valores[maior]) {
			maior = d;
		} 
		
		if (maior != pai) {
			substituir(pai, maior);
			manterHeap(maior);
		}
	}
	
	public void construirHeap(int[] valores){
		this.valores = valores;
		this.heapSize = valores.length;
		for (int i = valores.length/2 - 1; i >= 0; i--) {
			manterHeap(i);
		}
	}
	
	private int esquerda(int i) {
		return 2*i + 1;
	}
	
	private int direita(int i) {
		return 2*i + 2;
	}
	
	private int pai(int i) {
		return (i - 1)/2;
	}
	
	public void substituir(int p1, int p2) {
		int temp = valores[p1];
		valores[p1] = valores[p2];
		valores[p2] = temp;
	}

}
