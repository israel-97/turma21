package JAVA_Lista4;

import java.util.Scanner;

/*
              * Fa�a um programa que receba 6 n�meros inteiros e mostre:
				� Os n�meros pares digitados;
				� A soma dos n�meros pares digitados;
				� Os n�meros �mpares digitados;
				� A quantidade de n�meros �mpares digitados.
              */
public class Exerc2 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int [] num = new int [6];
		int contaPar =0;
		int contaImpar =0;
		int somaPar=0;
		int somaImpar=0;
		
		for (int x=0; x<num.length; x++)
        {
            System.out.printf("\n DIGITE UM NUMERO : " );
            num[x] = leia.nextInt();


            if (num[x]%2==0) 
            {

                contaPar = contaPar+1;
                somaPar = somaPar + num[x];


            }

            else if ((num[x]%2)==1) 
            {
                contaImpar = contaImpar+1;
                somaImpar = somaImpar + num[x];
            }

        }

        System.out.printf("\nVezes de numeros pares digitados : %d" , contaPar);
        System.out.printf("\nO total de numeros pares �: %d" , somaPar);


        System.out.printf("\nVezes de numeros pares digitados: %d" , contaImpar );
        System.out.printf("\nO total de numeros impares �: %d" , somaImpar);

    }





    }