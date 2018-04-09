package recursao;

public class Questao4 {
	
	public static void main(String[] args) {
		int[] vet = {1,2,3,4,5};
		int resultado = somar(vet);
		System.out.println(resultado);
		
		int resultado2 = somar(vet, 0);
		System.out.println(resultado2);
	}
	
	public static int somar(int[] vetor) {
		if (vetor.length > 1) {
			int[] novoVetor = new int[vetor.length - 1];
			for (int i = 0; i < novoVetor.length; i++) {
				novoVetor[i] = vetor[i+1];
			}
			return vetor[0] + somar(novoVetor);
		} else {
			return vetor[0];
		}
	}
	
	public static int somar(int[] vetor, int indice) {
		if (indice < vetor.length) {
			return vetor[indice] + somar(vetor, indice+1);
		} else {
			return 0;
		}
	}
	
}
