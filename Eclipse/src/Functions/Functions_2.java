/*
 * Class 10.11.2020
 * Exercício 5.1 - Testar Funções
 * 
 */
package Functions;

import java.util.Scanner;

public class Functions_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Testar funÃ§Ã£o sqr:
		System.out.printf("sqr(%f) = %f\n", 10.1, sqr(10.1));
		System.out.printf("sqr(%f) = %f\n", -2.0, sqr(-2.0));
		System.out.println();
		
		// Função f
		System.out.printf("Função f de (%d) = (%f)\n", 5, functionf(5));
		System.out.println();
		
		// Valor máximo real
		System.out.printf("O valor máximo entre (%f) e (%f) é: (%3.1f)\n", 3.1, 5.2, maxnumber(3.1,5.2));
		System.out.println();
		
		// Valor máximo inteiro
		System.out.printf("O valor máximo entre (%d) e (%d) é: (%d)\n", 3, 5, maxnumber(3,5));
		System.out.println();
		
		// Polinómio de grau 3
		System.out.printf("A solução do polinómio de grau (%d)x^3 + (%d)x^2 + (%d)x + (%d) é: (%f)\n", 1, 3, -6, -18, 5.6);
		System.out.println();
		
		// Calcular Fatorial
		System.out.printf("O valor fatorial de (%d) é: (%d)\n", 5, factorial(5));
		System.out.println();
		// Invoque as funÃ§Ãµes pedidas no enunciado para as testar:
		// Por exemplo, para testar func f (problema 5.2):
		//System.out.printf("f(%d) = %f\n", 5, f(5));

		// Testar as restantes funÃ§Ãµes desenvolvidas
		//System.out.printf("max(%f,%f) = %f\n", 3.1, 5.2, max(3.1, 5.2));
		//System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2));
		//int ano = getIntPos("Ano? ");
		//System.out.printf("ano = %d\n", ano);

		}
		/*
		 * sqr - calcula o quadrado de um nÃºmero (real).
		 */
		public static double sqr(double x) {
			double y;	// variavel para resultado
			y = x*x;	// calculo do resultado a partir dos dados
			return y;	// devolver o resultado
		}
		
		public static double functionf(double n) {
			double res = 1.0 / (1.0 + Math.pow(n, 2.0));
			return res;
		}
		
		public static double maxnumber(double n1, double n2) {
			System.out.println("Valor real");
			double res = Math.max(n1, n2);
			return res;
		}
		
		public static int maxnumber(int n1, int n2) {
			System.out.println("Valor inteiro");
			int res = Math.max(n1, n2);
			return res;
		}
		/*
		public static double poly3() {
			
		}
		*/
		
		public static int factorial(int n) {
			int fact = 1, fn1 = 2;
	        for (int i = 1; i <= n; i++) {
	            fn1 = fact;
	            fact = fact * i;
	        }
	        return fact/n == fn1 ? fact:-1;
		}
}
