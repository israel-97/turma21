package exercicios;

import java.util.Scanner;

/*
            * Faça um sistema que leia o tempo de duração de um evento em uma fábrica
            * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
            */
public class Exerc3 {

	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int tempo;
		
		System.out.println("DIGITE O TEMPO DO EVENTO EM SEGUNDOS: ");
		tempo = read.nextInt();
		System.out.println("\n");
		System.out.println("HORAS: "+ tempo / 3600);
		System.out.println("MINUTOS: "+(tempo % 3600) / 60);
		System.out.println("SEGUNDOS: "+(tempo % 3600) % 60);
	}
}
