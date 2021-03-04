/*
 * Class 05.01.2020
 * Exercício 9.4 - Indicar se uma String corresponde a um  dado padrão de matriculas
 * 
 */
package String;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class License_Plates_Verifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern, plate;
		int menu;
		veiculo[] carro = new veiculo[100];
		
		do {
			menu();
			menu = sc.nextInt();
			switch (menu){
				case 1: pattern = readPattern();plate = readPlate(pattern);System.out.println("Matrícula Portuguesa Válida \n");;break;
				case 2: carro = specs(carro);break;
				case 3: showCars(carro);break;
				default: break;
			}
		}while(menu != 0); 
		
	}
	public static void menu() {
		System.out.println("##### Matrículas Automóveis #####");
		System.out.println("# 1 - Verificador de matrículas #");
		System.out.println("# 2 - Introduzir Modelos        #");
		System.out.println("# 3 - Mostrar veículos          #");
		System.out.println("# 0 - Sair                      #");
		System.out.println("#################################");
	}
	
	public static String readPattern() {
		Scanner sc = new Scanner(System.in);
		String pattern;
		int aux = 0;
		do {
			if(aux != 0) {
				System.out.println("### Padrão Errado ###");
			}
			System.out.println("Padrão ->");
			pattern = sc.nextLine();
			aux++;
		}while(!checkPattern(pattern));
		
		return pattern;
	}
	
	public static String readPlate(String pattern) {
		Scanner sc = new Scanner(System.in);
		String plate;
		int aux = 0;
		do {
			if(aux != 0) {
				System.out.println("### Matrícula Errada ###");
			}
			System.out.println("Matrícula ->");
			plate = sc.nextLine();
			aux++;
		}while(!matchPattern(plate, pattern));		
		return plate;
	}
	
	public static boolean checkPattern(String pattern) {
		String pat1 = "AA-00-00";
		String pat2 = "00-AA-00";
		String pat3 = "00-00-AA";
		
		if(pattern.equals(pat1) || pattern.equals(pat2) || pattern.equals(pat3)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean matchPattern(String str, String pattern) {
		String plate = "";
		for(int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if(Character.isUpperCase(temp) || Character.isLowerCase(temp)) {
				plate += "A";
			}else if(Character.isDigit(temp)) {
				plate += "0";
			}else if(temp == '-') {
				plate += "-";
			}else {
				break;
			}

		}
		
		if(plate.equals(pattern)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static veiculo[] specs(veiculo[] carro) {
		
		Scanner sc = new Scanner(System.in);
		//int linhas = (int) Arrays.stream(carro).filter(Objects::nonNull).count();
		String decision = "Sim", temp;
		int linhas = 0;
		do {
			//Obrigatório
			carro[linhas] = new veiculo();
			
			carro[linhas].padrao = readPattern();
			
			carro[linhas].matricula = readPlate(carro[linhas].padrao);
			
			System.out.println("Marca do veículo ->");
			temp = sc.nextLine();
			carro[linhas].marca = temp;
			
			System.out.println("Modelo ->");
			temp = sc.nextLine();
			carro[linhas].modelo = temp;
			
			System.out.println("Ano ->");
			carro[linhas].ano = sc.nextInt();
			
			System.out.println("Deseja Introduzir outro veiculo? ");
			decision = sc.next();
			linhas++;
		}while(decision.equals("Sim"));
		
		return carro;
	}
	
	public static void showCars(veiculo[] carro) {
		Scanner sc = new Scanner(System.in);
		
		String pattern = readPattern();
		
		for(int i = 0; i < carro.length; i++) {
			if(carro[i].padrao.equals(pattern)) {
				System.out.printf("%s, %s, %d, %s", carro[i].marca, carro[i].modelo, carro[i].ano, carro[i].matricula);
			}
		}
	}

}

class veiculo{
	String marca, modelo, matricula, padrao;
	int ano;
}
