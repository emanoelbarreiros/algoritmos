package algoritmos.grafos;

public class BuscaEmProfundidade {
	
	private static int tempo = 0;
	
	public void bep(Grafo grafo){
		tempo = 0;
		
		for (Vertice v : grafo.getVertices()) {
			v.setCor(Vertice.BRANCO);
			v.setPredecessor(null);
		}
		
		for (Vertice v : grafo.getVertices()) {
			if(v.getCor() == Vertice.BRANCO) {
				bepVisitar(grafo, v);
			}
		}
		
	}
	
	public void bepVisitar(Grafo grafo, Vertice vertice) {
		tempo++;
		vertice.setDescoberta(tempo);
		vertice.setCor(Vertice.CINZA);
		for (Vertice v : grafo.adjacentes(vertice)) {
			if (v.getCor() == Vertice.BRANCO) {
				v.setPredecessor(vertice);
				bepVisitar(grafo, v);
			}
		}
		
		vertice.setCor(Vertice.PRETO);
		vertice.setFinalizacao(++tempo);
	}

}
