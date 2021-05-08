package JAVA_Lista2;

import java.util.Scanner;

        /*
        * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		  categoria ela se encontra:
		   10-14 infantil
	       15-17 juvenil
		   18-25 adulto
        */
public class Exerc3 {
	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);
        
       int idade;
       String nome;
       
       System.out.println("DIGITE SEU NOME: ");
       nome = leia.nextLine();
       
       System.out.println("DIGITE SUA IDADE: ");
       idade = leia.nextInt();
       
       if (idade >=10 && idade <=14) {
    	   System.out.printf("OI " +nome+", SUA CATEGORIA É INFANTIL.");
       }
       else if (idade >=15 && idade <=17) {
    	   System.out.printf("OI " +nome+", SUA CATEGORIA É JUVENIL.");
       }
       else if (idade >=18 && idade <=25) {
    	   System.out.printf("OI " +nome+", SUA CATEGORIA É ADULTO.");
       }
       else { 
        	   System.out.printf("OI " +nome+", VOCÊ AINDA NÃO POUSS�? UMA CATEGORIA.");
           }
       leia.close();
        }
	}

