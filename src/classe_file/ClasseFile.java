package classe_file;

import java.io.File;

public class ClasseFile {

	public static void main(String[] args) {
		File file = new File("D:\\PROJETOS\\aula_6\\Desafio-MJV-Segunda-Semana\\src\\classe_file\\texto.txt");
		
		if(file.exists()) {	
			//retorna true caso seja um arquivo
			if(file.isFile()) {
				//Obtem o nome do arquivo ou diret�rio
				System.out.println(file.getName() + " � um arquivo.");
				//Convers�o de um objeto File em um objeto Path e a obten��o do diret�rio raiz
				System.out.println("O diret�rio raiz do arquivo � " + file.toPath().getRoot());
				//Tamanho do arquivo
				System.out.println("O tamanho do arquivo � " + file.length() + " bytes.");				
			}
			//retorna true caso seja um diret�rio
			if(file.isDirectory()) {
				System.out.println(file.getName() + " � um diret�rio.");				
				System.out.println("O diret�rio raiz do diret�rio � " + file.toPath().getRoot());
			}
		}else {
			System.out.println("O elemento analisado n�o � um diret�rio ou arquivo v�lido.");
		}

	}

}
