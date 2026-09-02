# Aprendendo Java

## Aula 1 — Primeiro programa

O arquivo `src/Main.java` contém o ponto de entrada do programa:

```java
public static void main(String[] args)
```

Tudo que estiver dentro desse método é executado quando o programa inicia.

### Executar pelo terminal

Na raiz do projeto, execute:

```powershell
javac -d out src/Main.java
java -cp out Main
```

`javac` transforma o código Java em bytecode e `java` executa o programa.

### Desafio

Altere a mensagem para mostrar, em linhas separadas:

1. Seu nome;
2. A cidade onde mora;
3. Uma meta para aprender Java.

Use um `System.out.println(...)` para cada linha.
