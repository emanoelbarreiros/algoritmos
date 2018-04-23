package aula;

public class TestaLista {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("11111111111", "emanoel");
		Pessoa p2 = new Pessoa("22222222222", "hermyson");
		Pessoa p3 = new Pessoa("33333333333", "rodrigo");
		Pessoa p4 = new Pessoa("44444444444", "ananda");
		Pessoa p5 = new Pessoa("55555555555", "adjailson");
		Pessoa p6 = new Pessoa("66666666666", "samuel");
		//Pessoa p7 = new Pessoa("66666666666", "samuel");
		
		//System.out.println(p6.equals(p7));
		
		Lista<Pessoa> l = new Lista<Pessoa>();
		
		l.inserir(p1);
		l.inserir(p2);
		l.inserir(p3);
		l.inserir(p4);
		l.inserir(p5);
		l.inserir(p6);
		l.inserir(p3);
		
		l.imprimir();
		
		l.excluir(p3);
		l.imprimir();
		
		//System.out.println(l.procurar("00000000000"));
		
	}

}
