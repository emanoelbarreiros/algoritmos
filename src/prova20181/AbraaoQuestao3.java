package prova20181;

public class AbraaoQuestao3 {
	
	public static int sf (int n, int m) {
		if (m == 1) {
			return 1;
		}
		if (n == 1) {
			return sf (m-1, m-1);
		}
		return n*sf(n-1,m);
	}
	
	public static int superfat(int n) {
		return sf(n, n);
	}

}
