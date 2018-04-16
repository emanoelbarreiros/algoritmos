package aula;

public class TestaFila {
	
	public static void main(String[] args) {
		Fila f = new Fila(5);
		
		try {
			f.inserir(1);
			f.inserir(2);
			f.inserir(3);
			f.inserir(4);
			f.inserir(5);
		} catch (FilaCheiaException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(f.remover());
			System.out.println(f.remover());
			f.inserir(6);
			f.inserir(7);
			System.out.println(f.remover());
			System.out.println(f.remover());
			System.out.println(f.remover());
			
		} catch (FilaVaziaException e) {
			System.out.println(e.getMessage());
		} catch (FilaCheiaException e) {
			System.out.println(e.getMessage());
		}
	}

}
