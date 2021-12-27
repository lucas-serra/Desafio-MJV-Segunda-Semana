package classe_path;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ClassePath {

	public static void main(String[] args) {
		
		Path path = FileSystems.getDefault().getPath("logs", "access.log");
		
		System.out.println(path);
		//retorna o diret�rio raiz caso tenha
		System.out.println(path.getRoot());
		//pega o diret�rio mais pr�ximo ao raiz
		System.out.println(path.getParent());
		//verifica se � um caminho absoluto
		System.out.println(path.isAbsolute());
		//verifica se um caminho come�a com a string passada
		System.out.println(path.startsWith("logs"));
		
	}
}
