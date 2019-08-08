package ordenacao;

public class Pessoa implements Comparable<Pessoa> {
	
	private int idade;
	private float peso;
	
	public Pessoa(int idade, float peso) {
		this.idade = idade;
		this.peso = peso;
	}
	
	public int compareTo(Pessoa p) {
		return this.idade - p.getIdade();
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String toString() {
		return String.valueOf(idade) + " - " + String.valueOf(peso);
	}

}
