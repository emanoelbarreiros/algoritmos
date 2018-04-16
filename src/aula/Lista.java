package aula;

public class Lista<T extends Procuravel> {
	
	private Elemento<T> primeiro;

	public Lista() {
	}
	
	public void inserir(T e) {
		if(primeiro == null) {
			primeiro = new Elemento<T>(e);
		} else {
			Elemento<T> proximo = primeiro.getProximo();
			Elemento<T> anterior = primeiro;
			while(proximo != null) {
				anterior = proximo;
				proximo = proximo.getProximo();
			}
			anterior.setProximo(new Elemento(e));
		}
	}
	
	public void imprimir() {
		StringBuffer buffer = new StringBuffer();
		if (primeiro != null) {
			buffer.append(primeiro.getV());
			buffer.append(";");
			
			Elemento<T> proximo = primeiro.getProximo();			
			while(proximo != null) {
				buffer.append(proximo.getV());
				buffer.append(";");
				proximo = proximo.getProximo();
			}
		}
		System.out.println(buffer.toString());
	}
	
	public T procurar(String chave) {
		if (primeiro != null) {
			if (primeiro.getV().getChave().equals(chave)) {
				return primeiro.getV();
			}
			
			Elemento<T> proximo = primeiro.getProximo();
			while(proximo != null && !proximo.getV().getChave().equals(chave)) {
				proximo = proximo.getProximo();
			}
			
			if(proximo != null) {
				return proximo.getV();
			} 
		}
		return null;
	}
}
