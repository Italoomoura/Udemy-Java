package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int a, b, c, d, e, f;
		a = 10;
		b = 30;
		
		System.out.println("A soma de "+a+" com "+b+" é igual a: "+(a+b));
		
		c = -30;
		d = 10;
		
		System.out.println("A soma de "+c+" com "+d+" é igual a: "+(c+d));
		
		e = 0;
		f = 0;
		
		System.out.println("A soma de "+e+" com "+f+" é igual a: "+(e+f));
		
		System.out.println();
		
		System.out.println("Agora informe seus valores!");
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("Primeiro valor: ");
		x = sc.nextInt();
		
		System.out.print("Segundo valor: ");
		y = sc.nextInt();
		
		System.out.println("A soma dos seus valores é: "+(x+y));
		
		sc.close();
	}
}
