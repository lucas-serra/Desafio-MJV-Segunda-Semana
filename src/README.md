# Power Classes

## Menu

- [Classe File](#classe-file)
- [Classe Path](#classe-path)
- [Classe Paths](#classe-paths)

## Classe File (Pesquisa):

### Descrição:

A classe java.io.File destina-se a obter informações sobre o arquivo e não sobre seu conteúdo. Portanto alguns exemplos do que podemos obter com essa classe
são: se o arquivo existe, se é possível lê-lo, se é de fato um arquivo, etc.

### Alternativas de instanciação de objetos com contrutor ou metódos singleton:

Arquivo teste [ArquivoPrincipal](classes/file/ArquivoPrincipal.java)
na construção de um objeto file podemos passar o parâmetro path (uma String) que se trata do caminho do arquivo.

```
File arquivo = new File ("caminho do arquivo");
System.out.println(arq.exists());
```

Iniciando o trecho de código acima no método main com um caminho válido de um arquivo existente obtemos o retorno true no console.

### Métodos mais utilizados destacando o seu contrato (tipo retorno + nome + parâmetros):

O método no trecho tem o seguinte contrato: public boolean exists
Ou seja, temos um método público podendo ser acessado fora da classe que retorna um boolean que tem um nome de exists não recebendo nenhum parâmetro.

```
File arq = new File("D:\\PROJETOS\\MJV_JAVA\\aulas\\aula_6\\src\\desafio\\texto.txt");
		File diretorio = new File ("D:\\PROJETOS\\MJV_JAVA\\aulas\\aula_6\\src\\desafio\\);

		System.out.println(arq.exists());//se houver arquivo
		System.out.println(arq.getPath());//retorna o caminho do arquivo
		System.out.println(arq.length());//retorna a quantidade de bytes do arquivo
		System.out.println(arq.isFile());//verifica se é um arquivo
		System.out.println(arq.isDirectory());//verifica se é um diretório

		System.out.println(diretorio.isDirectory());
```

Nesse último trecho da classe File temos outros testes realizados no nosso objeto arq e no objeto diretorio criado logo depois.
Destacando o método de nome getPath temos o seguinte contrato: é público, retorna uma String e não recebe parâmetros. Esse método,
segundo a documentação, converte seu caminho para uma string, esse retorno usa o caractere padrão para separação de nomes do diretório.
O trecho acima nos daria um resultado para o cenário de ter no mesmo diretorio um arquivo chamado texto.txt com 22 caracteres gravados nele:

- true
- D:\\PROJETOS\\MJV_JAVA\\aulas\\aula_6\\src\\desafio\\texto.txt
- 22
- true
- false
- true

Como podemos observar no método isDirectory a diferença entre o objeto arq e o objeto diretorio é apenas o nome do arquivo.
O método é público e retorna um booleano que verifica se o objeto é um diretório e não recebe parâmetros.

Parecido com esse o método isFile verifica se o objeto criado é um arquivo, retorna um booleano e não recebe parâmetros.

### Método sobrecarregado:

Nessa classe o método createTempFile é um método sobrecarregado. Em sua primeira assinatura (ou contrato) temos um método estático
o retorno um tipo File e como parâmetros um prefixo e um sufixo ambos Strings para gerar seu nome. Na sua sobrecarga temos um método
estático que também retorna um File, mas recebe três parâmetros: prefixo e sufixo ambos Strings e um File que se trata do diretório
em que será criado o arquivo temporário.

## Classe Path

### Descrição:

A classe Path inclui vários métodos que podem ser usados ​​para obter informações sobre o caminho, acessar elementos do caminho, converter o caminho em outras formas ou extrair partes de um caminho. Também existem métodos para combinar a string do caminho e métodos para remover redundâncias em um caminho.

### Alternativas de instanciação de objetos com contrutor ou metódos singleton:

Uma instância Path contém as informações usadas para especificar a localização de um arquivo ou diretório. No momento em que é definido, o Path é fornecido com uma série de um ou mais nomes, um elemento raiz ou um nome de arquivo pode ser incluído, mas nenhum é necessário. O Path pode consistir em apenas um único diretório ou nome de arquivo.

- String
```
Path path = (Path)Paths.get("/usr/local/bin");
System.out.println(path);
```

- URI

```
Path path = Paths.get(URI.create("D:\\PROJETOS\\MJV_JAVA\\aulas\\aula_6\\src\\desafio\\texto.txt"));
System.out.println(path);
```

### Métodos mais utilizados destacando o seu contrato (tipo retorno + nome + parâmetros):
```
File diretorio = new File("src/classes/pathEPaths","Criando Diretorio");
diretorio.mkdir();
Path caminho = Paths.get(diretorio.toURI() );

System.out.println(caminho);
System.out.println ("getFileName:"+ path.getFileName ());
System.out.println("getParent:"+ path.getParent ());
System.out.println ("getRoot:"+ path.getRoot ());
```

Retorna:
- C:\Users\stefani\Desktop\devschool-mjv\grupo\challengemjv\src\classes\pathEPaths\Criando Diretorio
- getFileName:texto.txt
- getParent:C:\Users\stefa\Desktop\devschool-mjv\grupo\challengemjv\src\classes\pathEPaths
- getRoot:C:\


### Método sobrecarregado:

## Classe Paths

### Descrição:

A classe Paths contém métodos estáticos para converter string de caminho ou URI em caminho.

### Alternativas de instanciação de objetos com contrutor ou metódos singleton:
Possui duas formas de instanciar, uma utiliza strings e outra utilizando URI.

- String
```
Path path = (Path)Paths.get("/usr", "local", "bin");
System.out.println(path);
```

- URI

```
Path path = (Path)Paths.get("https://github.com/patyspro/challengemjv");
System.out.println(path);
```

### Métodos mais utilizados destacando o seu contrato (tipo retorno + nome + parâmetros):

#### Get (String first, String… more)

Este método converte uma string de caminho, ou uma sequência de strings que, quando unidas, formam uma string de caminho em um Path.

- Parâmetros:

1. First - parte inicial do Path.
2. More - strings extras para serem unidas ao Path.

- Throws:
    - InvalidPathException - se uma determinada string não pode ser convertida em um caminho.

###

- Criação do objeto:

```
Path path = (Path)Paths.get("/usr", "local", "bin");
System.out.println(path);
```

- Saída:

```
/ usr / local / bin
```

#### Get (URI uri)

Este método retorna um Path convertendo o Uri dado em um Path.

- Parâmetros:

1. URI - a ser convertido

- Throws:
    - IllegalArgumentException - se o parâmetro de URI não for apropriado
    - FileSystemNotFoundException - se o sistema de arquivos, que é identificado por URI, não existir
    - SecurityException - se o gerenciador de segurança negar acesso ao sistema de arquivos

###

- Criação do objeto:

```
String uribase = "https://github.com/patyspro/challengemjv";
URI uri = new URI(uribase);
Path path = (Path)Paths.get(uri);
System.out.println(path);
```

- Saída:

```
https://github.com/patyspro/challengemjv
```

### Método sobrecarregado
