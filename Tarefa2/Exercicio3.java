package Tarefa2;

public class Exercicio3 {

	public static void main(String[] args) {
		int a, b;
		
		a = 6;
		b = 24;
		if(a%b == 0 || b%a == 0) {
			System.out.println("S�o Multiplos");
		}
		else {
			System.out.println("N�o s�o Multiplos");
		}
		
		a = 6;
		b = 25;
		if(a%b == 0 || b%a == 0) {
			System.out.println("S�o Multiplos");
		}
		else {
			System.out.println("N�o s�o Multiplos");
		}
		
		a = 24;
		b = 6;
		if(a%b == 0 || b%a == 0) {
			System.out.println("S�o Multiplos");
		}
		else {
			System.out.println("N�o s�o Multiplos");
		}

	}

}
