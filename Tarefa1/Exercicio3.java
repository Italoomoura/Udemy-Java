package Exercicio1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int a, b, c, d;
		
		a = 5;
		b = 6;
		c = 7;
		d = 8;
		
		int diferenca1 = (a*b-c*d);
		System.out.println("A diferença do produto de "+a+" e "+b+" pelo produto de "+c+" e "+d+" é: "+diferenca1);
		 
		a = 5;
		b = 6;
		c = -7;
		d = 8;

		diferenca1 = (a*b-c*d);
		System.out.println("A diferença do produto de "+a+" e "+b+" pelo produto de "+c+" e "+d+" é: "+diferenca1);
		
		System.out.println();
		
		System.out.println("Agora informe seus valores!");
		
		Scanner sc = new Scanner(System.in);
		
		int w, x, y, z;
		
		System.out.print("Primeiro valor: ");
		w = sc.nextInt();
		System.out.print("Segundo valor: ");
		x = sc.nextInt();
		System.out.print("Terceiro valor: ");
		y = sc.nextInt();
		System.out.print("Quarto valor: ");
		z = sc.nextInt();
		
		int diferencawxyz = (w*x-y*z);
		System.out.printf("A diferença do produto de "+w+" e "+x+" pelo produto de "+y+" e "+z+" é: "+diferencawxyz);
		
		sc.close();
	}

}
