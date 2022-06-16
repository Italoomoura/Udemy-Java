package Tarefa2;

public class Exercicio4 {

	public static void main(String[] args) {
		int x, y;
		int duracao;
		
		x = 16;
		y = 2;
		if (x < y) {
			duracao = y - x;
		}
		else {
			duracao = 24 - x + y;
		}
		
		System.out.println("O jogo durou "+duracao+" hora(s)");
		
		x = 0;
		y = 0;
		if (x < y) {
			duracao = y - x;
		}
		else {
			duracao = 24 - x + y;
		}
		
		System.out.println("O jogo durou "+duracao+" hora(s)");
		
		x = 2;
		y = 16;
		if (x < y) {
			duracao = y - x;
		}
		else {
			duracao = 24 - x + y;
		}
		
		System.out.println("O jogo durou "+duracao+" hora(s)");
		
	}
}
