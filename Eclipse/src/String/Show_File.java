package String;

import java.io.File;
import java.util.Scanner;

public class Show_File {

	public static void main(String[] args) {
		File fin = new File(readfile());
		
		//String content = fin.toString(new File("file.txt"), );//Charsets.UTF_8);

	}
	
	public static String readfile() {
		Scanner sc = new Scanner(System.in);
		int aux = 0;
		String filename = "";
		
		while(aux == 0) {
			System.out.println("Introduza o caminho do ficheiro");
			filename = sc.nextLine();
			
			File fin = new File(filename); // Primeiro passo - associar um objeto File com o nome do ficheiro
			// A classe File permite ver e testar propriedades dos ficheiros, n√£o os abre!
		        
			if (fin.exists()) {
				if(fin.isFile()) {
					 if (fin.canRead()) {
					        System.out.println("Ficheiro v·lido");
					        aux++;
				        }else {
				            System.out.println("ERRO: ficheiro " + filename + " n„o pode ser lido!");
				            System.exit(4);
				        }
				}else {
		            System.out.println("ERRO: ficheiro " + filename + " n„o È um ficheiro!");
		            System.exit(3);
				}
			}else {
				System.out.println("ERRO: ficheiro " + filename + " n„o existe!");
	            System.exit(2);
			}
			
		}
		return filename;
	}

}
