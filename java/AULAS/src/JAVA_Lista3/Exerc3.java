package JAVA_Lista3;

import java.util.Scanner;

/*
           * Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
             21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
             idade for =-99. 
           */
public class Exerc3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int soma21 = 0;
		int soma50 = 0;
		
		
		while (idade !=-99) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			if (idade >0 && idade <21  ) {
				soma21++;
			}
			else if (idade >50 ) {
				soma50++;
				
			}
		}
		System.out.printf("\nA SOMA DE PESSOAS COM MENOS DE 21 ANOS � DE: %d ",soma21);
		System.out.printf("\nA SOMA DE PESSOAS COM MAIS DE 50 ANOS � DE: %d ",soma50);
		
		leia.close();
	}
	
}
