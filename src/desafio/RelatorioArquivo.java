package desafio;

import java.io.File;

public class RelatorioArquivo {
	public static void exibirRelatorio(File file) {
		if(file.exists()) {	
			//retorna true caso seja um arquivo
			if(file.isFile()) {
				//Obtem o nome do arquivo ou diretório
				System.out.println(file.getName() + " é um arquivo.");
				//Conversão de um objeto File em um objeto Path e a obtenção do diretório raiz
				System.out.println("O diretório raiz do arquivo é " + file.toPath().getRoot());
				//Tamanho do arquivo
				System.out.println("O tamanho do arquivo é " + file.length() + " bytes.");				
			}
			//retorna true caso seja um diretório
			if(file.isDirectory()) {
				System.out.println(file.getName() + " é um diretório.");				
				System.out.println("O diretório raiz do diretório é " + file.toPath().getRoot());
			}
		}else {
			System.out.println("O elemento analisado não é um diretório ou arquivo válido.");
		}
		
	}
}
