package algoritmos;

public class MergeSort {

	public void ordenar(int[] v, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim)/2;
			ordenar(v, inicio, meio);
			ordenar(v, meio + 1, fim);
			unir(v, inicio, meio, fim);
		}
	}
	
	private void unir(int[] array, int inicio, int meio, int fim){
		//inicializando tamanhos
		int tamanhoEsquerda = meio - inicio + 1;
        int tamanhoDireita = fim - meio;
        
        //inicializando vetores de trabalho
        int[] esquerda = new int[tamanhoEsquerda + 1];
        int[] direita = new int[tamanhoDireita + 1];

        //copiando dados para o vetor de trabalho esquerdo
        for(int i = 0; i < tamanhoEsquerda; i++){
            esquerda[i] = array[inicio + i];
        }
        //copiando dados para o vetor de trabalho direito
        for(int j = 0; j < tamanhoDireita; j++){
            direita[j] = array[meio + j + 1];
        }

        esquerda[tamanhoEsquerda] = Integer.MAX_VALUE;	// null indicates infinity
        direita[tamanhoDireita] = Integer.MAX_VALUE;
        
        int i = 0,  j = 0;

        for(int k = inicio; k <= fim; k++){
            if(esquerda[i] <= direita[j]){
                array[k] = esquerda[i++];
            }else{
                array[k] = direita[j++];
            }
        }
	}

}
