package prova20181;

public class TestaQuestao4 {
	
	public static void main(String[] args) {
		Questao4 pilha = new Questao4();
		
		pilha.push(8);
		pilha.push(3);
		pilha.push(1);
		pilha.push(6);
		pilha.push(9);
		
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
	}

}
