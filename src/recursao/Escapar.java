package recursao;

import java.util.Stack;

public class Escapar {
	
	int[][] maze;
	int largura;
	int altura;
	int origemX;
	int origemY;
	int ABERTO = 0;
	int BLOQUEADO = 1;
	int DESTINO = 2;
	int SEM_SAIDA = 3;
	int CAMINHO = 4;
	
	public Escapar(int[][] maze) {
		this.maze = maze;
		this.altura = maze.length;
		this.largura = maze[0].length;
	}

	void imprimir() {
		System.out.println();
		System.out.print("    ");
		for (int i = 1; i <= maze.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < maze.length; i++) {
			System.out.print(i + 1 + "   ");
			for (int j = 0; j < maze[i].length; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
	}

	boolean escapar(int x, int y) {
		if (y >= maze.length || x >= maze[0].length
				|| y < 0 || x < 0) {
			return false;
		}
		
		if(maze[y][x] == BLOQUEADO 
				|| maze[y][x] == SEM_SAIDA 
				|| maze[y][x] == CAMINHO) {
			return false;
		}
		
		if(maze[y][x] == DESTINO) {
			return true;
		}
		
		maze[y][x] = CAMINHO;
		
		// tentar ir NORTE
		if(escapar(x, y-1)) {
			return true;
		}
		
		// tentar ir LESTE
		if(escapar(x+1, y)) {
			return true;
		}
		
		//tentar ir SUL
		if(escapar(x,y+1)) {
			return true;
		}
		
		//tentar ir OESTE
		if(escapar(x-1,y)) {
			return true;
		}
		
		maze[y][x] = SEM_SAIDA;
		return false;
	}
	
}
