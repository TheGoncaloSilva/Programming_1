package Classes_08;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sex;
		System.out.print("Sexo: ");
        sex = sc.nextLine();
        
        while (!sex.equals("M") && !sex.equals("F")) {
        	System.out.print("Inválido, insira outro: ");
            sex = sc.next();
        }
        /*
        while (sex == "Feminino" && sex != "Masculino" || sex == "Masculino" && sex != "Feminino") {
            System.out.print("Inválido, insira outro: ");
            sex = sc.next();
        }
*/
	}

}
