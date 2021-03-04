/*
 * Class 17.11.2020
 * Exercício 6.3 - Menu com operações de uma sequência
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
		    	// 1) Verificar se o valor é inteiro
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
		    	// 2) Avisar se o valor não for inteiro
		    	System.out.println("### Por favor introduza um valor inteiro ###");
		    }
		}
	
	}
	public static void PrintMenu() {
		System.out.println(" 1 - Ler uma sequência de números inteiros");
		System.out.println(" 2 - Escrever a sequência");
		System.out.println(" 3 - Calcular o máximo da sequência");
		System.out.println(" 4 - Calcular o mínimo da sequência");
		System.out.println(" 5 - Calcular a média da sequência");
		System.out.println(" 6 - Detetar se é uma sequência só constituída por números pares");
		System.out.println("10 - Terminar o programa \n");
	}
	public static void PrintSequence(int[] seq) {
		if(seq[0] != 0) {
			for(int i = 0; i < seq.length; i++) {
				if(seq[i] != 0)System.out.println(seq[i]);
			}
		}else {
			System.out.println("### Sequência ainda não definida ### \n");
		}
	}
	public static int[] WriteSequence() {
		Scanner sc2 = new Scanner(System.in);
		int[] seq = new int[49];
		int number = 1, aux = 0;
		String input2;
		
		while(number > 0 && aux < 50) {
			System.out.printf("Digite o número que pretende inserir (Pos %d): \n", aux);
			input2 = sc2.nextLine();
			    try {
			    	// 1) Verificar se o valor é inteiro
			    	Integer.parseInt(input2);
			    	number = Integer.parseInt(input2);
				    	if(number > 0) {
				    	seq[aux] = Integer.parseInt(input2);
				    	aux++;
				    	}
			    }catch(NumberFormatException e) {
			    	// 2) Avisar se o valor não for inteiro
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
		System.out.printf("O máximo é: %d \n", max);
	}
	public static void MinNumber(int[] seq ) {
		int min = seq[0];
		for(int i = 1; i < seq.length; i++) {
			if(seq[i] < min && seq[i] != 0) min = seq[i];
		}
		System.out.printf("O mínimo é: %d \n", min);
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
		System.out.printf("A média é: %f3.1 \n", average);
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
			System.out.println("A sequência é composta inteiramente por números pares  \n");
		}else {
			System.out.println("A sequência contém números ímpares  \n");
		}
		
	}
}
