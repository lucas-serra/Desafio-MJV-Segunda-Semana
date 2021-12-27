package desafio;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File arq = new File("D:\\PROJETOS\\desafio\\src\\desafio\\texto.txt");
		File dir = new File("D:\\PROJETOS\\desafio\\src\\desafio");
// Exibe um relatório do arquivo passado como parâmetro		
//		RelatorioArquivo.exibirRelatorio(arq);
//Modifica um arquivo passado como parâmetro (o arquivo é completamente substituído pela string passada)		
//		ModificaArquivoTexto.modificar(arq);
//Cria ou acessa um arquivo com o nome do arquivo (1º parâmetro) no diretório passado no 2º parâmetro)
//Caso o dirtório já exista ele cria o arquivo no diretório existente
		File aluno1 = FabricaArquivoTexto.criar("aluno1", "alunos");
//Insere uma linha no arquivo passado como parâmetro		
		ModificaArquivoTexto.inserirLinha(aluno1);
	}
}
