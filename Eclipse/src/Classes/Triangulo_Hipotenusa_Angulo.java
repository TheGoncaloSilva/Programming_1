/*
 * Class 15.10.2020
 * Exercício 1.14 - Calcular a Hipotenusa e o Ângulo tendo em conta o valor dos catetos
 * 
 */
package Classes;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangulo_Hipotenusa_Angulo {
	
	public static double Rounding(double distKM) {
		DecimalFormat df = new DecimalFormat("####.##");
		df.setRoundingMode(RoundingMode.UP);
		double rounded = Double.parseDouble(df.format(distKM));
		return rounded;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int SideA = 0;
		int SideB = 0;
		double Hypotenuse = 0;
		double Degrees = 0;
		
		// 1) Recolher os dados
		System.out.println("Introduza o valor do Cateto A: ");
		SideA = read.nextInt();
		System.out.println("Introduza o valor do Cateto B: ");
		SideB = read.nextInt();
		
		// 2) Calcular o valor da Hipotenusa
		double APB = Math.pow(SideA, 2) + Math.pow(SideB, 2);
		Hypotenuse = Math.sqrt(APB);
		
		// 3) Calcular o valor dos graus
		double RSideA = Math.toRadians(SideA);
		double RHypotenuse = Math.toRadians(Hypotenuse);
		Degrees = Math.acos(RSideA / RHypotenuse);
		double CalcDegrees = (Degrees * 57.3)/1;
		
		// 4) Arredondar o valor da hipotenusa e do ângulo e mostrar os dados
		Hypotenuse = Rounding(Math.sqrt(APB));
		System.out.println("Os valores pedidos deste Triângulo Retângulo são: ");
		System.out.println("Hipotenusa: " + Hypotenuse);
		System.out.println("Ângulo A: " + Rounding(CalcDegrees));
	
	}

}
