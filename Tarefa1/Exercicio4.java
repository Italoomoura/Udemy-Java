package Exercicio1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int nFuncionario;
		int horas;
		double pHora;
		
		nFuncionario = 25;
		horas = 100;
		pHora = 5.50;
		double s1 = horas*pHora; 
		
		System.out.printf("O funcionário número "+nFuncionario+" tem o salário de %.2f reais %n", s1);
		
		nFuncionario = 1;
		horas = 200;
		pHora = 20.50;
		s1 = horas*pHora; 
		
		System.out.printf("O funcionário número "+nFuncionario+" tem o salário de %.2f reais %n", s1);
		
		nFuncionario = 6;
		horas = 145;
		pHora = 15.55;
		s1 = horas*pHora; 
		
		System.out.printf("O funcionário número "+nFuncionario+" tem o salário de %.2f reais %n", s1);
		
		System.out.println();
		
		System.out.println("Agora informe seus valores!");
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		double z;
		
		System.out.print("Informe seu número: ");
		x = sc.nextInt();
		System.out.print("Digite quantas horas trabalha: ");
		y = sc.nextInt();
		System.out.print("Digite o quanto ganha por hora: ");
		z = sc.nextDouble();
		
		double sx = y*z; 
		System.out.printf("O seu número de funcionário é "+x+" e você tem o salário de %.2f reais", sx);
		
		sc.close();
		
	}

}
