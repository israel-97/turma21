package JAVA_Lista2;

import java.util.Scanner;

/*
      * Faça um programa em que permita a entrada de um número qualquer e exiba se este
        número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
        ímpar exiba o número elevado ao quadrado.
      */
public class Exerc4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num = 0;
		int raiz = 0;
		int elevado = 0;
		
		System.out.println("ENTRE COM UM VALOR: ");
		num = leia.nextInt();
		
		if (num % 2 ==0){
			System.out.println("O NÚMERO É PAR ");
			raiz = (int) (Math.sqrt(num));
			System.out.println("E A RAIZ DE " +num+ " É " +raiz );
			
		}
		else if (num % 2==1)  {
			System.out.println("O NÚMERO É ÍMPAR ");
			elevado = (int) Math.pow(num, 2);
			System.out.println("E O NÚMERO "+num+ " ELEVADO AO QUADRADO É " +elevado);
		}
		leia.close();
	}
	
}
