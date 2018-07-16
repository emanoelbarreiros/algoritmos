package algoritmos.grafos;

import java.util.ArrayList;

class BuscaEmLargura {
	private Vertice raiz;
	private ArrayList<Vertice> auxiliar;

	public void executar(Grafo grafo) {
		raiz = grafo.getVertices().get(0);
		for (Vertice v : grafo.getVertices()) {
			if (!v.equals(raiz)) {
				v.setDescoberta(Integer.MAX_VALUE);
				v.setPredecessor(null);
				v.setCor(Vertice.BRANCO);
			}
		}

		raiz.setCor(Vertice.CINZA);
		raiz.setDescoberta(0);
		raiz.setPredecessor(null);

		auxiliar = new ArrayList<Vertice>();
		auxiliar.add(raiz);

		Vertice u = null;
		while (auxiliar.size() > 0) {
			u = auxiliar.remove(0);
			for (Vertice v : grafo.adjacentes(u)) {
				if (v.getCor() == Vertice.BRANCO) {
					v.setCor(Vertice.CINZA);
					v.setDescoberta(u.getDescoberta() + 1);
					v.setPredecessor(u);
					auxiliar.add(v);
				}
			}
			u.setCor(Vertice.PRETO);
		}
	}
}
