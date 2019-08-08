package prova20191;

public class Questao2 {
	
	public static void ordenar(int[] v) {
		int menor;
		int temp;
		for (int j = 0; j < v.length; j++) {
			menor = j;
			for (int i = j; i < v.length; i++) {
				if (v[i] < v[menor]) {
					menor = i;
				}
			}
			//trocar de posicoes
			temp = v[j];
			v[j] = v[menor];
			v[menor] = temp;
		}
	}
}
