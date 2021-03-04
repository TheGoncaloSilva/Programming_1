/*
 * Class 15.10.2020
 * Exerc�cio 1.13 - Dist�ncia entre duas localidades tendo em conta a escala
 * 
 */
package Classes;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance_Between_Villages {
	
	public static double Rounding(double distKM) {
		DecimalFormat df = new DecimalFormat("####.###");
		df.setRoundingMode(RoundingMode.UP);
		double rounded = Double.parseDouble(df.format(distKM));
		return rounded;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int X1 = 0;
		int Y1 = 0;
		int X2 = 0;
		int Y2 = 0;
		int ScaleCM = 1; //Escala dos centimetros
		int ScaleKM = 100; //Escala dos Quil�metros
		
		// 1) Ler os dados
		System.out.println("Bem-vindo ao programa para calcular a dist�ncia entre duas aldeias, tendo em conta a escala do mapa.");
		System.out.println(" ");
		
		// 2) Localidade A
		System.out.println("Em rela��o � Primeira Aldeia, introduza as coordenadas de acordo com as mensagens");
		System.out.println("Coordenada X: ");
		X1 = read.nextInt();
		System.out.println("Coordenada Y: ");
		Y1 = read.nextInt();
		
		// 3) Localidade B
		System.out.println("Em rela��o � Segunda Aldeia, introduza as coordenadas de acordo com as mensagens");
		System.out.println("Coordenada X: ");
		X2 = read.nextInt();
		System.out.println("Coordenada Y: ");
		Y2 = read.nextInt();
		// 4) Calcular dist�ncia em CM no mapa
		double DistX = Math.pow((X2 - X1),2);
		double DistY = Math.pow((Y2 - Y1),2);
		double DistCM = Math.sqrt((DistX + DistY));
		
		// 5) Usar a Escala
		double DistKM = (DistCM * ScaleKM) / ScaleCM;
		double Resultado = Rounding(DistKM);
		
		// 6) Mostrar o Resultado
		System.out.println("A dist�ncia em KM entre a localidade A e B � de: " + Resultado);

	}

}
