/*
 * Class 03.01.2020
 * Exercício 8.3 - Completar o programa DoStats.java
 * 
 */
package Classes_08;

import java.util.Scanner;

public class DoStats {
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Cria um registo de estatisticas:
	    Statistics xstat = new Statistics();

	    // Enquanto houver um valor para ler:
	    while (sc.hasNextDouble()) {
	      // LÃª um valor:
	      double x = sc.nextDouble();
	      // Atualiza o registo de estatisticas:
	      updateStats(xstat, x);
	    }

	    // Escreve resultados:
	    System.out.printf("numero de valores = %d\n", xstat.num);
	    System.out.printf("soma dos valores = %f\n", xstat.sum);
	    System.out.printf("soma dos quadrados = %f\n", xstat.sum2);
	    if (xstat.num > 0) {
	      System.out.printf("min = %f\n", xstat.min);
	      System.out.printf("max = %f\n", xstat.max);
	      System.out.printf("média = %f\n", mean(xstat));
	      System.out.printf("variancia = %f\n", variance(xstat));
	    } else {
	      System.out.printf("Lista vazia!");
	    }
	  }
		//o scanner está global, ou seja precisamos de apanhar os valores do scanner e usá-lo no cálculo das estatísticas
	  // Definir funções updateStats, mean e variance!
	public static void updateStats(Statistics xstat, double x) {
		if(x > xstat.max) {
			xstat.max = x;
		}
	}
	
	public static double mean(Statistics xstat) {
		return 0;
		
	}
	
	public static double variance(Statistics xstat) {
		return 0;
		
	}
		
	}
	// Definir classe Statistics
	class Statistics{
		double num, sum, sum2, min, max;
	}
