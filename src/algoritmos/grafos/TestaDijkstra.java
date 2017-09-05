package algoritmos.grafos;

public class TestaDijkstra {
	
	public static void main(String[] args) {
		Grafo g = new Grafo();
		
		g.adicionarVertice(0);
		g.adicionarVertice(1);
		g.adicionarVertice(2);
		g.adicionarVertice(3);
		g.adicionarVertice(4);
		
		
		g.adicionarAresta(0, 1, 1);
		g.adicionarAresta(0, 3, 3);
		g.adicionarAresta(0, 4, 10);
		g.adicionarAresta(1, 2, 5);
		g.adicionarAresta(2, 4, 1);
		g.adicionarAresta(3, 2, 2);
		g.adicionarAresta(3, 4, 6);
		
		
		Dijkstra d = new Dijkstra();
		
		d.executar(g, 0);
		
		System.out.println(g);
	}

}
