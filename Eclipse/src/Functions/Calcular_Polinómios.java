/*
 * Class 04.12.2020
 * Exercício 5.8 - Calcular os valores ds
 * 
 */
package Functions;

import java.util.Scanner;

public class Calcular_Polinómios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double xi, xf, delta, npontos;

        System.out.println("Introduce the interval you want:");
        xi = sc.nextDouble();
        xf = sc.nextDouble();

        System.out.println("Introduza o npontos:");
        npontos = sc.nextDouble();

        delta = (xf-xi)/(npontos-1);
        pols(xi, xf, delta);
    }
    public static void  pols(double xi, double xf, double d) {
        double x;
        double y;
        double y1;
        System.out.println("--------------------------------");
        System.out.println("| x | 5x2+10x+3 | 7x3+3x2+5x+2 |");
        System.out.println("--------------------------------");
        for (x = xi; x<=xf; x +=d) {
            y = 5*x*x+10*x+3;
            y1 = 7*x*x*x+3*x*x+5*x+2;
            System.out.printf("| %2f | %3.4f | %3.4f |\n", x, y, y1);
            System.out.println("--------------------------------");
        }

	}

}
