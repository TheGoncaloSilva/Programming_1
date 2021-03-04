/*
 * Class 03.12.2020
 * Exercício 3.7 - Imprimir um retângulo com o símbolo *, com as dimensões pedidas pelo utilizador
 * 
 */
package Cicles_For;

import java.util.Scanner;

public class Imprimir_Triangulo_Revamped {

	public static void main(String[] args) {		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduza a largura do retângulo: ");
	int width = sc.nextInt();
	System.out.println("Introduza a altura do retângulo");
	int height = sc.nextInt();
	
	for(int l = 0; l < height; l++) {
		for(int c = 0; c < width; c++) {
			if(l != 0 && l != height - 2  || l != height - 2) {
				System.out.print("* ");
			}else {
				
			}
		}
		System.out.println();
	}

	}

}
