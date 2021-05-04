package exercicios;

import java.util.Scanner;

/*
         * Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
           dias e mostre-a expressa apenas em dias.
         */
public class Exerc1 {
	public static void main(String orgs[]) 
	{
		Scanner leia = new Scanner(System.in);
		
		int anos, mes, dias, resultado;
	        System.out.println("Digite sua idade expressa em anos, meses e dias.\n");
			System.out.println("Anos?      ");
			anos = leia.nextInt();
			System.out.println("Meses?  ");
			mes = leia.nextInt();
			System.out.println("Dias?   ");
			dias = leia.nextInt();
			
			resultado = (anos * 360) + (mes * 30) + dias;
			
            System.out.println("\nSua idade em dias é aproximadamente: " +resultado);
	}
}
		
		
		
		
	
		
	

