package algoritmos.grafos;

public class TestaBuscaEmProfundidade {

	public static void main(String[] args) {
		
		GrafoAdjacencia g = new GrafoAdjacencia(4);
		
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
		
		b.executar(g);
		
		System.out.println(g);
		
		g.imprimirCaminho(g.obterVertice(0), g.obterVertice(2));
	}

}
