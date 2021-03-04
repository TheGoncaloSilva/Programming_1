/*
 * Class 17.11.2020
 * Exercício 6.2 - Ler uma sequência de números e descobrir quantas vezes existem números repetidos
 * 
 */
package Arrays;

import java.util.Scanner;

public class Read_Numbers_in_a_sequence {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] values = new int[99];
		int askednumber = 0, number = 0, aux = 0, out = 0, times = 0;
		String input1, input2;
		
		while(number >= 0 && aux < 99) {
			System.out.printf("Digite o número que pretende inserir (Pos %d): \n", aux);
			input1 = sc.nextLine();
			    try {
			    	// 1) Verificar se o valor é inteiro
			    	Integer.parseInt(input1);
			    	number = Integer.parseInt(input1);
				    	if(Integer.parseInt(input1) >= 0) {
				    	values[aux] = Integer.parseInt(input1);
				    	aux++;
				    	}
			    }catch(NumberFormatException e) {
			    	// 2) Avisar se o valor não for inteiro
			    	System.out.println("Por favor introduza um valor inteiro");
			    }
		}
		while(out == 0) {
		System.out.println("Qual é o número que pretende encontrar?");
		input2 = sc.nextLine();
		    try {
		    	// 1) Verificar se o valor é inteiro
		    	Integer.parseInt(input2);
		    	askednumber = Integer.parseInt(input2);
		    	out++;
		    }catch(NumberFormatException e) {
		    	// 2) Avisar se o valor não for inteiro
		    	System.out.println("Por favor introduza um valor inteiro");
		    }
		}
		for(int i = 0; i < values.length;i++) {
			if(values[i] == askednumber) {
				times++;
			}
		}
		System.out.printf("O número %d foi introduzido %d vezes", askednumber, times);
	}
}
