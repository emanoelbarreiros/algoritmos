package aula;

public class Elemento<T> {
	
	private T v;
	private Elemento<T> proximo;

	public Elemento(T valor) {
		this.v = valor;
	}

	public T getV() {
		return v;
	}

	public void setV(T v) {
		this.v = v;
	}

	public Elemento<T> getProximo() {
		return proximo;
	}

	public void setProximo(Elemento<T> proximo) {
		this.proximo = proximo;
	}
}
