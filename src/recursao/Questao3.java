package recursao;

public class Questao3 {
	
	public static void main(String[] bolinha) {
		int valor = 123;
		System.out.println(inverter(valor));
	}
	
	public static int inverter(int valor) {
		int ultimoDigito = valor % 10;
		int digitosDaFrente = valor / 10;
		int qtdDigitos = (int)Math.floor(Math.log10(digitosDaFrente)) + 1;
		
		if (valor < 10) {
			return valor;
		} else {
			return ultimoDigito*((int)Math.pow(10, qtdDigitos)) + inverter(digitosDaFrente);
		}
	}

}
