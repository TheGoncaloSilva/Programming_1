/*
 * Day 02.12.2020
 * Exerc�cio 2.11 - Calcular as ra�zes de uma equa��o de 2� grau Ax^2 + BX + C = 0
 * 
 */
package Decision;

import java.util.Scanner;

public class second_degree_equation {

	public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        // variáveis
        double a,b,c; 		// coeficientes do polin.
        double r1, r2, i1,i2; 	// raizes - r1, r2 - parte real e i1,i2 - parte imaginária
        double delta;
        // ler coeficientes do teclado
        System.out.print("Introduza os coeficientes do polinómio (a, b, c):");
        a = ler.nextDouble();
        if (a != 0) {
            b = ler.nextDouble();
            c = ler.nextDouble();
            delta = b*b-4*a*c;
            if (delta >= 0) {
                r1 = (-b+Math.sqrt(delta))/(2*a);
                r2 = (-b-Math.sqrt(delta))/(2*a);
                System.out.printf("Raizes: %f, %f\n",r1,r2);
            } else {
                r1 = -b/(2*a);
                i1 = +Math.sqrt(-delta)/(2*a);
                r2 = r1;
                i2 = -i1;
                System.out.printf("raizes imaginarias: \n%f i%f\n%f i%f\n",r1,i1,r2,i2);
            }

        } else {
            System.out.printf("a = 0, n�o � um polinómio do 2º grau!\n");
        }
		

	}

}
