/*
 * Class 03.11.2020
 * Exercício 3.3 - Escrever o fatorial de todos os números até ao valor introduzido pelo utilizador entre 1 e 10
 * 
 */
package Cicles_For;

import java.util.Scanner;

public class Number_Factorial {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int M = 0, aux = 0, sum = 1;
		String input;
		
		while (aux == 0) {
			System.out.println("Introduza um valor entre 1 e 10");
			input = Sc.nextLine();
		    
		    try {
		    	// 1) Verificar se o valor é inteiro
		    	Integer.parseInt(input);
		    	M = Integer.parseInt(input);
		    	if(M >= 1 && M <= 10) {
		    		aux++;	
		    	}else {
		    		System.out.println("Por favor introduza um valor entre 1 e 10");
		    	}
		    	
		    }catch(NumberFormatException e) {
		    	// 2) Avisar se o valor não for inteiro
		    	System.out.println("Por favor introduza um valor inteiro");
		    }

		}
		for(int i = 1; i <= M; i++){
			sum = sum * i;
			System.out.println(i + "! = " + sum);
		}

	}
}
