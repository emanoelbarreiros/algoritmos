package util;

import java.util.List;

import algoritmos.grafos.Aresta;
import estruturas.Elemento;
import estruturas.ListaLigada;

public class Imprimir {

	public Imprimir() {
		// TODO Auto-generated constructor stub
	}

	public static void imprimir(int[] v) {
		System.out.print("[ ");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			if (i < v.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" ]");
	}
	
	public static void imprimir(ListaLigada lista) {
		System.out.print("[ ");
		Elemento proximo = lista.getPrimeiro();
		while (proximo != null) {
			System.out.print(proximo.getValor());
			System.out.print(", ");
			proximo = proximo.getProximo();
		}
		System.out.println(" ]");
	}

	public static void imprimir(List<Aresta> arestas) {
		StringBuilder builder = new StringBuilder();
		builder.append("A{");
		for (int i = 0; i < arestas.size(); i++) {
			builder.append(arestas.get(i).toString());
			if(i < arestas.size() - 1 ) {
				builder.append(",");
			}
		}
		builder.append("}");
		
		System.out.println(builder.toString());
	}

}
