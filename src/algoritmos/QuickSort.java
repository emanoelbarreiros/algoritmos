package algoritmos;

public class QuickSort {

	public void ordenar(Integer[] v, int inicio, int fim) {
		if (inicio < fim) {
			int meio = particionar(v, inicio, fim);
			ordenar(v, inicio, meio - 1);
			ordenar(v, meio + 1, fim);
		}
	}
	
	public int particionar(Integer[] v, int inicio, int fim) {
		int pivo = v[fim];
		int i = inicio - 1;
		for (int j = inicio; j <= fim - 1; j++) {
			if(v[j] <= pivo) {
				i++;
				substituir(v, i, j);
			}
		}
		substituir(v, i + 1, fim);
		return i + 1;
	}
	
	public void substituir(Integer[] v, int p1, int p2) {
		int temp = v[p1];
		v[p1] = v[p2];
		v[p2] = temp;
	}

}
