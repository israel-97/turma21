package Lista3;
            /* Crie um programa que leia um n�mero do teclado at� que encontre um
               n�mero igual a zero. No final, mostre a soma dos n�meros
               digitados.
              */
import java.util.Scanner;
           
public class Exerc5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
       
		int num =0;
		int soma =0;
		do {
		System.out.println("DIGITE UM N�EMRO: ");
		num = leia.nextInt();
		soma += num;
		} while (num !=0); {
			}
			
		System.out.printf("A SOMA DOS VALORES �: %d",soma);
    
        	
		leia.close();
}
}