package JAVA_Lista1;
           /*
            * Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
              aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
              respectivamente. 
            */

import java.util.Scanner;

public class Exerc4 {
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
	    int nota1, nota2, nota3;
	    double resultado;
	    
		    System.out.println("DIGITE A NOTA 1: ");
		    nota1 = read.nextInt();
		    System.out.println("DIGITE A NOTA 2");
		    nota2 = read.nextInt();
		    System.out.println("DIGITE A NOTA 3");
		    nota3 = read.nextInt();
		    
		    resultado = (nota1 + nota2 + nota3)/3;
		    
		    System.out.printf("SUA M�DIA �: "+resultado);
	}
}
