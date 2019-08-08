package prova20191;

import java.util.Stack;

public class Questao1 {
	
	public static void inverter(int[] sequencia) {
		Stack<Integer> pilha = new Stack<Integer>(); 
		for (int i = 0; i < sequencia.length; i++) {
			pilha.push(sequencia[i]);
		}
		
		for (int i = 0; i < sequencia.length; i++) {
			sequencia[i] = pilha.pop();
		}
	}

}
