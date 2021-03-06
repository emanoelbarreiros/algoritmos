package estruturas;

public class ListaLigada {
	
	private Elemento primeiro;
	
	public void inserir(Elemento elemento) {
		if (primeiro == null) {
			primeiro = elemento;
		} else {
			Elemento elementoAtual = primeiro;
			while (elementoAtual.getProximo() != null) {
				elementoAtual = elementoAtual.getProximo();
			}
			elementoAtual.setProximo(elemento);
			
		}
	}

	public Elemento getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}
	
	public void imprimir() {
		Elemento elementoAtual = primeiro;
		System.out.println(elementoAtual.getValor());
		while (elementoAtual.getProximo() != null) {
			elementoAtual = elementoAtual.getProximo();
			System.out.println(elementoAtual.getValor());
		}
	}

}
