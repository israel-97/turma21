package JAVA_Lista2;

import java.util.Scanner;

/*
      * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
        n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
        �mpar exiba o n�mero elevado ao quadrado.
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
			System.out.println("O N�MERO � PAR ");
			raiz = (int) (Math.sqrt(num));
			System.out.println("E A RAIZ DE " +num+ " � " +raiz );
			
		}
		else if (num % 2==1)  {
			System.out.println("O N�MERO � �MPAR ");
			elevado = (int) Math.pow(num, 2);
			System.out.println("E O N�MERO "+num+ " ELEVADO AO QUADRADO � " +elevado);
		}
		leia.close();
	}
	
}
