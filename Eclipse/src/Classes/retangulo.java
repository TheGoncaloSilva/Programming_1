/*
 * Class 13.10.2020
 * Exerc�cio 1.9 - Calcular Perimetro e Area de um ret�ngulo
 * 
 */
package Classes;

import java.util.Scanner;

public class retangulo {
		
		public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
			
		int B = 0;
		int H = 0;
		
		/* 1) Ler os dados*/
	    System.out.println("Comprimento do Retangulo: ");
	    B = read.nextInt();
	    System.out.println("Altura do Retangulo: ");
	    H = read.nextInt();
	    
	    /* 2) Calcular �rea*/
	    int Area = B*H;
	    /* 2) Calcular Per�metro*/
	    int Perimetro = 2*B + 2*H;
	    
	    /* 3) Mostrar Valores Resultado*/
	    System.out.println("A �rea do seu ret�ngulo �: " + Area);
	    System.out.println("O per�metro do seu ret�nuglo �: " + Perimetro);
	    
	    read.close();
	}

}
