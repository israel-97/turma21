package Desafios;

import java.util.Scanner;

public class Desafio1 {
	public static void main (String[] args) {
	Scanner read = new Scanner(System.in);
	//variables
	String nome;
	double c,f;
	//input
	System.out.print("Digite seu nome: ");
	nome = read.next();
	System.out.print("Digite a temperatura em Celsius: ");
	c = read.nextDouble();
	System.out.println();
	//processing
	f = (1.8*c) + 32;
	//output
	System.out.println(" Oi " + nome + " a temperatura em Fareheint é  = "+f+"°F.");	
	
	read.close();
	}
}
