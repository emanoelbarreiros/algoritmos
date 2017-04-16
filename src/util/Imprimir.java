package util;

public class Imprimir {

	public Imprimir() {
		// TODO Auto-generated constructor stub
	}

	public static void imprimir(int[] v) {
		System.out.print("[ ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			if (i < v.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
	}

}
