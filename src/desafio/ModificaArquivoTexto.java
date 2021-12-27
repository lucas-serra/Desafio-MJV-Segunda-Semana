package desafio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class ModificaArquivoTexto {
	public static void modificar(File file) {
		if (file.exists()) {
			if (file.isFile()) {
				int index = file.getName().lastIndexOf('.');
				String extensao = file.getName().substring(index + 1);
				if (extensao.equals("txt")) {
					Scanner entrada = new Scanner(System.in);
					System.out.println("Insira o texto que deseja salvar em seu arquivo");
					String resposta = entrada.nextLine();
					try {
						FileWriter arqTxt = new FileWriter(file.getPath());
						arqTxt.write(resposta + "\n");
						arqTxt.close();
						System.out.println("Arquivo modificado!");
					} catch (IOException e) {
						System.out.println("Não foi possível executar a operação.");
						e.printStackTrace();
					}
				} else {
					System.out.println("O arquivo não é um arquivo texto.");
				}
			} else {
				System.out.println("O elemento analisado não é um arquivo.");
			}
		} else {
			System.out.println("O elemento analisado não é um diretório ou arquivo válido.");
		}
	}

	public static void inserirLinha(File file) {

		if (file.exists()) {
			if (file.isFile()) {
				int index = file.getName().lastIndexOf('.');
				String extensao = file.getName().substring(index + 1);
				if (extensao.equals("txt")) {
					Scanner entrada = new Scanner(System.in);
					System.out.println("Insira o texto que deseja adicionar em seu arquivo");
					String resposta = entrada.nextLine();
					try {
						Writer arq = new BufferedWriter(new FileWriter(file.getPath(), true));
						arq.append(resposta + "\n");
						arq.close();
						System.out.println("Linha adicionada!");
					} catch (IOException e) {
						System.out.println("Não foi possível executar a operação.");
						e.printStackTrace();
					}
				} else {
					System.out.println("O arquivo não é um arquivo texto.");
				}
			} else {
				System.out.println("O elemento analisado não é um arquivo.");
			}
		} else {
			System.out.println("O elemento analisado não é um diretório ou arquivo válido.");
		}
	}
}
