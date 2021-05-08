package JAVA_Lista1;

import java.util.Scanner;

public class Exerc2 {
	public static void main(String orgs[])
	{
		Scanner leia = new Scanner(System.in);
		
		int totalDias;
			
			System.out.println("Digite sua idade em dias: ");
			totalDias = leia.nextInt();
			System.out.println("\n");
			System.out.println("Anos: "+ totalDias / 365);
			System.out.println("Meses: "+(totalDias % 365) / 30);
			System.out.println("Dias: "+(totalDias % 365) % 30);
			
	}
}
