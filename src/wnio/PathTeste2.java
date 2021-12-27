package wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTeste2 {
    public static void main(String[] args) throws IOException {
/*      Files.createDirectory cria uma pasta/diretorio
        createDirectory não permite criar subPastas.
        faz uma tratativa de excecao com Files.notExists(),
        verifica a existencia do arquivo */

        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }

/*
        Em seguida temos Files.createDirectories cria diretorio e as suas
        subPastas. O createDirectories permite criar subPastas, mas não trata excecoes */
        Path subPastaPath = Paths.get("pasta/subPasta/subSubPasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);


/*      Adicionar arquivo na subSubPasta
        Files.createFile() cria um arquivo file.txt na subSubPasta criada acima */
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

/*      Copia conteudo do arquivo file.txt para file_renamed.txt
        O getParent() retorna uma String com o caminho do diretório pai (acima/anterior)
        ao do arquivo/diretório atual.
        StandardCopyOption.REPLACE_EXISTING serve para substituir um arquivo existente, se houver */

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
