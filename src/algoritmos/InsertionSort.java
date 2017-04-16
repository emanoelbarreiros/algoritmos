package algoritmos;

public class InsertionSort {

	public int[] ordenar(int[] v) {
		int chave = 0;
		int i = 0;
		for (int j = 1; j < v.length; j++) {
			chave = v[j];
			i = j - 1;
			while (i >= 0 && v[i] > chave) {
				v[i + 1] = v[i];
				i = i - 1;
			}
			v[i + 1] = chave;
		}
		
		return v;
	}

}
