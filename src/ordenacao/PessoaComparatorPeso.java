package ordenacao;

import java.util.Comparator;

public class PessoaComparatorPeso implements Comparator<Pessoa> {
	
	public int compare(Pessoa p1, Pessoa p2) {
		return (int)(p1.getPeso() - p2.getPeso());
	}

}
