/*
 * Class 03.12.2020
 * Exerc�cio 3.6 - Imprimir um ret�ngulo com o s�mbolo *, com as dimens�es pedidas pelo utilizador
 * 
 */
package Cicles_For;

import java.util.Scanner;

public class Imprimir_um_Tri�ngulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza a largura do ret�ngulo: ");
		int width = sc.nextInt();
		System.out.println("Introduza a altura do ret�ngulo");
		int height = sc.nextInt();
		
		for(int l = 0; l < height; l++) {
			for(int c = 0; c < width; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
