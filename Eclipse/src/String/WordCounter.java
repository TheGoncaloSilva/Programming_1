/*
 * Class 05.01.2020
 * Exercício 9.3 - Contar as palavras que existem numa String
 * 
 */
package String;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Frase de entrada ->");
		String text = sc.nextLine();
	
	    String[] wordArray = text.trim().split("\\s+");
	    int wordCount = wordArray.length;

	    System.out.println("Nº de palavras = " + wordCount);
	    
	    sc.close();
	}

}
