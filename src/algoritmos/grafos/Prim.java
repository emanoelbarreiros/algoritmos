package algoritmos.grafos;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prim {
	
	public ArrayList<Aresta> executar(Grafo grafo, int raiz) {
		ArrayList<Aresta> retorno = new ArrayList<Aresta>();
		Vertice inicio = grafo.obterVertice(raiz);
		
		ArrayList<Vertice> naoVisitados = new ArrayList<Vertice>(grafo.getVertices());
		naoVisitados.remove(inicio);
		
		PriorityQueue<Aresta> arestasDisponiveis = new PriorityQueue<Aresta>();
		
		Vertice vertice = inicio;
		while (!naoVisitados.isEmpty()) {
			ArrayList<Aresta> arestas = grafo.obterArestas(vertice);
			for (Aresta a : arestas) {
				if (naoVisitados.contains(a.outro(vertice))) {
					arestasDisponiveis.add(a);
				}
			}
			
			Aresta a = arestasDisponiveis.remove(); 
			retorno.add(a);
			
			if (naoVisitados.contains(a.getOrigem())){
				vertice = a.getOrigem();
			} else {
				vertice = a.getDestino();
			}
			
			naoVisitados.remove(vertice);
		}
		
		return retorno;
	}
}
