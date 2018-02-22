package algoritmos;

public class CountingSort {
	
	public int[] ordenar(int[] entrada, int k){
		int[] c = new int[k+1];
		
		for (int j = 0; j < entrada.length; j++){
			c[entrada[j]] = c[entrada[j]] + 1;
		}
		
		for (int i = 1; i < c.length; i++) {
			c[i] = c[i] + c[i - 1];
		}
		
		int[] saida = new int[entrada.length];
		
		for (int j = entrada.length - 1; j >= 0; j--){
			saida[c[entrada[j]] - 1] = entrada[j];
			c[entrada[j]] = c[entrada[j]] - 1;
		}
		
		return saida;
	}
	
	public void doNothing() {
		int a = 20;
		int b = 30;
		return;
	}

}
