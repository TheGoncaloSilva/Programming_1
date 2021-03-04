/*
 * Class 17.11.2020
 * Exerc�cio 6.3 - Menu com opera��es de uma sequ�ncia
 * 
 */
package Arrays;

import java.util.Scanner;

public class Operations_with_sequences {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int[] sequence = new int [49];
		int option = 0;
		
		String input1;
		
		while(option != 10) {	
		PrintMenu();
		input1 = sc.nextLine();
			try {
		    	// 1) Verificar se o valor � inteiro
		    	Integer.parseInt(input1);
			    option = Integer.parseInt(input1);
			    switch(option) {
			    case 1:PrintSequence(sequence);break;
			    case 2:sequence = WriteSequence();break;
			    case 3:MaxNumber(sequence);break;
			    case 4:MinNumber(sequence);break;
			    case 5:Average(sequence);break;
			    case 6:CheckEven(sequence);break;
			    case 10:;break;
			    default: System.out.println("### Escolha um valor correspondente com a escolha no menu ### \n");
			    }
		    }catch(NumberFormatException e) {
		    	// 2) Avisar se o valor n�o for inteiro
		    	System.out.println("### Por favor introduza um valor inteiro ###");
		    }
		}
	
	}
	public static void PrintMenu() {
		System.out.println(" 1 - Ler uma sequ�ncia de n�meros inteiros");
		System.out.println(" 2 - Escrever a sequ�ncia");
		System.out.println(" 3 - Calcular o m�ximo da sequ�ncia");
		System.out.println(" 4 - Calcular o m�nimo da sequ�ncia");
		System.out.println(" 5 - Calcular a m�dia da sequ�ncia");
		System.out.println(" 6 - Detetar se � uma sequ�ncia s� constitu�da por n�meros pares");
		System.out.println("10 - Terminar o programa \n");
	}
	public static void PrintSequence(int[] seq) {
		if(seq[0] != 0) {
			for(int i = 0; i < seq.length; i++) {
				if(seq[i] != 0)System.out.println(seq[i]);
			}
		}else {
			System.out.println("### Sequ�ncia ainda n�o definida ### \n");
		}
	}
	public static int[] WriteSequence() {
		Scanner sc2 = new Scanner(System.in);
		int[] seq = new int[49];
		int number = 1, aux = 0;
		String input2;
		
		while(number > 0 && aux < 50) {
			System.out.printf("Digite o n�mero que pretende inserir (Pos %d): \n", aux);
			input2 = sc2.nextLine();
			    try {
			    	// 1) Verificar se o valor � inteiro
			    	Integer.parseInt(input2);
			    	number = Integer.parseInt(input2);
				    	if(number > 0) {
				    	seq[aux] = Integer.parseInt(input2);
				    	aux++;
				    	}
			    }catch(NumberFormatException e) {
			    	// 2) Avisar se o valor n�o for inteiro
			    	System.out.println("### Por favor introduza um valor inteiro ### \n");
			    }
			}
		return seq;
	}
	public static void MaxNumber(int[] seq ) {
		int max = seq[0];
		for(int i = 1; i < seq.length; i++) {
			if(seq[i] > max && seq[i] != 0) max = seq[i];
		}
		System.out.printf("O m�ximo �: %d \n", max);
	}
	public static void MinNumber(int[] seq ) {
		int min = seq[0];
		for(int i = 1; i < seq.length; i++) {
			if(seq[i] < min && seq[i] != 0) min = seq[i];
		}
		System.out.printf("O m�nimo �: %d \n", min);
	}
	public static void Average(int[] seq ) {
		int count = 0, sum = 0;
		double average;
		for(int i = 0; i < seq.length; i++) {
			if(seq[i] != 0) {
				count++;
				sum = sum + seq[i];
			}
		}
		average = sum / count;
		System.out.printf("A m�dia �: %f3.1 \n", average);
	}
	public static void CheckEven(int[] seq) {
		boolean check = true;
		int count = 0;
		
		while(count < seq.length && check == true) {
			if(seq[count] % 2 != 0) {
				check = false;
			}
			count++;
		}
		if(check) {
			System.out.println("A sequ�ncia � composta inteiramente por n�meros pares  \n");
		}else {
			System.out.println("A sequ�ncia cont�m n�meros �mpares  \n");
		}
		
	}
}
