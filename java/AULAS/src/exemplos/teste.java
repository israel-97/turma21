package exemplos;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int[6];
		int somaPares =0;
		int somaImpares =0;
		for(int x=0;x<numeros.length;x++) {
			System.out.printf("Digite o %d� numero : ",x+1);
			numeros[x] = leia.nextInt();
		}
			
		System.out.print("Esses s�o os n�meros pares : ");
		for(int y =0;y<numeros.length;y++) {
			if((numeros[y]%2)==0 && numeros[y]!=0) {
				System.out.print(numeros[y]+", ");
				somaPares+=numeros[y];
			}
			
		}
		System.out.print("\nEsses s�o os n�meros impares : ");
		for(int y =0;y<numeros.length;y++) {
			if(((numeros[y]%2)==1 ||(numeros[y]%2)==-1) && (numeros[y]!=0)){
				System.out.print(numeros[y]+", ");
				somaImpares+=numeros[y];
			}
			
		}
		System.out.printf("\nA soma dos pares � %d e a dos impares equivale a %d",somaPares,somaImpares);
		
	}
}


