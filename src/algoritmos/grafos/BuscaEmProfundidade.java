package algoritmos.grafos;

public class BuscaEmProfundidade implements Runnable {
	
	private static int tempo = 0;
	
	public void executar(GrafoAdjacencia grafo){
		tempo = 0;
		
		for (Vertice v : grafo.getVertices()) {
			v.setCor(Vertice.BRANCO);
			v.setPredecessor(null);
		}
		
		for (Vertice v : grafo.getVertices()) {
			if(v.getCor() == Vertice.BRANCO) {
				visitar(grafo, v);
			}
		}
		
	}
	
	public void visitar(GrafoAdjacencia grafo, Vertice vertice) {
		tempo++;
		vertice.setDescoberta(tempo);
		vertice.setCor(Vertice.CINZA);
		for (Vertice v : grafo.adjacentes(vertice)) {
			if (v.getCor() == Vertice.BRANCO) {
				v.setPredecessor(vertice);
				visitar(grafo, v);
			}
		}
		
		vertice.setCor(Vertice.PRETO);
		vertice.setFinalizacao(++tempo);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
