/*
 * Class 17.11.2020
 * Exercício 6.1 - Introdução a Arrays
 * 
 */
package Arrays;

import java.util.Scanner;

public class Array_Introduction {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int size = 1, out = 0;
		String input;
		
		while(out == 0) {
		System.out.println("Quantos números deseja introduzir?");
		input = sc.nextLine();
		    try {
		    	// 1) Verificar se o valor é inteiro
		    	Integer.parseInt(input);
		    	size = Integer.parseInt(input);
		    	out++;
		    }catch(NumberFormatException e) {
		    	// 2) Avisar se o valor não for inteiro
		    	System.out.println("Por favor introduza um valor inteiro");
		    }
		}

		int[] savenumber = new int[size];
		int aux = 0;
		
		while(aux < size) {
			System.out.printf("Introduza o número para a posicão %d \n", aux+1);
			input = sc.nextLine();
				try {
			    	// 1) Verificar se o valor é inteiro
			    	Integer.parseInt(input);
			    	savenumber[aux] = Integer.parseInt(input);	  
			    	aux++;
			    }catch(NumberFormatException e) {
			    	// 2) Avisar se o valor não for inteiro
			    	System.out.println("Por favor introduza um valor inteiro");
			    }
		}
		
		for(int i = 0; i < size; i++) {
			System.out.printf("Posição %d: %d \n", i+1, savenumber[i]);

		}

	}

}
