package exemplos;

import java.util.Scanner;

public class EntrdaSaida {
	public static void main(String arg[])
	{
		Scanner leia = new Scanner(System.in);
		int a,b,soma;
		System.out.println("Entre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextInt();
		soma = a+b;
		System.out.println(soma);
		
		leia.close();
	}
}
