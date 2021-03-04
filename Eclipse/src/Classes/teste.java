/*
 * Day 03.12.2020
 * Exerc�cio 2.11 - Calcular as ra�zes de uma equa��o de 2� grau Ax^2 + BX + C = 0
 * 
 */
package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		 Scanner kb = new Scanner(System.in);

	        listaDir("."); // . diretorio atual

	        System.out.print("Ficheiro de entrada: ");
	        String nameIn = kb.nextLine();
	        
		File fin = new File(nameIn); // Primeiro passo - associar um objeto File com o nome do ficheiro
		// A classe File permite ver e testar propriedades dos ficheiros, não os abre!
	        
		if (!fin.exists()) {
	            System.out.println("ERRO: ficheiro " + nameIn + " não existe!");
	            System.exit(2);
	        }
	        if (fin.isDirectory()) {
	            System.out.println("Ficheiro " + nameIn + " is a directory!");
		    listaDir(nameIn);
	            System.exit(3);
	        }
	        if (!fin.canRead()) {
	            System.out.println("ERRO: ficheiro " + nameIn+ "não pode ser lido!");
	            System.exit(4);
	        }
	        System.out.println("Ficheiro válido!");

	        System.out.print("Ficheiro de saida: ");
	        String nameOut = kb.nextLine();
		
		// copia ficheiro de entrada para ficheiro de saida
		
	        File fout = new File(nameOut);
		
		/*
	        // Para LER um ficheiro, associa-o, através do objeto File, com a classe Scanner
		Scanner scf = new Scanner(fin);
	        
		int cont = 0;
	        // conta o numero de linhas do ficheiro
	        while(scf.hasNextLine()) {
	            cont++;
	            scf.nextLine();
	        }
	        // cria array com tamanho do nº de linhas
	        String[] linhas = new String[cont];

	        scf.close(); // fecha ficheiro
		
		// É preciso fechar e abrir de novo para começar nova leitura a partir do início
		// lê ficheiro para array
		        
		scf = new Scanner(fin);

	        for(int i = 0 ; i < cont ; i++) {
	            String s = scf.nextLine();
	            linhas[i] = s;
	        }
	        scf.close();
		
		// Para ESCREVER num ficheiro, associa-o, através do objeto File, com a classe PrintWriter
	        PrintWriter pw = new PrintWriter(fout); 

	        // escreve array com as linhas no ficheiro de escrita
	        for(int i = 0 ; i < cont ; i++) {
	            pw.println(linhas[i]);
	        }
		    
	        pw.printf("\n%10s \n%d\n", "Numero de linhas copiadas: ", cont);
	        pw.close();
	        // copiou os ficheiros
		
		// copia de novo e faz append!
		escreverFich(linhas, nameOut);*/
	    }
	    
	    // métodos que usam ficheiros devem ser declarados com throws IOException
	    public static void escreverFich(String[] linhas, String nameOut) throws IOException {
		 	
	        // Em lugar da classe File pode usar-se a classe FileWriter
	        //  que dá para abrir ficheiros em modo append.
	        PrintWriter pw = new PrintWriter(new FileWriter(nameOut, true)); // true, abre em modo append
		int cont = linhas.length;
	        // escreve array com as linhas no ficheiro de escrita
	        for(int i = 0 ; i < cont ; i++) {
	            pw.println(linhas[i]);
	        }
		    
	        pw.printf("\n%10s \n%d\n", "Numero de linhas copiadas: ", cont);
	        pw.close();
	    }
	    
	// lista diretório
	    public static void listaDir(String nomeDir) {
	        String[] lista = new String[100];
	        File fin1 = new File(nomeDir);
	        lista = fin1.list();   // devolve array de strings com nomes ficheiros
	        for (String n : lista) {
	            File f = new File(n);
	            System.out.printf("%-30s %5s\n", n, f.isDirectory()? "DIR":f.length());
	        }
	    }
	}

