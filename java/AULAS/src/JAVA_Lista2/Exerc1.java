package JAVA_Lista2;

import java.util.Scanner;

            /*
            * Faça um programa que receba três inteiros e diga qual deles é o maior.
            */

public class Exerc1 {

	public static void main(String[] args) {
	
         Scanner leia = new Scanner(System.in);
    	
         int valor, valor1, valor2;
         int maior = 0;
         
         System.out.println("ENTRE COM O VALOR INTEIRO Nº 1: ");
         valor = leia.nextInt();
         
         System.out.println("ENTRE COM O VALOR INTEIRO Nº 2: ");
         valor1 = leia.nextInt();
         
         System.out.println("ENTRE COM O VALOR INTEIRO Nº 3: ");
         valor2 = leia.nextInt();
         
         if (valor > maior) {
        	 maior = valor;
        	 
         if (valor1>maior)	 
          maior = valor1;
         
         if (valor2>maior)
        	 maior=valor2;
        	 
        	 System.out.printf("O MAIOR VALOR É: %d",maior);
        	 
        
         } 
        leia.close();
	}
	 
}
