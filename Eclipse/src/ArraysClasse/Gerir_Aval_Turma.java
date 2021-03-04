/*
 * Class 05.01.2020
 * Exerc�cio 11.4 - Gerir a avaia��o de uma turma
 * 
 */
package ArraysClasse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gerir_Aval_Turma {
public static int tCounter = 0;
public static boolean wCounter = false;
static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int choice = 0;
		Alunos[] student = null;
		int[] weight = {0, 0, 0};
		//listaDir("."); listar o diret�rio atual
		
		String values = "0|0|0|1|||0|1|0|||";
		String[] array = values.split("\\|",-1); 
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		
		do {
			menu();
			choice = sc.nextInt();
			switch(choice) {
			case 1: student = recordClass();break;
			case 2: searchStudent(student, weight);break;
			case 3: student = changeStudent(student, weight);break;
			case 4: showStudents(student, weight);break;
			case 5: showStuByOrder(student, weight);break;
			case 6: averageStudents(student, weight);break;
			case 7: bestStudent(student, weight);break;
			case 8: weight = testWeight();break;
			case 9: printFile(student, weight);break;
			case 10: carregaFile(); break;
			}
			
		}while(choice != 0);
		
		sc.close();
	}
	
	public static void menu() {
		System.out.println("\nGest�o de uma turma:");
		System.out.println("1 - Inserir informa��o da turma");
		System.out.println("2 - Mostrar informa��o de um aluno");
		System.out.println("3 - Alterar informa��o de um aluno");
		System.out.println("4 - Listar os alunos");
		System.out.println("5 - Listar os alunos ordenados por nota final");
		System.out.println("6 - M�dia das notas finais");
		System.out.println("7 - Melhor aluno");
		System.out.println("8 � Inserir pesos dos v�rios testes");
		System.out.println("9 - gravar dados dos alunos num ficheiro");
		System.out.println("10 - Carregar ficheiro");
		System.out.println("0 - Terminar o programa");
		System.out.println("Op��o?");
	}
	
	public static Alunos[] recordClass() {
		Alunos[] student = new Alunos[20];
		int aux = 0, mec = 0;
		tCounter = 0;
		
		do {
			System.out.println();
			System.out.print("N�mero Mecanogr�fico ->");
			mec = sc.nextInt();
			
			if(mec != 0) {
				student[aux] = new Alunos();
				student[aux].mec = mec;
				System.out.print("Nome do Aluno ->");
				student[aux].nome = sc.next();
				System.out.print("Nota do primeiro teste ->");
				student[aux].notas[0] = sc.nextInt();
				System.out.print("Nota do Segundo teste ->");
				student[aux].notas[1] = sc.nextInt();
				System.out.print("Nota do Terceiro teste ->");
				student[aux].notas[2] = sc.nextInt();
				tCounter++;
			}
			
			aux++;
		}while(aux < 20 && mec != 0);
		return student;
	}
	
	public static boolean studConditions(char x) {
		if(Character.isDigit(x)) {
			return false;
		}else{
			if(Character.isUpperCase(x) || Character.isLowerCase(x)) {
				return "AEIOUaeiou".indexOf(x) != 1;
			}
			return false;
		}
	}
	
	public static void showStudents(Alunos[] student, int[] weight) {
		if(tCounter > 0) {
			for(int i = 0; i < tCounter; i++) {
				imprimirResultados(student[i], weight);

			}
		}else {
			System.out.println("N�o existem turmas registadas");
		}
		
	}
	
	public static void showStuByOrder(Alunos[] student, int[] weight) {
		if(tCounter > 0) {
			Alunos[] temp = student;
		    for(int i = 0 ; i < tCounter -1 ; i++) {
		        for(int j = i+1 ; j < tCounter ; j++) {
		            if(student[i].notafim < student[j].notafim) { //ordem decrescente
		                    Alunos tmp = temp[i];
		                    temp[i] = temp[j];
		                    temp[j] = tmp;
		            }
		        }
		    }
			for(int i = 0; i < tCounter; i++) {
				imprimirResultados(temp[i], weight);
				
			}
		}else {
			System.out.println("N�o existem turmas registadas");
		}
		
	}
	
	public static void imprimirResultados(Alunos student, int[] weight) {
		student = notaFinal(student, weight);
		System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
		System.out.println("N�mero mecanogr�fico - " + student.mec);
		System.out.println("Nome do aluno - " + student.nome);
		System.out.printf("Notas dos 3 testes - %d, %d, %d \n", student.notas[0], student.notas[1], student.notas[2]);
		System.out.println("Nota final - " + student.notafim);
	}
	
	public static int[] testWeight() {
		int[] percentage = new int[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("Peso %d teste \n", i + 1);
			percentage[i] = sc.nextInt();
		}
		wCounter = true;
		return percentage;
	}
	
	public static void searchStudent(Alunos[] student, int[] weight) {
		System.out.print("Aluno para procurar ->");
		int mec = sc.nextInt();
		boolean aux = false;
		
		if(tCounter > 0) {
			for(int i = 0; i < tCounter; i++) {
				if(student[i].mec == mec) {
					imprimirResultados(student[i], weight);
					aux = true;
				}
					
				}
			if(!aux) {
				System.out.println("O aluno n�o existe");
			}
		}else {
			System.out.println("N�o existem turmas registadas");
		}
				
	}
	
	public static Alunos[] changeStudent(Alunos[] student, int[] weight) {
		System.out.print("Aluno para Alterar ->");
		int mec = sc.nextInt();
		boolean aux = false;
		
		if(tCounter > 0) {
			for(int i = 0; i < tCounter; i++) {
				if(student[i].mec == mec) {
					aux = true;
					imprimirResultados(student[i], weight);
					
					System.out.println("###Nova informa��o a introduzir ###");
					System.out.print("Nota do primeiro teste ->");
					student[i].notas[0] = sc.nextInt();
					System.out.print("Nota do Segundo teste ->");
					student[i].notas[1] = sc.nextInt();
					System.out.print("Nota do Terceiro teste ->");
					student[i].notas[2] = sc.nextInt();
					student[i] = notaFinal(student[i], weight);
				}
					
				}
			if(!aux) {
				System.out.println("O aluno n�o existe");
				if(tCounter < 20) {
					System.out.println("Introduza os dados para ser acrescentado um novo aluno");
					student[tCounter] = new Alunos();
					student[tCounter].mec = mec;
					System.out.print("Nome do Aluno ->");
					student[tCounter].nome = sc.next();
					System.out.print("Nota do primeiro teste ->");
					student[tCounter].notas[0] = sc.nextInt();
					System.out.print("Nota do Segundo teste ->");
					student[tCounter].notas[1] = sc.nextInt();
					System.out.print("Nota do Terceiro teste ->");
					student[tCounter].notas[2] = sc.nextInt();
					student[tCounter] = notaFinal(student[tCounter], weight);
					tCounter++;
				}
			}
		}else {
			System.out.println("N�o existem turmas registadas");
		}
		return student;
	}
	
	
	public static Alunos notaFinal(Alunos student, int[] weight) {
		double grade = 0.0;
		if(wCounter) {
			double t1 = (weight[0] * ((double) student.notas[0] / 20)) * 2;
			double t2 = (weight[1] * ((double) student.notas[1] / 20)) * 2;
			double t3 = (weight[2] * ((double) student.notas[2] / 20)) * 2;
			grade = (t1 + t2 + t3) / 10;
			student.notafim = grade;
			
		}
		return student;
	}
	
	public static void averageStudents(Alunos[] student, int[] weight) {
		double total = 0.0;
		for(int i = 0; i < tCounter; i++) {
			student[i] = notaFinal(student[i], weight);
			total += student[i].notafim;
		}
		double media = total / tCounter;
		
		System.out.printf("A m�dia da turma � -> %f \n", media);
	}
	
	public static void bestStudent(Alunos[] student, int[] weight) {
		double bestStudent = 0.0;
		int mec = 0;
		for(int i = 0; i < tCounter; i++) {
			student[i] = notaFinal(student[i], weight);
			System.out.println(student[i].notafim);
			if(student[i].notafim > bestStudent) {
				bestStudent = student[i].notafim;
				mec = student[i].mec;
			}	
		}
		
		for(int i = 0; i < tCounter; i++) {
			if(student[i].mec == mec) {
				imprimirResultados(student[i], weight);
			}		
		}
	}
	//necess�rio usar o throwsexception
	public static void printFile(Alunos[] student, int[] weight) throws IOException {
		if(tCounter > 0) {
			File fout = new File("./src/ArraysClasse/Files/Alunos.txt");
			//FileWriter fout = new FileWriter("./src/ArraysClasse/Files/Alunos.txt",true);
			PrintWriter pwf = new PrintWriter(fout);
			
			for(int i = 0; i < tCounter; i++) {
				student[i] = notaFinal(student[i], weight);
				pwf.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
				pwf.println("N�mero mecanogr�fico - " + student[i].mec);
				pwf.println("Nome do aluno - " + student[i].nome);
				pwf.printf("Notas dos 3 testes - %d, %d, %d \n", student[i].notas[0], student[i].notas[1], student[i].notas[2]);
				pwf.println("Nota final - " + student[i].notafim);
			}
			System.out.println("Dados garavados com sucesso");
			
			pwf.close();
		}else {
			System.out.println("Ficheiro n�o criado, pois n�o existem registos");
		}
	}
	
    public static void carregaFile() throws IOException { //listar o diret�rio atual, usado apenas para testes
    	File fin = new File("./src/ArraysClasse/Files/Alunos.txt");
    	Scanner fich = new Scanner(fin);
    	//System.out.println(fin.canRead() && fin.isFile());
    	while(fich.hasNextLine()) {
    		String line = fich.nextLine();
    		System.out.println(line);
    	}
    	
    	fich.close();
    }
	
    public static void listaDir(String nomeDir) { //listar o diret�rio atual, usado apenas para testes
        String[] lista;
        File fin1 = new File(nomeDir);
		if (fin1.isDirectory()){
		    lista = fin1.list();   // devolve array de strings com nomes ficheiro
		    for (String n : lista) {
			File f = new File(n);
			System.out.printf("%-30s %5s\n", n, f.isDirectory()? "DIR":f.length());
		    }
		}
    }   
    
}

class Alunos{
	int mec;
	String nome;
	int[] notas = new int[3];
	double notafim;
}


