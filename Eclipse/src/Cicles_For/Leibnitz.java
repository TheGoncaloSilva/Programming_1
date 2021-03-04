/*
 * Class 03.11.2020
 * Exercício 3.4 - Calcular a soma dos primeiros termos da série de Leibnitz
 * 
 */
package Cicles_For;

import java.util.Scanner;

public class Leibnitz {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int N = 0, aux = 0;
		double sum = 0.0;
		String input;
		
		while (aux == 0) {
			System.out.println("Introduza um valor para calcular a série de Leibnitz");
			input = Sc.nextLine();
		    
		    try {
		    	// 1) Verificar se o valor é inteiro
		    	Integer.parseInt(input);
		    	N = Integer.parseInt(input);
		    	aux++;		    	
		    }catch(NumberFormatException e) {
		    	// 2) Avisar se o valor não for inteiro
		    	System.out.println("Por favor introduza um valor inteiro");
		    }

		}
		for(int i = 1; i <= N; i ++) {
			sum = sum + Math.pow(-1.0, i + 1.0) / ((2.0 * i) - 1.0);
			
		}
		System.out.printf("Resultado: %18.15f\n",sum);
		System.out.println("Valor de Pi: " + Math.PI);

	}

}
