package JAVA_Lista3;

/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
 */
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int x;

		for (x = 1; x <= 10; x++) {
			if (x % 2 == 0) {
				System.out.println("N�MERO PAR " + x);
				}
				if (x % 2 == 1) {
					System.out.println("N�MERO IMPAR: " + x);
				}
				leia.close();
			}

		}

	}

