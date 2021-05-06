package Lista3;
           /*
            * Informar todos os números de 1000 a 1999 que quando divididos por 11
              obtemos resto = 5. 
            */
import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int x;
		
		for (x = 1000; x<=1999; x++)
		{
			
		if (x % 11 ==5) {	
			System.out.println(" "+x);
		}
		leia.close();
		}
		
	}
	
}
