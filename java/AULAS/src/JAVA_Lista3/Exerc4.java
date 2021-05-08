package JAVA_Lista3;
             /*
              * Uma empresa desenvolveu uma pesquisa para saber as características
				psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
				era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
				(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
				agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
				pessoas, calcule e mostre: 
				 o número de pessoas calmas;
				 o número de mulheres nervosas;
				 o número de homens agressivos;
				 o número de outros calmos;
				 o número de pessoas nervosas com mais de 40 anos;
				 o número de pessoas calmas com menos de 18 anos.
              */
import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		final int PESSOAS =3;
		int contador =1;
		char continua ='S';
		int idade =0;
		char genero;
		char opcao;
		int numeroPessoasCalmas =0;
		int mulherNervosas =0;
		int homensAgressivos =0;
		int outroCalmos =0;
		int pessoasNervosasAcima40Anos =0;
		int pessoasCalmasMenor18Anos =0;
	
		while (continua=='S' && contador<=PESSOAS) {
			
			System.out.printf(" PESSOA %d\n",contador);
			System.out.println("DIGITE SUA IDADE: ");
			idade = leia.nextInt();
			System.out.println("DIGITE SUE GÊNERO \n1 - MASCULINO  \n2 - FEMININO \n3 - OUTRO" );
			genero = leia.next().toUpperCase().charAt(0);
			System.out.println("1 - PARA PESSOA CALMA \n2 - PARA PESSOA NERVOSA \n3 - PARA PESSOA AGRESSIVA");
			opcao = leia.next().toUpperCase().charAt(0);
			
			if (opcao =='1') {
				numeroPessoasCalmas++;
			}
			if (genero =='2' && opcao =='2') {
				mulherNervosas++;
			}
			if (genero =='1' && opcao =='3') {
				homensAgressivos++;
			}
			if (genero =='3' && opcao =='1') {
				outroCalmos++;
			}
			if (opcao =='2' && idade >40) {
				pessoasNervosasAcima40Anos++;
			}
			if (opcao =='1' && idade <18) {
				pessoasCalmasMenor18Anos++;
			}
			
			contador++;
			if (contador<=PESSOAS) {	
			}
			System.out.println("CONTINUA S/N");
		    continua =leia.next().toUpperCase().charAt(0);
			
		}
			System.out.println("*----------RESULTADO----------*");
			System.out.printf("\nO NÚMERO DE PESSOAS CALMAS É: %d ",numeroPessoasCalmas);
			System.out.printf("\nO NÚMERO DE MULHERES NERVOSAS É: %d",mulherNervosas);
			System.out.printf("\nO NÚMERO DE HOMENS AGRESSIVOS É: %d",homensAgressivos);
			System.out.printf("\nO NÚMERO DE OUTROS CALMOS É DE: %d",outroCalmos++);
			System.out.printf("\nO NÚMERO DE PESSOAS NERVOSAS ACIMA DE 40 ANOS É: %d",pessoasNervosasAcima40Anos);
			System.out.printf("\nO NÚMERO DE PESSOAS CALMAS MENOR DE 18 ANOS É: %d",pessoasCalmasMenor18Anos);
			
			leia.close();
	}
	
}
