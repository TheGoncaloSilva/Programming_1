/*
 * Class 27.10.2020
 * Exerc�cio 2.5 - Descobrir se 4 coordenadas formam um quadrado
 * https://engenhariade.software/questions/1728/como-verificar-se-4-pontos-formam-um-quadrado (Ajuda com a resolu��o
 */
package Decision;

import java.util.Scanner;

public class Find_the_square {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		// 1) Introduzir os dados
		System.out.println("Introduza o valor de X1: ");
		int xp1 = Sc.nextInt();
		System.out.println("Introduza o valor de Y1: ");
		int yp1 = Sc.nextInt();
		System.out.println("Introduza o valor de X2: ");
		int xp2 = Sc.nextInt();
		System.out.println("Introduza o valor de Y2: ");
		int yp2 = Sc.nextInt();
		System.out.println("Introduza o valor de X3: ");
		int xp3 = Sc.nextInt();
		System.out.println("Introduza o valor de Y3: ");
		int yp3 = Sc.nextInt();
		System.out.println("Introduza o valor de X4: ");
		int xp4 = Sc.nextInt();
		System.out.println("Introduza o valor de Y4: ");
		int yp4 = Sc.nextInt();
		// P1 = (xp1, yp1)
		// P2 = (xp2, yp2)
		// P3 = (xp3, yp3)
		// P4 = (xp4, yp4)
		
		// 2) Calcular se os pontos formam um quadrado
		// Vetor P1P3 = P3 - P1 = (X3 - X1, Y3 - Y1)
		//int xp1p3 = xp3 - xp1;
		//int yp1p3 = yp3 - yp1;
		
		// Vetor P2P4 = P4 - P2 = (X4 - X2, Y4 - Y2)
		//int xp2p4 = xp4 - xp2;
		//int yp2p4 = yp4 - yp2;
		
		//System.out.println(xp1p3 + "," + yp1p3);
		//System.out.println(xp2p4 + "," + yp2p4);
		
		// Dist�ncia P1P3
		double distp1p3 = Math.sqrt(Math.pow((xp3 - xp1), 2) + Math.pow((yp3 - yp1), 2));
		
		// Dist�ncia P2P4
		double distp2p4 = Math.sqrt(Math.pow((xp4 - xp2), 2) + Math.pow((yp4 - yp2), 2));
		
		if (distp1p3 == distp2p4) {
			System.out.println("Os Pontos inseridos formam um quadrado");
		}else {
			System.out.println("Os Pontos inseridos n�o formam um quadrado");
		}		
		
	}

}
