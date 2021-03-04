/*
 * Class 05.01.2020
 * Exercício 9.1 - Ler uma frase do teclado e calcular informação acerca dela
 * 
 */
package String;

import java.util.Scanner;

public class Operate_Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Análose de uma frase");
		System.out.print("Frase de entrada ->");
		String text = sc.nextLine();
		int upper = 0, lower = 0, nums = 0;
		
		for(int i = 0; i < text.length(); i++) {
			char temp = text.charAt(i);
			if(Character.isUpperCase(temp)) {
				upper++;
			}else if(Character.isLowerCase(temp)) {
				lower++;
			}else if(Character.isDigit(temp)) {
				nums++;
			}
		}
		int vowel = 0, consonant = 0;
		for(int i = 0; i < text.length(); i++) {
			char temp = text.charAt(i);
			if(isVowel(temp)) {
				vowel++;
			}
			if(isConsonant(temp)) {
				consonant++;
			}
		}
		
		
		
		System.out.println("Número de caracteres minúsculos -> " + lower);
		System.out.println("Número de caracteres maiúsculos -> " + upper);
		System.out.println("Número de caracteres numéricos -> " + nums);
		System.out.println();
		System.out.println("Número de vogais -> " + vowel);
		System.out.println("Número de consoantes -> " + consonant);
		

	}
	public static boolean isVowel(char c) {
		 return "AEIOUaeiou".indexOf(c) != -1;
		 
		 /*Alternativa
		  * String vowels = "aeiouAEIOU";
    		return vowels.contains(c);
		  */
	}
	
	public static boolean isConsonant(char c) {
		return "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(c) != -1;
		
		/* Outra alternativa
		 *  String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
    		return cons.contains(c);
		 */
	}

}
