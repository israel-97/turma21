package JAVA_Lista4;

import java.util.Scanner;
              /*
               * Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
				inteiros. O programa deve executar os seguintes passos:
				(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
				(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
				A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
				(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
				(d) Mostre na tela cada valor do vetor A, um em cada linha.
               */
public class Exerc1 {

	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] A = {1,0,5,-2,-5,7};
		int soma=0;
		
		
		
		for (int x = 0; x<A.length ; x++) {
		    if (x ==0 || x==1 || x==5){
		    	soma+=A[x];
		    }
			 if (x==4) {
				 A[x] =100;
			 }
		}
		System.out.printf("A SOMA DOS VALORES �: %d",soma);
		System.out.println();
		System.out.println("\n+-----TODAS AS POSI��ES-----+");
		
		for (int x = 0; x<A.length ; x++) {
			System.out.println("\t"+A[x]);
		}
		leia.close();	
	}
}


