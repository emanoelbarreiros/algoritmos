package aula;

public class TestaPilha {
	public static void main(String[] args) {
		Pilha p = new Pilha(5);
		
		try {
			p.push(1);
			p.push(2);
			p.push(3);
			p.push(4);
			p.push(5);
			p.push(6);
		} catch (PilhaCheiaException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(p.pop());
			System.out.println(p.pop());
			System.out.println(p.pop());
			System.out.println(p.pop());
			System.out.println(p.pop());
			System.out.println(p.pop());
		} catch (PilhaVaziaException e) {
			System.out.println(e.getMessage());
		}
	}

}
