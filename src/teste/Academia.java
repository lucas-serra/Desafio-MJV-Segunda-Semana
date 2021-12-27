package teste;

import java.io.File;
import java.util.Scanner;

import desafio.FabricaArquivoTexto;

public class Academia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cadastre um novo aluno!");
		System.out.println("Insira o nome do aluno: ");
		//recebe o nome do usuário
		String nome = entrada.nextLine();
		System.out.println("Insira o número de matrícula do aluno: ");
		String matricula = entrada.nextLine();
		Aluno a1 = new Aluno(nome, matricula);
		//cria um arquivo com o nome do aluno no diretório alunos e retorna um arquivo
		File aluno1 = FabricaArquivoTexto.criar(nome, "alunos");
		a1.setFile(aluno1);
		//preenche 	
		a1.preencheArquivo();
		
		
	}
	
	/*Scanner input = new Scanner(System.in);
	Set<Aluno> aluno= new HashSet<Aluno>();
	Aluno lucas= new Aluno();
	
	System.out.println("insira o nome do aluno: ");
	lucas.setNome(input.next());
	
	System.out.println("Insira o sobre nome do aluno: ");
	lucas.setSobreNome(input.next());
	
	File diretorio= new File("src/teste","Diretorio");
	diretorio.mkdir();
	
	lucas.setNomeArquivo(lucas.getNome().concat(lucas.getSobreNome()).concat(".txt"));
	File file = new File(diretorio, lucas.getNomeArquivo());
	
	System.out.println("O arquivo existe?"+file.exists());
	
	if(file.exists()==true) {
		System.out.println("O arquivo ja existe");
	}else {
	
	file.createNewFile();
	input.close();
	
	}
	
	
	Path path = Paths.get(file.toURI());
	System.out.print(path+" é a URI do arquivo "+path.getFileName());
	
	aluno.add(lucas);
	
	
	*/
	
	
	/*Scanner input = new Scanner(System.in);
		Set<Aluno> aluno= new HashSet<Aluno>();
		String nome;
		String sobreNome;
		
		System.out.println("insira o nome do aluno: ");
		nome= input.next().toLowerCase();
		
		System.out.println("Insira o sobre nome do aluno: ");
		sobreNome=input.next().toLowerCase();
		
		File diretorio= new File("src/teste","Diretorio");
		diretorio.mkdir();
		
		nome= nome.concat("_").concat(sobreNome).concat(".txt");
		File file = new File(diretorio, nome);
		
		file.createNewFile();
		input.close();
		
		
		System.out.println("O arquivo existe?"+file.exists());
		
		
		
		Path path = Paths.get(file.toURI());
		System.out.print(path+" é a URI do arquivo "+path.getFileName());
		
		
		
		
		
		Writer arq = new BufferedWriter(new FileWriter(file.getPath(), true));
            arq.append("\n");
            arq.close();
            System.out.println("Linha adicionada!");
		*/
}
