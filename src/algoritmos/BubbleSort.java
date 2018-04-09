package algoritmos;

public class BubbleSort {
	
	public int[] ordenar(int[] valores) {
		boolean trocado;
		do {
			trocado = false;
			for (int i = 1; i < valores.length; i++) {
				if(valores[i] < valores[i-1]) {
					int temp = valores[i-1];
					valores[i-1] = valores[i];
					valores[i] = temp;
					trocado = true;
				}
			}
		} while(trocado);
		
		return valores;
	}
}
