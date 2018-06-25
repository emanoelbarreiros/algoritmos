package prova20181;

public class Questao3 {
	
	public int superfatorial(int n) {
		if (n == 1) {
			return fatorial(1);
		} else {
			return fatorial(n) * superfatorial(n-1);
		}
	}
	
	public int fatorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fatorial(n-1);
		}
			
	}

}
