package algoritmos.grafos;

import java.util.List;

import util.Imprimir;

public class TestaKruskal {

	public static void main(String[] args) {
		Grafo g = new Grafo();
		
		g.adicionarVertice(1);
		g.adicionarVertice(2);
		g.adicionarVertice(3);
		g.adicionarVertice(4);
		g.adicionarVertice(5);
		g.adicionarVertice(6);
		g.adicionarVertice(7);
		g.adicionarVertice(8);
		g.adicionarVertice(9);
		
		g.adicionarAresta(1, 2, 4);
		g.adicionarAresta(2, 3, 8);
		g.adicionarAresta(3, 4, 7);
		g.adicionarAresta(4, 5, 9);
		g.adicionarAresta(5, 6, 10);
		g.adicionarAresta(6, 3, 4);
		g.adicionarAresta(6, 4, 14);
		g.adicionarAresta(6, 7, 2);
		g.adicionarAresta(7, 8, 1);
		g.adicionarAresta(7, 9, 6);
		g.adicionarAresta(9, 3, 2);
		g.adicionarAresta(8, 9, 7);
		g.adicionarAresta(8, 1, 8);
		g.adicionarAresta(8, 2, 11);
		
		Kruskal k = new Kruskal();
		List<Aresta> arestas = k.executar(g);
		
		Imprimir.imprimir(arestas);
		
	}
	
}
