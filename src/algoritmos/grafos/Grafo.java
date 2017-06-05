package algoritmos.grafos;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
	
	private List<Vertice> vertices;
	
	private List<Aresta> arestas;
	
	public Grafo() {
		vertices = new ArrayList<Vertice>();
		arestas = new ArrayList<Aresta>();
	}
	
	public void adicionarVertice(int id) {
		for (Vertice v : vertices) {
			if (v.getId() == id) {
				throw new VerticeException("Vertice já existe: " + id);
			}
		}
		
		vertices.add(new Vertice(id));
	}
	
	public Vertice obterVertice(int id) {
		Vertice retorno = null;
		for (Vertice v : vertices) {
			if (v.getId() == id) {
				retorno = v;
				break;
			}
		}
		
		return retorno;
	}
	
	public void adicionarAresta(int origem, int destino) {
		Vertice vOrigem = obterVertice(origem);
		if (origem < 0 || vOrigem == null) {
			throw new VerticeException("Vertice origem invalido: " + origem);
		}
		
		Vertice vDestino  = obterVertice(destino);
		if (destino < 0 || vDestino == null) {
			throw new VerticeException("Vertice destino invalido: " + destino);
		}
		
		for (Aresta aresta : arestas) {
			if (aresta.getOrigem().getId() == origem 
					&& aresta.getDestino().getId() == destino) {
				throw new ArestaException("Aresta já existe: (" + origem + "," + destino + ")");
			}
		}
		
		Aresta aresta = new Aresta();
		aresta.setOrigem(vOrigem);
		aresta.setDestino(vDestino);
		arestas.add(aresta);
	}
	
	public List<Vertice> adjacentes(Vertice vertice) {
		ArrayList<Vertice> adjacentes = new ArrayList<Vertice>();
		
		for(Aresta a : arestas) {
			if(a.getOrigem().equals(vertice) 
					&& !adjacentes.contains(a.getDestino())){
				adjacentes.add(a.getDestino());
			}
		}
		
		return adjacentes;
	}

	public List<Vertice> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertice> vertices) {
		this.vertices = vertices;
	}

	public List<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("G = { \nV{");
		for (int i = 0; i < vertices.size(); i++) {
			builder.append(vertices.get(i).toString());
			if(i < vertices.size() - 1 ) {
				builder.append(", ");
			}
		}
		
		builder.append("}\n");
		builder.append("A{");
		for (int i = 0; i < arestas.size(); i++) {
			builder.append(arestas.get(i).toString());
			if(i < arestas.size() - 1 ) {
				builder.append(", ");
			}
		}
		builder.append("}\n}");
		
		return builder.toString();
	}
}
