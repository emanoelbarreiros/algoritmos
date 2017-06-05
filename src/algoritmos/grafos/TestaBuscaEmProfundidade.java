package algoritmos.grafos;

public class TestaBuscaEmProfundidade {

	public static void main(String[] args) {
		
		Grafo g = new Grafo();
		
		g.adicionarVertice(0);
		g.adicionarVertice(1);
		g.adicionarVertice(2);
		g.adicionarVertice(3);
		
		g.adicionarAresta(0, 1);
		g.adicionarAresta(1, 2);
		g.adicionarAresta(2, 2);
		g.adicionarAresta(2, 0);
		g.adicionarAresta(3, 1);
		
		BuscaEmProfundidade b = new BuscaEmProfundidade();
		
		b.bep(g);
		
		System.out.println(g);
	}

}
