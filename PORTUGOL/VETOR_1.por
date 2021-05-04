programa
{
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		   que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		   imprima a média aritmética dos lançamentos, contabilize e apresente também
		   quantas foram as ocorrências da maior pontuação.
		 */

		 //VARIAVEIS

		 const inteiro VALORESP = 10
		real lancamentos[VALORESP]
          real somaV = 0.0
		real maiorP = 0.0
		inteiro ocorrencia = 0
		real mediaAmt =0.00

          //PROCESSAMENTO
		
		para(inteiro i = 0; i < VALORESP; i++) {
			limpa()
			escreva("Lançamento : ")
			leia(lancamentos[i])
		}


		limpa()


		para(inteiro i = 0; i < VALORESP; i++) {
			escreva("\nLançamento "  + ": " + lancamentos[i])

			somaV += lancamentos[i]

			se(lancamentos[i] > maiorP) {
				maiorP = lancamentos[i]
			}
		}

		
		para(inteiro i = 0; i < VALORESP; i++) {
			se(lancamentos[i] == maiorP) {
				ocorrencia += 1
			}
		}

		mediaAmt = mat.arredondar(somaV / VALORESP, 2)

          //SAÍDAS

		escreva("\nMédia: " + mediaAmt)
		escreva("\nMaior pontuação: " + maiorP)
		escreva("\nOcorrências da maior pontuação: " + ocorrencia)
		
	}
}
	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 869; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */