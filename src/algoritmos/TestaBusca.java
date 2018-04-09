package algoritmos;

public class TestaBusca {

	public static void main(String[] args) {
		Busca b= new Busca();
		
		int[] a = {5,3,2,1,9,3};
		
		int retorno = b.busca(a, 3);
		System.out.println(retorno);

	}

}
