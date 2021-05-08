package JAVA_Lista4;

public class Exerc3 {
	
	public static void main(String[] args) {
		
		
		int[][] matriz = new int[3][3];
		int sup=100,min = 0,soma10=0;
		
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				matriz[linha][coluna]= (int)(Math.random()*(sup-min)+min);
				System.out.print(matriz[linha][coluna]+"\t");
				if(matriz[linha][coluna]>10) {
					soma10++;
				}
			}
			System.out.println();
		}
		
		System.out.println("\nNÚMEROS SORTEADOS ENTRE 0 e 100");
		System.out.printf("TIVERAM %d NÚMEROS SORTEADOS NA MATRIZ QUE SÃO MAIORES DE 10!!",soma10);
	}
}

		
