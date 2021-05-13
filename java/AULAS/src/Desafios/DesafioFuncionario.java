package Desafios;

import java.util.Scanner;

public class DesafioFuncionario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Terceiro funcionario2 = new Terceiro("X02P44","Jose Pereira",8,22, 30);
		
		System.out.println("FUNCIONÁRIO 1:");
		
		System.out.println("DIGITE SEU NOME: ");
		String nome = leia.next();
		
		System.out.println("DIGITE SUA MATRÍCULA: ");
		String matricula = leia.next();
		
		System.out.println("DIGITE AS HORAS TRABALHADAS: ");
		int hotasTrabalhadas = leia.nextInt();
		
		System.out.println("DIGITE O SUA REMUNERAÇÃO POR HORA: ");
		double ganhoHora = leia.nextDouble();
		
		Funcionario funcionario = new Funcionario(matricula,nome,hotasTrabalhadas,ganhoHora);
	
		System.out.println("SEU SALÁRIO É: R$ "+funcionario.salario());
		
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		
		
		System.out.println("FUNCIONÁRIO 2");
		
		System.out.println("NOME: "+funcionario2.getNome());
		System.out.println("SEU SALÁRIO É: R$ "+funcionario2.salario());
        
		
		leia.close();
	}
      
}
