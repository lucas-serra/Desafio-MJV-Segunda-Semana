# Desafio Classes

Este repositório tem o objetivo de esclarecer a utilização de algumas classes da linguagem JAVA. Destas classes o file, path e paths têm a função de criar, organizar e verificar a disposição de arquivos dentro de pastas.

## Autores

- [Daniella Magalhães](https://github.com/DaniellaMagalhaesSiqueira)
- [Emerson Luiz](https://github.com/emerge8)
- [Juliana Oliveira](https://github.com/JuOliver)
- [Lucas Serra](https://github.com/lucas-serra)
- [Matheus Alencar](https://github.com/matlencar)
- [Patricia Sprovieri](https://github.com/patyspro)
- [Stefani Barros](https://github.com/ste-fani)

## Classe File
A classe File contém vários métodos para trabalhar com o nome do caminho, excluindo e renomeando arquivos, criando novos diretórios, listando o conteúdo de um diretório e determinando vários atributos comuns de arquivos e diretórios.

## Classe Path
A classe Path inclui vários métodos que podem ser usados ​​para obter informações sobre o caminho, acessar elementos do caminho, converter o caminho em outras formas ou extrair partes de um caminho. Também existem métodos para combinar a string do caminho e métodos para remover redundâncias em um caminho.

## Classe Paths
A classe Paths contém métodos estáticos para converter string em um caminho ou URI em caminho.

## Diferenças encontradas entre as classes File e Path

### java.io.File
A classe File é uma representação abstrata de nomes de caminho de arquivo e diretório, suas instâncias são imutáveis, ou seja, uma vez criadas, o caminho abstrato criado nunca será alterado.

### java.nio.file.Path
Path também cria um objeto que pode ser usado para localizar um arquivo em um sistema de arquivos. Da mesma forma, ele pode realizar todas as operações que podem ser feitas com a classe File, mas ao invés de usar um construtor, cria-se uma instância utilizando o método estático ``` java.nio.file.Paths.get() ```


[Ler mais](https://github.com/lucas-serra/Desafio-MJV-Segunda-Semana/tree/main/src)

## Como contribuir com este repositório
1. Na página do repositório clique em [Issues](https://github.com/patyspro/challengemjv/issues)
2. Encontre a área escrita ``` New Issue ```
3. Informe um título e descrever a sua contribuição.
4. Clique em ``` Submit new issue ```
## Referências

- [Java.io.File Class in Java](https://www.geeksforgeeks.org/file-class-in-java/)
- [Path Operations](https://docs.oracle.com/javase/tutorial/essential/io/pathOps.html)
- [java.nio.file.Paths Class in Java](https://www.geeksforgeeks.org/java-nio-file-paths-class-in-java/)
- [Java - Path vs File](https://www.baeldung.com/java-path-vs-file)