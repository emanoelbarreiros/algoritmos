package ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestaPessoa {
	
	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa(20, 90f));
		pessoas.add(new Pessoa(30, 85.6f));
		pessoas.add(new Pessoa(14, 71.2f));
		pessoas.add(new Pessoa(11, 44.9f));
		pessoas.add(new Pessoa(2, 10.1f));
		pessoas.add(new Pessoa(21, 77.0f));
		
		System.out.println(Arrays.toString(pessoas.toArray()));
		
		Collections.sort(pessoas);
		//pessoas.sort(new PessoaComparatorPeso());
		
		System.out.println(Arrays.toString(pessoas.toArray()));
	}

}
