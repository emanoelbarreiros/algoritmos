package prova20191;

public class TesteFila {
	
	public static void main(String[] args) {
		Fila f = new Fila();
		
		f.inserir(6);
		f.inserir(8);
		f.inserir(1);
		f.inserir(2);
		f.inserir(4);
		
		f.imprimir();
		
		int removido = f.remover();
		System.out.println("removido: " + removido);
		f.imprimir();
		
		removido = f.remover();
		System.out.println("removido: " + removido);
		f.imprimir();
	}

}
