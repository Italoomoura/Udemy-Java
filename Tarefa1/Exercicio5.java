package Exercicio1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int p1, p2;
		int qnt1, qnt2;
		double v1, v2;
		
		p1 = 12;
		qnt1 = 1;
		v1 = 5.30;
		
		p2 = 16;
		qnt2 = 2;
		v2 = 5.10;
		
		double total1 = (v1*qnt1)+(v2*qnt2);
		
		System.out.printf("Você escolheu "+qnt1+" do produto "+p1+" e "+qnt2+" do produto "+p2+", o total a pagar é: %.2f reais %n", total1);
		
		p1 = 13;
		qnt1 = 2;
		v1 = 15.30;
		
		p2 = 161;
		qnt2 = 4;
		v2 = 5.20;
		
		total1 = (v1*qnt1)+(v2*qnt2);
		
		System.out.printf("Você escolheu "+qnt1+" do produto "+p1+" e "+qnt2+" do produto "+p2+", o total a pagar é: %.2f reais %n", total1);
		
		p1 = 1;
		qnt1 = 1;
		v1 = 15.10;
		
		p2 = 2;
		qnt2 = 1;
		v2 = 15.10;
		
		total1 = (v1*qnt1)+(v2*qnt2);
		
		System.out.printf("Você escolheu "+qnt1+" do produto "+p1+" e "+qnt2+" do produto "+p2+", o total a pagar é: %.2f reais %n", total1);
		
		System.out.println();
		
		System.out.println("Agora informe seus valores!");
		
		Scanner sc = new Scanner(System.in);
		
		int px, py;
		int qntx, qnty;
		double vx, vy;
		
		System.out.print("Primeiro produto: ");
		px = sc.nextInt();
		System.out.print("Quantidade do primeiro produto: ");
		qntx = sc.nextInt();
		System.out.print("Preço do primeiro produto: ");
		vx = sc.nextDouble();
		
		System.out.print("Segundo produto: ");
		py = sc.nextInt();
		System.out.print("Quantidade do segundo produto: ");
		qnty = sc.nextInt();
		System.out.print("Preço do segundo produto: ");
		vy = sc.nextDouble();
		
		double totalx = (qntx*vx)+(qnty*vy);
		System.out.printf("Você escolheu "+qntx+" do produto "+px+" e "+qnty+" do produto "+py+", o total a pagar é: %.2f reais %n", totalx);
		
		sc.close();
	
	}

}
