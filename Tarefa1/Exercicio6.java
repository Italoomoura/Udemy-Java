package Exercicio1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double a, b, c, pi;
		a = 3;
		b = 4;
		c = 5.2;
		pi = 3.14159;
		
		double tri = (a*c)/2;
		double cir = Math.pow(c, 2.0)*pi;
		double tra = ((a+b)*c)/2;
		double qua = b*b;
		double ret = a*b;
		
		System.out.printf("Triângulo: %.3f%n", tri);
		System.out.printf("Círculo: %.3f%n", cir);
		System.out.printf("Trapézio: %.3f%n", tra);
		System.out.printf("Quadrado: %.3f%n", qua);
		System.out.printf("Retângulo: %.3f%n", ret);

		a = 12.7;
		b = 10.4;
		c = 15.2;
		
		tri = (a*c)/2;
		cir = Math.pow(c, 2.0)*pi;
		tra = ((a+b)*c)/2;
		qua = b*b;
		ret = a*b;
		
		System.out.printf("Triângulo: %.3f%n", tri);
		System.out.printf("Círculo: %.3f%n", cir);
		System.out.printf("Trapézio: %.3f%n", tra);
		System.out.printf("Quadrado: %.3f%n", qua);
		System.out.printf("Retângulo: %.3f%n", ret);
		
		System.out.println();
		
		System.out.println("Agora informe seus valores!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do a: ");
		a = sc.nextDouble();
		System.out.print("Valor do b: ");
		b = sc.nextDouble();
		System.out.print("Valor do c: ");
		c = sc.nextDouble();
		
		tri = (a*c)/2;
		cir = Math.pow(c, 2.0)*pi;
		tra = ((a+b)*c)/2;
		qua = b*b;
		ret = a*b;
		
		System.out.printf("Triângulo: %.3f%n", tri);
		System.out.printf("Círculo: %.3f%n", cir);
		System.out.printf("Trapézio: %.3f%n", tra);
		System.out.printf("Quadrado: %.3f%n", qua);
		System.out.printf("Retângulo: %.3f%n", ret);
		
		sc.close();
	}

}
