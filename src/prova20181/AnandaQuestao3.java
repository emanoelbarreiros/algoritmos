package prova20181;

public class AnandaQuestao3 {
	
	public int fat (int n ) {
		if (n==0) {
			return 0;
		} 
		if ( n == 1) {
			return 1;
		}
		int fator = n* fat(n-1);
		if (n==2) {
			return 2;
		} else {
			return fat(n)*fator;
		}
	}

}
