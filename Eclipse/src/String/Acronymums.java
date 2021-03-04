/*
 * Class 05.01.2020
 * Exercício 9.2 - Guardar texto num array e devolver os acrónimos, quando pedido
 * 
 */
package String;

import java.util.Scanner;

public class Acronymums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] sentences = new String[100];
		int aux = 0;
		String temp;
		
		do {
			System.out.print("Frase de entrada ->");
			temp = sc.nextLine();
			if(temp != "") {
				sentences[aux] = temp;
				aux++;
			}
		}while(temp != "");
		
		for(int i = 0; i < aux; i++) {
			System.out.println("acronimo( " + sentences[i] + " ) -> " + returnAcro(sentences[i]) );
		}
		

	}
	
	public static String returnAcro(String text) {
		String upper = "";
		
		for(int i = 0; i < text.length(); i++) {
			char temp = text.charAt(i);
			if(Character.isUpperCase(temp)) {
				upper += temp;
			}
		}
		
		return upper;
	}

}
