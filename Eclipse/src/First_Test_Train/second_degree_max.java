/*
 * Day 03.12.2020
 * Equa��o de 2� grau (AX^2 + BX + C) descobrir m�ximos
 * Diferen�a sinal de derivada = m�ximo ou m�nimo
 * 
 */
package First_Test_Train;

import java.util.Scanner;

public class second_degree_max {
	
	public static void main(String[] args) {
		
		double a, b, c, xi, xf; //coeficientes do polin�mio
		int pontos;
		double[] val = new double[10];
		
		// Ler os coeficientes A, B, C e intervalo de X
		System.out.println("Coeficientes A, B, C: ");
		a = lerNumero("A: ", -1000, 1000);
		b = lerNumero("B: ", -1000, 1000);
		c = lerNumero("C: ", -1000, 1000);
		System.out.println("Intervalo e numero de pontos:");
		xi = lerNumero("xi: ", -1000, 1000);
		xf = lerNumero("xf: ", -1000, 1000);
		pontos = (int)lerNumero("Npontos: ", 1, 10000);
		
		maximos(a, b, c, xi, xf, pontos);
		minimos(a, b, c, xi, xf, pontos);

	}
	// Fun��o que l� um valor real do teclado no intervalo [a,b]
	public static double lerNumero(String mensagem, double a, double b) {
		Scanner sc = new Scanner(System.in);
		
		double n;
		do {
			System.out.printf(mensagem);
			n = sc.nextDouble();			
		}while(n < a || n > b);		
		return n;
	}
	// esta fun��o vai calcular a derivada, ou seja, quando a derivada apresenta uma mudan�a de sinal
	public static void maximos(double a, double b, double c, double xi, double xf, double npontos) {
		int count = 1;
		double deriv = 0, x = xi;
		double delta = (xf - xi) / (npontos - 1);
		double deriv0 = 2 * a * x + b; // este c�lculo corresponde � derivada da fun��o original AX^2 + BX + C ( 2Ax + B)
		for(int  i = (int) xi; i < npontos; i++) {
			x = x + delta;
			deriv = 2 * a * x + b;
			if(deriv <= 0 && deriv0 > 0) {
				System.out.printf("M�ximo %d: %f, com a derivada %f: \n", count++, x, deriv);
			}
			deriv0 = deriv;
		}
		if(count == 1) {
			System.out.println("A fun��o n�o tem m�ximos");
		}
		
		
	}
	// esta fun��o vai calcular a derivada, ou seja, quando a derivada apresenta uma mudan�a de sinal
	public static void minimos(double a, double b, double c, double xi, double xf, double npontos) {
		int count = 1;
		double deriv = 0, x = xi;
		double delta = (xf - xi) / (npontos - 1);
		double deriv0 = 2 * a * x + b;
		for(int  i = (int) xi; i < npontos; i++) {
			x = x + delta;
			deriv = 2 * a * x + b;
			if(deriv >= 0 && deriv0 < 0) {
				System.out.printf("M�nimo %d: %f, com a derivada %f: \n", count++, x, deriv);
			}
			deriv0 = deriv;
		}
		if(count == 1) {
			System.out.println("A fun��o n�o tem n�nimos");
		}
		
		
	}

}
