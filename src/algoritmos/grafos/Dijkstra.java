package algoritmos.grafos;

import java.util.PriorityQueue;

public class Dijkstra {
	
	public void executar(Grafo g, int raiz) {
		for (Vertice v : g.getVertices()) {
			v.setCustoMinimo(Integer.MAX_VALUE);
			v.setPredecessor(null);
		}
		
		Vertice vRaiz = g.obterVertice(raiz);
		vRaiz.setCustoMinimo(0);
		
		PriorityQueue<Vertice> fila = new PriorityQueue<Vertice>();
		fila.addAll(g.getVertices());
		
		Vertice u = null;
		while(!fila.isEmpty()) {
			u = fila.remove();
			for(Vertice v : g.adjacentes(u)) {
				if (u.getCustoMinimo() + g.obterAresta(u, v).getCusto() < v.getCustoMinimo()) {
					v.setCustoMinimo(u.getCustoMinimo() + g.obterAresta(u, v).getCusto());
					v.setPredecessor(u);
				}
			}
		}
	}

}
