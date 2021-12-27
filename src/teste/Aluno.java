package teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Aluno {
	File file;
	String nome;
	String matricula;
	
	Aluno(String nome, String matricula){
		this.nome = nome;
		this.matricula = matricula;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public void preencheArquivo() {
		if(this.file.exists()) {
			if (file.isFile()) {
				try {
					FileWriter arqTxt = new FileWriter(file.getPath());
					arqTxt.write("Nome: " + this.nome + "\n");
					arqTxt.write("Matrícula: " + this.matricula + "\n");
					arqTxt.close();
					System.out.println("Arquivo do aluno preenchido com informações");
				} catch (IOException e) {
					System.out.println("Não foi possível executar a operação.");
					e.printStackTrace();
				}
			}
		}else {
			System.out.println("O arquivo aluno não existe.");
		}
	}
	
	
}
/*private String nome;
private String sobreNome;
private static String nomeArquivo;
private static String nomeDiretorio;

File diretorio= new File("src/teste",nomeDiretorio);


public String getNomeDiretorio() {
	return nomeDiretorio;
}




public void setNomeDiretorio(String nomeDiretorio) {
	Aluno.nomeDiretorio = nomeDiretorio;
}




public String getNomeArquivo() {
	return nomeArquivo;
}




public void setNomeArquivo(String nomeArquivo) {
	Aluno.nomeArquivo = nomeArquivo;
}



public String getNome() {
	return nome;
}




public void setNome(String nome) {
	this.nome = nome;
}




public String getSobreNome() {
	return sobreNome;
}




public void setSobreNome(String sobreNome) {
	this.sobreNome = sobreNome;
}




public Aluno() {

}


public void criandoDiretorio() {

	
	
	if(diretorio.exists()==true) {
		System.out.println("O arquivo ja existe");
	}else {
	
	diretorio.mkdir();
	
	}
}

public static void criandoArquivo() {
	
	
}
*/