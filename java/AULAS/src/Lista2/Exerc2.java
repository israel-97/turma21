package Lista2;
       /*
        * Faça um programa que entre com três números e coloque em ordem crescente.
        */
import java.util.Scanner;

public class Exerc2 {
	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		 
		int a, b, c; 
		
		System.out.println("ENTRE COM TRÊS NÚMEROS: ");
		a = leia.nextInt();
		b = leia.nextInt();
		c = leia.nextInt();
		
		if (a>b) {
			if (b>c) {				
				System.out.println(" " + a + b + c);
			}
			else {	
		    if (a>c) {
		    	System.out.println(" "+ a + c + b);
		    }
		    else {
		    	System.out.println(" "+ c + a + b);
		    }
			}
			
		}
		else {	 
			if (b>c) {
				if (a>c) {
					System.out.println(" "+ b + a + c);
				}
				else {
					System.out.println(" "+ b + c + a);
				}
	 
				}
			else {
				System.out.println(" "+ c + b + a);
			   }
			 {	
		   }
	    }   leia.close();
		  }
			
	          {	
			    }
		        	{		
				
	              }
               }
