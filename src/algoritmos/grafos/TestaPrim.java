package algoritmos.grafos;

import java.util.ArrayList;

import util.Imprimir;

public class TestaPrim {

	public static void main(String[] args) {
		Grafo g = new Grafo();
		
		/*
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
		*/
		
		g.adicionarVertice(0);
		g.adicionarVertice(1);
		g.adicionarVertice(2);
		g.adicionarVertice(3);
		g.adicionarVertice(4);
		g.adicionarVertice(5);
		
		g.adicionarAresta(0, 1, 6);
		g.adicionarAresta(0, 2, 1);
		g.adicionarAresta(0, 3, 5);
		g.adicionarAresta(1, 2, 2);
		g.adicionarAresta(2, 3, 2);
		g.adicionarAresta(1, 4, 5);
		g.adicionarAresta(2, 4, 6);
		g.adicionarAresta(2, 5, 4);
		g.adicionarAresta(3, 5, 4);
		g.adicionarAresta(4, 5, 3);
		
		
		Prim prim = new Prim();
		
		ArrayList<Aresta> arestas = prim.executar(g, 0);
		
		Imprimir.imprimir(arestas);
	}
	
	public void imprimeCaminho(Vertice origem, Vertice destino){
		if (origem.equals(destino)) {
			System.out.println(origem);
		} else if (destino.getPredecessor() == null) {
			System.out.println("Não há caminho de " + origem + " até + " + destino);
		} else {
			imprimeCaminho(origem, destino.getPredecessor());
			System.out.println(destino);
		}
	}

}
