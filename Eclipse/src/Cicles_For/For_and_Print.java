/*
 * Class 03.11.2020
 * Exercício 3.1 - Imprimir 10 vezes uma drase e depois pedir ao utilizador o número de vezes para a voltar a imprimir
 * 
 */
package Cicles_For;

import java.util.Scanner;

public class For_and_Print {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int times = 0, aux = 0;
		String input;
		
		while (aux == 0) {
			System.out.println("Introduza o número de vezes para repetir o programa");
			input = Sc.nextLine();
		    
		    try {
		    	// 1) Verificar se o valor é inteiro
		    	Integer.parseInt(input);
		    	aux++;
		    	times = Integer.parseInt(input);
		    }catch(NumberFormatException e) {
		    	// 2) Avisar se o valor não for inteiro
		    	System.out.println("Por favor introduza um valor inteiro");
		    }

		}
		// 3) Imprimir a frase
		for (int i = 0; i < times; i++) {
			System.out.println("P1 é fixe!");
		}
		
	}

}
