/*
 * Class 13.10.2020
 * Exercício 1.9 - Calcular Perimetro e Area de um retângulo
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
	    
	    /* 2) Calcular Área*/
	    int Area = B*H;
	    /* 2) Calcular Perímetro*/
	    int Perimetro = 2*B + 2*H;
	    
	    /* 3) Mostrar Valores Resultado*/
	    System.out.println("A área do seu retângulo é: " + Area);
	    System.out.println("O perímetro do seu retânuglo é: " + Perimetro);
	    
	    read.close();
	}

}
