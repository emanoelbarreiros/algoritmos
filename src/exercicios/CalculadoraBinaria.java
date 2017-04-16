package exercicios;

public class CalculadoraBinaria {

	public int[] somar(int[] v1, int[] v2) {
		if (v1.length != v2.length) {
			return null;
		}
		
		int[] retorno = new int[v1.length + 1];
		int carry = 0;
		int temp = 0;
		
		for (int i = v1.length - 1; i >= 0; i--) {
			temp = v1[i] + v2[i] + carry;
			
			if(temp > 2) {
				retorno[i+1] = 1;
				carry = 1;
			} else if (temp > 1){
				retorno[i+1] = 0;
				carry = 1;
			} else {
				retorno[i+1] = temp;
				carry = 0;
			}
		}
		
		retorno[0] = carry;
		
		return retorno;
	}

}
