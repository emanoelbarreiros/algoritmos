package algoritmos;

public class Binario {
	
	public int[] soma(int[] v1, int[] v2) {
		int[] resultado = new int[v1.length + 1];
		int temp = 0;
		int carry = 0;
		for(int i = v1.length - 1; i >= 0; i--) {
			temp = v1[i] + v2[i] + carry;
			if (temp < 2) {
				resultado[i+1] = temp;
				carry = 0;
			} else if (temp == 2) {
				resultado[i+1] = 0;
				carry = 1;
			} else {
				resultado[i+1] = 1;
				carry = 1;
			}
		}
		resultado[0] = carry;
		
		return resultado;
	}

}
