package algoritmos.grafos;

public class TestaBuscaEmLargura {

	public static void main(String[] args) {
		Grafo g = new Grafo();

		g.adicionarVertice(0);
		g.adicionarVertice(1);
		g.adicionarVertice(2);
		g.adicionarVertice(3);
		g.adicionarVertice(4);
		g.adicionarVertice(5);
		g.adicionarVertice(6);
		g.adicionarVertice(7);

		g.adicionarAresta(0, 5);
		g.adicionarAresta(5, 4);
		g.adicionarAresta(4, 0);
		g.adicionarAresta(1, 0);
		g.adicionarAresta(1, 2);
		g.adicionarAresta(1, 4);
		g.adicionarAresta(1, 3);
		g.adicionarAresta(3, 6);
		g.adicionarAresta(6, 7);
		g.adicionarAresta(6, 4);

		BuscaEmLargura b = new BuscaEmLargura();

		b.executar(g);

		System.out.println(g);

		//g.imprimirCaminho(g.obterVertice(0), g.obterVertice(2));
	}

}
