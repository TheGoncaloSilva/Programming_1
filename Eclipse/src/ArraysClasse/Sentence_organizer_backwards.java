/*
 * Class 14.01.2020
 * Exercício 11.1 - Ler frases do teclado e escrevê-las em ordem contrário, de formato invertido
 * 
 */
package ArraysClasse;

import java.util.Scanner;

public class Sentence_organizer_backwards {
	public static int size = 0;

	public static void main(String[] args) {
		
		String[] frases = lerFrases();
		escreverFrases(frases);
		
	}
	
	public static String[] lerFrases() {
		Scanner sc = new Scanner(System.in);
		String[] frases = new String[10];
		int aux = 0;
		String frase;
		
		do {
			System.out.printf("Frase %s: ", (aux + 1));
			frase = sc.nextLine();
			
			if(!frase.equals("fim")) {
				frases[aux] = frase; 
				aux++;
			}
		}while(aux < 10 && !frase.equals("fim"));
		size = aux;
		return frases;
	}
	
	public static void escreverFrases(String[] frases) {
		System.out.println("Resultado:");
		for(int t = (size - 1); t >= 0 ; t--) {
			for(int w = (frases[t].length() - 1); w >= 0; w--) {
				char temp = frases[t].charAt(w);
				System.out.print(temp);
			}
			System.out.println();
		}
	}

}
