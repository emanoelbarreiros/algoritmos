package aula;

public class Pessoa extends Procuravel{
	
	private String cpf;
	private String nome;

	public Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getChave() {
		return this.cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return cpf + "-"+ nome;
	}
	
	public boolean equals(Object outro) {
		return this.cpf.equals(((Pessoa)outro).getCpf());
	}
}
