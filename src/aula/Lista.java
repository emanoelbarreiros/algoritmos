package aula;

public class Lista<T> {
	
	private Elemento<T> primeiro;

	public Lista() {
	}
	
	public void inserir(T e) {
		if(primeiro == null) {
			primeiro = new Elemento(e);
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

}
