package wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTeste2 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
//        excecao para verificar existencia de algum arquivo com este nome.
//        createDirectory não permite criar subPastas.
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
//        createDirectories permite criar subPastas, mas não trata excecoes
        Path subPastaPath = Paths.get("pasta/subPasta/subSubPasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);

//        Adicionar arquivo na subSubPasta
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

//        Copia conteudo do arquivo file.txt para file_renamed.txt
        Path source = filePath;
//        getParent() retorna uma String com o caminho do diretório pai (acima/anterior) ao do arquivo ou diretório atual
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
//        StandardCopyOption.REPLACE_EXISTING serve para substituir um arquivo existente, se houver
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
