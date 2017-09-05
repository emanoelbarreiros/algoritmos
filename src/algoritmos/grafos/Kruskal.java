package algoritmos.grafos;

import java.util.ArrayList;
import java.util.List;

public class Kruskal {
	
	private Floresta f;
	
	public Kruskal() {
		f = new Floresta();
	}
	
	public List<Aresta> executar(Grafo entrada) {
		List<Aresta> arestas = new ArrayList<Aresta>();
		for (Vertice v : entrada.getVertices()){
			ArrayList<Vertice> lista = new ArrayList<Vertice>();
			lista.add(v);
			f.adicionarArvore(lista);
		}
		
		for (Aresta a : entrada.getArestas()) {
			List<Vertice> conjunto1 = f.obterArvore(a.getOrigem());
			List<Vertice> conjunto2 = f.obterArvore(a.getDestino());
			if (Floresta.diferentes(conjunto1, conjunto2)) {
				arestas.add(a);
				f.unir(a.getOrigem(), a.getDestino());
			}
		}
		
		return arestas;
	}

}
