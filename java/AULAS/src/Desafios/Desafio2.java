package Desafios;

import java.util.Scanner;

public class Desafio2 {
	public static void main (String[] args) {
	Scanner read = new Scanner(System.in);
	//variables
	int ano,idade,anoAtual=2021;
	char genero;
	String nome;
	//input
	System.out.print("Digite seu nome: ");
	nome = read.next();
	System.out.print("Digite seu ano de nascimento: ");
	ano = read.nextInt();
	System.out.print("Digite seu g�nero(M-masc/f-fem/o-outro): ");
	genero = read.next().charAt(0);
	idade = anoAtual - ano;
	System.out.println();
	System.out.printf(nome+", voce t�m "+ idade +" anos e seu g�nero � "+genero+".");
	
	
	read.close();
	}
	
}
