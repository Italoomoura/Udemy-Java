package Tarefa2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double x;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextDouble();
		
		if (x < 0 || x > 100) {
			System.out.println("Fora de intervalo");
		}
		else if (x <= 25) {
			System.out.println("Intervalo (0,25)");
		}
		else if (x <= 50) {
			System.out.println("Intervalo (25,50)");
		}
		else if (x <= 75) {
			System.out.println("Intervalo (50,75)");
		}		
		else {
			System.out.println("Intervalo (75,100)");
		}

		sc.close();
	}

}
