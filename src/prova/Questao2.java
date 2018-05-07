package prova;

public class Questao2 {
	public static void main(String[] args) {
		int[] v = {1,2,4,6,7,9,5,3,1};
		for(int i = 0; i< v.length;i++) {
			if(v[i]>v[i+1]) {
				System.out.println(v[i]);
				break;
			}
		}
	}

}
