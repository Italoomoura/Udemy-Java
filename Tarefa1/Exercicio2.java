package Exercicio1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		double area1, raio1, area2, raio2, area3, raio3, pi;
		pi = 3.14159;
		raio1 = 2;
		raio2 = 100.64;
		raio3 = 150;
		area1 = pi*(Math.pow(raio1, 2.0));
		area2 = pi*(Math.pow(raio2, 2.0));
		area3 = pi*(Math.pow(raio3, 2.0));
		
		System.out.printf("A área de um círculo com raio %.2f é: %.4f%n", raio1 ,area1);
		System.out.printf("A área de um círculo com raio %.2f é: %.4f%n", raio2 ,area2);
		System.out.printf("A área de um círculo com raio %.2f é: %.4f%n", raio3 ,area3);

		System.out.println();

		System.out.println("Agora informe seus valores!");
		
		Scanner sc = new Scanner(System.in);
		
		double raiox, areax;
		
		System.out.print("Raio do círculo: ");
		raiox = sc.nextDouble();
		
		areax = pi*(Math.pow(raiox, 2.0));
		System.out.printf("A área do seu círculo é: %.4f%n", areax);
		
		sc.close();
	}

}
