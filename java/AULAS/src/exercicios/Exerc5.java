package exercicios;
                /*
                 * Construa um programa em c que, tendo como dados de entrada dois pontos
                   quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
                   que efetua tal cálculo é: d = V(x2 - x1)2 + (y2 - y1)2
                 */
import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] arg)
    {
    	Scanner read = new Scanner(System.in);
    	double x1 = 0.0;
    	double x2 = 0.0;
        double p1 = 0.0;
        double y1 = 0.0;
        double p2 = 0.0;
        double y2 = 0.0;
        double res = 0.0;
       
        System.out.println("ENTRE COM O VALOR X1: ");
        p1 = read.nextDouble();
        System.out.println("ENTRE COM O VALOR X2");
        p2 = read.nextDouble();
        System.out.println("ENTRE COM O VALOR Y1");
        y1 = read.nextDouble();
        System.out.println("ENTRE COM O VALOR Y2");
        y2 = read.nextDouble();
        
        p1 = Math.pow((x2 - x1),2);
        p2 = Math.pow((y2 - y1),2);	
        res = Math.sqrt(p1 + p2);
        
        System.out.printf("A DISTÂNCIA TOTAL É DE: "+res);
    }
    
}
