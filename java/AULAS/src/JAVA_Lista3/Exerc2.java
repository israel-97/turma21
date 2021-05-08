package JAVA_Lista3;

/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 */
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int x;

		for (x = 1; x <= 10; x++) {
			if (x % 2 == 0) {
				System.out.println("NÚMERO PAR " + x);
				}
				if (x % 2 == 1) {
					System.out.println("NÚMERO IMPAR: " + x);
				}
				leia.close();
			}

		}

	}

