package algoritmos;

public class Busca {
	
	public int busca(int[] a, int v) {
		int local = -1;
		for(int i = a.length - 1; i >= 0; i--) {
			if(a[i] == v) {
				local = i;
			}
		}
		return local;
	}
}
