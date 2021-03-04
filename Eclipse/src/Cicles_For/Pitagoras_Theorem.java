/*
 * Class 03.12.2020
 * Exercício 3.5 - Descobrir todas as soluções inteiras do teorema de pitágoras até 100
 * 
 */
package Cicles_For;

public class Pitagoras_Theorem {

	public static void main(String[] args) {
		
		for(int a = 1; a < 100; a++) {
			for(int b = 1; b < 100; b++) {
				int c = (int) Math.sqrt(a * a + b * b);
				if(c % Math.sqrt(a * a + b * b) == 0 && a < b) {
					System.out.printf("%d %d %d \n", a, b, c);
				}
			}
		}
		
		
	}

}
