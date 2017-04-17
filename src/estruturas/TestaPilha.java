package estruturas;

public class TestaPilha {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		try {
			p.push(1);
			p.push(2);
			p.push(3);
			p.push(4);
			p.push(5);
			p.push(6);
			p.push(7);
			p.push(8);
			p.push(9);
			p.push(10);
			p.push(11);
		} catch(PilhaCheiaException e) {
			System.out.println("eu já disse que a pilha ta cheia!!!!");
		}
		
		try {
			System.out.println(p.pop2());
			System.out.println(p.pop2());
			System.out.println(p.pop2());
			System.out.println(p.pop2());
			System.out.println(p.pop2());
			System.out.println(p.pop2());
		} catch (PilhaVaziaException e) {
			System.out.println("seu mamao, vc nao pode remover de uma pilha vazia. ta ligado?");
		}
	}

}
