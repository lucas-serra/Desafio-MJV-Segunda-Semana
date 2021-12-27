package classe_path;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ClassePath {

	public static void main(String[] args) {
		
		Path path = FileSystems.getDefault().getPath("logs", "access.log");
		
		System.out.println(path);
		//retorna o diretório raiz caso tenha
		System.out.println(path.getRoot());
		//pega o diretório mais próximo ao raiz
		System.out.println(path.getParent());
		//verifica se é um caminho absoluto
		System.out.println(path.isAbsolute());
		//verifica se um caminho começa com a string passada
		System.out.println(path.startsWith("logs"));
		
	}
}
