package JAVA_Lista2;

import java.util.Scanner;

            /*
            * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
            */

public class Exerc1 {

	public static void main(String[] args) {
	
         Scanner leia = new Scanner(System.in);
    	
         int valor, valor1, valor2;
         int maior = 0;
         
         System.out.println("ENTRE COM O VALOR INTEIRO N� 1: ");
         valor = leia.nextInt();
         
         System.out.println("ENTRE COM O VALOR INTEIRO N� 2: ");
         valor1 = leia.nextInt();
         
         System.out.println("ENTRE COM O VALOR INTEIRO N� 3: ");
         valor2 = leia.nextInt();
         
         if (valor > maior) {
        	 maior = valor;
        	 
         if (valor1>maior)	 
          maior = valor1;
         
         if (valor2>maior)
        	 maior=valor2;
        	 
        	 System.out.printf("O MAIOR VALOR �: %d",maior);
        	 
        
         } 
        leia.close();
	}
	 
}
