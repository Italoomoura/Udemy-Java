package Tarefa2;

public class Exercicio3 {

	public static void main(String[] args) {
		int a, b;
		
		a = 6;
		b = 24;
		if(a%b == 0 || b%a == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são Multiplos");
		}
		
		a = 6;
		b = 25;
		if(a%b == 0 || b%a == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são Multiplos");
		}
		
		a = 24;
		b = 6;
		if(a%b == 0 || b%a == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são Multiplos");
		}

	}

}
