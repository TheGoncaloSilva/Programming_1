/*
 * Class 03.11.2020
 * Exercício 3.2 - Imprimirn a tabuada de um número entre 1 e 99
 * 
 */
package Cicles_For;

import java.util.Scanner;

public class multiplication_table {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int N = 0, aux = 0;
		String input;
		
		while (aux == 0) {
			System.out.println("Introduza um valor entre 0<N<100 para a tabuada");
			input = Sc.nextLine();
		    
		    try {
		    	// 1) Verificar se o valor é inteiro
		    	Integer.parseInt(input);
		    	N = Integer.parseInt(input);
		    	if(N > 0 && N <100) {
		    		aux++;	
		    	}else {
		    		System.out.println("Por favor introduza um valor entre 0 e 100");
		    	}
		    	
		    }catch(NumberFormatException e) {
		    	// 2) Avisar se o valor não for inteiro
		    	System.out.println("Por favor introduza um valor inteiro");
		    }

		}
		System.out.println("-------------------");
		System.out.println("|  Tabuada dos " + N + "  |");
		System.out.println("-------------------");
		for(int i = 1; i <= 10; i++) {
			System.out.println("|  " + N +" x " + i + "  |  " + (N + i) +"  | ");
		}

	}

}
