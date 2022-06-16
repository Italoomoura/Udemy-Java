package Tarefa2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int qnt, codigo;
		double preco;
		preco = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Código do produto: ");
		codigo = sc.nextInt();
		System.out.print("Digite a quantidade do produto: ");
		qnt = sc.nextInt();
		
		if (codigo == 1) {
			preco = 4.00;
		}
		else if(codigo == 2) {
			preco = 4.50;
		}
		else if(codigo == 3) {
			preco = 5.00;
		}
		else if(codigo == 4) {
			preco = 2.00;
		}
		else if(codigo == 5) {
			preco = 1.50;
		}
		else {
			System.out.println("Código não existe");
		}
		System.out.printf("Total: R$ %.2f%n", (preco*qnt));
		
		sc.close();
	}

}
