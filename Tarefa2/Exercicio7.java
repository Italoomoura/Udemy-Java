package Tarefa2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		double x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de x: ");
		x = sc.nextDouble();
		System.out.print("Digite o valor de y: ");
		y = sc.nextDouble();
		
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if(x == 0) {
			System.out.println("Eixo X");
		}
		else {
			if(y == 0) {
				System.out.println("Eixo Y");
			}
			else {
			if(x > 0) {
				if(y > 0) {
					System.out.println("Q1");
				}
				else {
					System.out.println("Q4");
				}
			}
			else {
				if(y > 0) {
					System.out.println("Q2");
				}
				else {
					System.out.println("Q3");
				}
			}
		}
	}
		sc.close();
	}
}
