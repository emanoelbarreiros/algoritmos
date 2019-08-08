package algoritmos.grafos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GrafoAdjacencia {
	
	private List<Vertice> vertices;
	
	private int[][] matrizAdjacencia;
	
	private List<Vertice> corte;
	
	public GrafoAdjacencia(int qtdVertices) {
		vertices = new ArrayList<Vertice>();
		matrizAdjacencia = new int[qtdVertices][qtdVertices];
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
		adicionarAresta(origem, destino, 1);
	}

	
	
	public void adicionarAresta(int origem, int destino, int custo) {
		matrizAdjacencia[origem][destino] = custo;
	}
	
	
	
	public List<Vertice> adjacentes(Vertice v) {
		ArrayList<Vertice> retorno = new ArrayList<Vertice>();
		
		for (int i = 0; i < matrizAdjacencia.length; i++) {
			if (matrizAdjacencia[v.getId()][i] != 0 && !retorno.contains(obterVertice(i))) {
				retorno.add(obterVertice(i));
			}
		}
		
		for (int i = 0; i < matrizAdjacencia.length; i++) {
			if (matrizAdjacencia[i][v.getId()] != 0 && !retorno.contains(obterVertice(i))) {
				retorno.add(obterVertice(i));
			}
		}
		
		return retorno;
	}

	public List<Vertice> getVertices() {
		Collections.sort(vertices);
		return vertices;
	}

	public void setVertices(List<Vertice> vertices) {
		this.vertices = vertices;
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
		for (int i = 0; i < matrizAdjacencia.length; i++) {
			for (int j = 0; j < matrizAdjacencia[i].length; j++) {
				if (matrizAdjacencia[i][j] != 0) {
					builder.append("(" + i + ", " + j + ")");
				}
			}
		}
		builder.append("}\n}");
		
		return builder.toString();
	}
	

	
	public void imprimirCaminho(Vertice origem, Vertice destino) {
		if (origem.equals(destino)) {
			System.out.println(origem.getId());
		} else if (destino.getPredecessor() == null) {
			System.out.println("Não existe caminho de " + origem.getId() + " até " + destino.getId());
		} else {
			imprimirCaminho(origem, destino.getPredecessor());
			System.out.println(destino.getId());
		}
	}

}
